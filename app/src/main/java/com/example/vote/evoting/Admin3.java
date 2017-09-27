package com.example.vote.evoting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.vote.evoting.R.id.et9;

public class Admin3 extends AppCompatActivity {

    EditText name;
    EditText emaili;
    EditText add;
    EditText dob;
    Button buto;
    EditText number;
   DatabaseReference mRoot = FirebaseDatabase.getInstance().getReference();
    DatabaseReference user=mRoot.child("Candidate");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin3);
        name = (EditText) findViewById(R.id.et9);
        number = (EditText) findViewById(R.id.et15);
       add = (EditText) findViewById(R.id.et10);
        emaili = (EditText) findViewById(R.id.et17);
        dob=(EditText)findViewById(R.id.et19);
        buto = (Button) findViewById(R.id.button);



        buto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCandidate();
            }
        });

    }


    public void addCandidate() {
        String name1 = name.getText().toString().trim();
        String name2= number.getText().toString().trim();
        String name3= add.getText().toString().trim();
        String name4= emaili.getText().toString().trim();
        String name5= dob.getText().toString().trim();

        if(!TextUtils.isEmpty(name1)){
            String id=user.push().getKey();
            Candidate candidate=new Candidate(id,name1,name2,name3,name4,name5);
            user.child(id).setValue(candidate);
            Toast.makeText(this,"added",Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this,"not added",Toast.LENGTH_SHORT).show();
        }
    }

}