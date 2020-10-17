package com.example.datlich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements  View.OnClickListener{
    TextView goSignup;
    Button btgoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        connectView();
    }

    private void connectView() {
        goSignup = (TextView) findViewById(R.id.txt_sign_up);
        btgoHome = (Button) findViewById(R.id.bt_signin);

        // set on click
        goSignup.setOnClickListener( this);
        btgoHome.setOnClickListener( this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_signin:
                openHome();
                break;
            case R.id.txt_sign_up:
                openSignup();
                break;
        }
    }
    public void openSignup(){
        Intent intent = new Intent(this, Sign_up.class);
        startActivity(intent);
    }
    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}