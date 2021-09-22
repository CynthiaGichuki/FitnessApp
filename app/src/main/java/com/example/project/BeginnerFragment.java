package com.example.project;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BeginnerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeginnerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BeginnerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BeginnerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeginnerFragment newInstance(String param1, String param2) {
        BeginnerFragment fragment = new BeginnerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_beginner, container, false);


    View view = inflater.inflate(R.layout.fragment_beginner,
            container, false);

    ImageButton button = (ImageButton) view.findViewById(R.id.day1_img);
   ImageButton button1 = (ImageButton) view.findViewById(R.id.day2_img);
 ImageButton button2 = (ImageButton) view.findViewById(R.id.day3_img);
        ImageButton button3 = (ImageButton) view.findViewById(R.id.day4_img);
        ImageButton button4 = (ImageButton) view.findViewById(R.id.day5_img);
        ImageButton button5 = (ImageButton) view.findViewById(R.id.day6_img);
        ImageButton button6 = (ImageButton) view.findViewById(R.id.day7_img);

   button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
           Intent intent = new Intent(getActivity(), ExerciseActivity.class);
//           intent.putExtra("day1_img" ,button);
//           intent.putExtra()
           startActivity(intent);
        }
    });
   button1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent = new Intent(getActivity(), ExerciseActivity.class);
           startActivity(intent);

       }
   });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MeditationActivity.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ExerciseActivity.class);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ExerciseActivity.class);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ExerciseActivity.class);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MeditationActivity.class);
                startActivity(intent);

            }
        });

   return view;




}




}