package com.example.datlich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_up extends AppCompatActivity implements View.OnClickListener{
    TextView goLogin;
    Button gobtListHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        connectView();

    }
    private void connectView() {
        goLogin = findViewById(R.id.txt_sign_in);
        gobtListHospital = findViewById(R.id.bt_submit);

        goLogin.setOnClickListener(this);
        gobtListHospital.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.bt_submit:
                openListHospital();
                break;
            case R.id.txt_sign_in:
                openSignIn();
                break;
        }
    }

    public void openListHospital(){
        Intent intent = new Intent(this, List_hospital.class);
        startActivity(intent);
    }
    public void openSignIn(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}