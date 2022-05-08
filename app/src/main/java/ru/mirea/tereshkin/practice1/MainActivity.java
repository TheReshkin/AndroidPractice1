package ru.mirea.tereshkin.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.liner_layout);
//        setContentView(R.layout.constraint_layout);

        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button);
        button.setText("Mirea_Button");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
        checkBox.setText("Tap");
    }
}