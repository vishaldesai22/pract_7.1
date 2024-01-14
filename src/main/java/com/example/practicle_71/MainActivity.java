package com.example.practicle_71;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        resultTextView=findViewById(R.id.resultTextView);

    }
    public void loginButtonClicked(View view) {
        String username = e1.getText().toString();
        String password = e2.getText().toString();

        String resultMessage = "Username: " + username + "\nPassword: " + password;
        resultTextView.setText(resultMessage);
    }
}