package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    EditText registerFullName,registerEmail,registerPassword,registerConfirmPassword;
    Button registerUserButton,loginUserButton;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerFullName=findViewById(R.id.registerFName);
        registerEmail=findViewById(R.id.registerEmail);
        registerPassword=findViewById(R.id.registerPassword);
        registerConfirmPassword=findViewById(R.id.registerconfirmPassword);
        registerUserButton=findViewById(R.id.registerButton2);
        loginUserButton=findViewById(R.id.loginButton2);
        fAuth=FirebaseAuth.getInstance();

        registerUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName=registerFullName.getText().toString();
                String email=registerEmail.getText().toString();
                String password=registerPassword.getText().toString();
                String confpass=registerConfirmPassword.getText().toString();

                loginUserButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),Login.class));
                        finish();
                    }
                });

                if(fullName.isEmpty())
                {
                    registerFullName.setError("Full Name is Required");
                    return;
                }
                if(email.isEmpty())
                {
                    registerEmail.setError("Email Address is Required");
                    return;
                }
                if(password.isEmpty())
                {
                    registerPassword.setError("Password is Required");
                    return;
                }
                if(confpass.isEmpty())
                {
                    registerConfirmPassword.setError("Confirm Password is Required");
                    return;
                }
                if(!password.equals(confpass))
                {
                    registerConfirmPassword.setError("Passwords Do Not Match");
                    return;
                }
                Toast.makeText(Register.this,"Data Validated",Toast.LENGTH_SHORT).show();

                fAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        startActivity(new Intent(getApplicationContext(),GenderActivity.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Register.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
