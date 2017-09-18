package com.example.vote.evoting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Voterinfo extends AppCompatActivity {

    EditText name;
    EditText aadhar;
    EditText number;
    Button buto;
    DatabaseReference mRoot = FirebaseDatabase.getInstance().getReference();
    DatabaseReference users = mRoot.child("Voter");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voterinfo);
      /* Databasevoter = FirebaseDatabase.getInstance().getReference("Voter");*/
        name = (EditText) findViewById(R.id.et9);
        number = (EditText) findViewById(R.id.et15);
        aadhar = (EditText) findViewById(R.id.et10);
        buto = (Button) findViewById(R.id.button);


        buto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addVoter();
            }
        });

    }


    public void addVoter() {
        String name1 = name.getText().toString().trim();
        String name2 = number.getText().toString().trim();
        String name3 = aadhar.getText().toString().trim();

        if (!TextUtils.isEmpty(name1) ) {
            //String id = users.push().getKey();
            Voter voter = new Voter( name1, name2, name3);
            users.child(name3).setValue(voter);
            Toast.makeText(this, "added", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "not added", Toast.LENGTH_SHORT).show();
        }
    }
}