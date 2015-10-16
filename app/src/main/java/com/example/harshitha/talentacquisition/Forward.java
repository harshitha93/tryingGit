package com.example.harshitha.talentacquisition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harshitha.talentacquisition.Async.SendEmailAsyncTask;

/**
 * Created by harshu on 9/2/2015.
 */
public class Forward extends AppCompatActivity {

    Button b1;
    Toolbar tb1;

    EditText email;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forward);

        email=(EditText)findViewById(R.id.edittext2);
        tb1 = (Toolbar) findViewById(R.id.toolbar);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Email Forwarded", Toast.LENGTH_SHORT).show();
//                Intent i=new Intent(Forward.this,MainActivity.class);
//                startActivity(i);
//                finish();

                //new (SendEmailAsyncTask<getApplicationContext(),email.getText()>).execute();

            }
        });

        if (tb1 != null)
            setSupportActionBar(tb1);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Forward");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}