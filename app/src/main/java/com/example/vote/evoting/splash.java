package com.example.vote.evoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t1= new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        t1.start();

    }
}
