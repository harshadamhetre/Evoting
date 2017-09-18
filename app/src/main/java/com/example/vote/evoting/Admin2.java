package com.example.vote.evoting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class Admin2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);

        Button b1;
        b1=(Button) findViewById(R.id.addbutton);


        b1.setOnClickListener (new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        Intent i=new Intent(getApplicationContext(),Admin3.class);
                        startActivity(i);
                    }
                });
        Button b2;
        b2=(Button) findViewById(R.id.addvoter);
        b2.setOnClickListener (new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {

                        Intent i=new Intent(getApplicationContext(),Voterinfo.class);
                        startActivity(i);
                    }
                });
    }
}