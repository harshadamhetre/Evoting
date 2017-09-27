package com.example.vote.evoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Voter_Login extends AppCompatActivity {
    DatabaseReference root= FirebaseDatabase.getInstance().getReference();
    DatabaseReference voter=root.child("Voter").getRef();
    EditText ed1;
    String uid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voter__login);
        Button b1;
        ed1=(EditText)findViewById(R.id.uid);
        b1=(Button) findViewById(R.id.button6);


        b1.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String uid=ed1.getText().toString();
                voter.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChild(uid)){
                            if(dataSnapshot.hasChild("votemade")){
                                Toast.makeText(Voter_Login.this, "You've already voted.", Toast.LENGTH_SHORT).show();
                            }else{
                                startActivity(new Intent(Voter_Login.this,VotingProcedure.class).putExtra("uid",uid));
                            }
                        }else{
                            Toast.makeText(Voter_Login.this, "Voter doesn't exist.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                //Intent i=new Intent(getApplicationContext(),VotingProcedure.class);
                //startActivity(i);
            }
        });
  }




    }

