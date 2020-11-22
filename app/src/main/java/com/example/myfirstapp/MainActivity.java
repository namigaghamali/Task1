package com.example.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void duyme_click(View view) {
        Toast.makeText(this,"Halaldi yazini deyisdin",Toast.LENGTH_LONG).show();
        TextView tv = (TextView) findViewById(R.id.mytextview);
        tv.setText("Hello to you!");

    }
}