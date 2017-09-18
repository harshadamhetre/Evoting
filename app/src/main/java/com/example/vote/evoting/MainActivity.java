package com.example.vote.evoting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button b1;
        b1=(Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Object activity_main2;
                Intent i=new Intent(getApplicationContext(),Voter_Login.class);


                startActivity(i);

            }
        });

        Button b2;
        b2=(Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Object activity_main2;
                Intent i=new Intent(getApplicationContext(),Admin.class);


                startActivity(i);

            }
        });

    }

    }




