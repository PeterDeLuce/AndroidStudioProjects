package com.example.deluce_web245_assignment_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);

        TextView textView1 = (TextView) findViewById(R.id.tv_first_name2);
        TextView textView2 = (TextView) findViewById(R.id.tv_last_name2);
        TextView textView3 = (TextView) findViewById(R.id.tv_email2);

        textView1.setText(text);
        textView2.setText(text2);
        textView3.setText(text3);
    }
}


