package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video5;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.seekTo(1);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        VideoView videoView2 = findViewById(R.id.video_view2);
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.video2;
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);
        videoView2.seekTo(1);

        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);

        VideoView videoView3 = findViewById(R.id.video_view3);
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.plank;
        Uri uri3 = Uri.parse(videoPath3);
        videoView3.setVideoURI(uri3);
        videoView3.seekTo(4);

        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);



//        VideoView videoView3 = findViewById(R.id.video_view3);
//        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.video3;
//        Uri uri3 = Uri.parse(videoPath3);
//        videoView3.setVideoURI(uri3);
//        videoView3.seekTo(1);
//
//        MediaController mediaController3 = new MediaController(this);
//        videoView3.setMediaController(mediaController3);
//        mediaController3.setAnchorView(videoView3);
//
//
//        VideoView videoView4 = findViewById(R.id.video_view4);
//        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.plank;
//        Uri uri4 = Uri.parse(videoPath4);
//        videoView4.setVideoURI(uri4);
//        videoView4.seekTo(1);
//
//        MediaController mediaController4 = new MediaController(this);
//        videoView4.setMediaController(mediaController4);
//        mediaController4.setAnchorView(videoView4);

    }
}