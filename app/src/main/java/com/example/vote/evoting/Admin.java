package com.example.vote.evoting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {

    private EditText name;
    private EditText pwd;
    private Button buto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        name = (EditText) findViewById(R.id.et1);
        pwd = (EditText) findViewById(R.id.et2);
        buto = (Button) findViewById(R.id.bt1);

        buto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), pwd.getText().toString());


            }
        });

    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(Admin.this, Admin2.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Username or password", Toast.LENGTH_SHORT).show();
        }

    }
}

