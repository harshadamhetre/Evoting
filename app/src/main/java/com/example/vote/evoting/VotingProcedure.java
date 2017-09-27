package com.example.vote.evoting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VotingProcedure extends AppCompatActivity {
    DatabaseReference candidate=FirebaseDatabase.getInstance().getReference().child("Candidate").getRef();
    RadioButton pa,pb,pc,vpa,vpb,vpc,sa,sb,sc;
    String pname[]=new String[3];
    int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_procedure);
        pa=(RadioButton) findViewById(R.id.pa);
        pb=(RadioButton) findViewById(R.id.pb);
        pc=(RadioButton) findViewById(R.id.pc);
        vpa=(RadioButton) findViewById(R.id.vpa);
        vpb=(RadioButton) findViewById(R.id.vpb);
        vpc=(RadioButton) findViewById(R.id.vpc);
        sa=(RadioButton) findViewById(R.id.sa);
        sb=(RadioButton) findViewById(R.id.sb);
        sc=(RadioButton) findViewById(R.id.sc);
        k=0;
        candidate.child("President").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Candidate c=dataSnapshot1.getValue(Candidate.class);
                    pname[k]=c.getCanditateName();
                    k++;
                }
                pa.setText(pname[0]);
                pb.setText(pname[1]);
                pc.setText(pname[2]);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        k=0;
        candidate.child("vicepresident").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Candidate c=dataSnapshot1.getValue(Candidate.class);
                    pname[k]=c.getCanditateName();
                    k++;
                }
                vpa.setText(pname[0]);
                vpb.setText(pname[1]);
                vpc.setText(pname[2]);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        k=0;
        candidate.child("secretary").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Candidate c=dataSnapshot1.getValue(Candidate.class);
                    pname[k]=c.getCanditateName();
                    k++;
                }
                sa.setText(pname[0]);
                sb.setText(pname[1]);
                sc.setText(pname[2]);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}