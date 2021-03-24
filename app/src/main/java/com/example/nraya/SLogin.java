package com.example.nraya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SLogin extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        String user1 = ((TextView)findViewById(R.id.user1)).getText().toString();
        String user2 = ((TextView)findViewById(R.id.user2)).getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slogin);
        Button boton = (Button) findViewById(R.id.b_login);
        boton.setOnClickListener(this);
    }
}