package com.example.assignment1eh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout regular = new TableLayout(this);

        TextView bar1 = new TextView(this);
        bar1.setText("1");

        setContentView(R.layout.activity_main);
    }
}
