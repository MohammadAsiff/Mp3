package com.example.sys.mp3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void musicOn(View view) {
        mp = MediaPlayer.create(this,R.raw.kalimba);
        mp.start();
    }

    public void musicOff(View view) {

        mp.stop();
    }
}