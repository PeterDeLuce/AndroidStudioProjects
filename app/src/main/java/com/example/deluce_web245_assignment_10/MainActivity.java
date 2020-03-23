package com.example.deluce_web245_assignment_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.deluce_web245_assignment_10.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "com.example.deluce_web245_assignment_10.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.deluce_web245_assignment_10.EXTRA_TEXT3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        EditText editText1 = (EditText) findViewById(R.id.user_first_name);
        String text = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.user_last_name);
        String text2 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.user_email);
        String text3 = editText3.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        startActivity(intent);
    }
}
