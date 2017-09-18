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

public class VotingProcedure extends AppCompatActivity {

    private RadioGroup radiogrp;
    private RadioButton radiobt;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting_procedure);
        addListenerOnButton();



    }

    public void addListenerOnButton() {

        radiogrp = (RadioGroup) findViewById(R.id.radio);
        submit = (Button) findViewById(R.id.button22);

        submit.setOnClickListener(new View.OnClickListener() {

           // @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radiogrp.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radiobt = (RadioButton) findViewById(selectedId);

                Toast.makeText(VotingProcedure.this,
                        radiobt.getText(), Toast.LENGTH_SHORT).show();

            }

        });


        }
    public void logout(View view){
        finish();
    }

}