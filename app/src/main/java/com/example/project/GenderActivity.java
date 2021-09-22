package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class GenderActivity extends AppCompatActivity {
    private RadioButton male;
    private RadioButton female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        male = findViewById(R.id.selectMale);
        female = findViewById(R.id.selectFemale);


    }



    public void gender(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.selectMale:
                if (checked)
                    Toast.makeText(GenderActivity.this,"Male",Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(GenderActivity.this, MainActivity2.class);
                startActivity(myIntent);
                    break;
            case R.id.selectFemale:
                if (checked)
                    Toast.makeText(GenderActivity.this,"Female",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (GenderActivity.this, MainActivity.class);
                startActivity(intent);
                    break;
        }
    }


}