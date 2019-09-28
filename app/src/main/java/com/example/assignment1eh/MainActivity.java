package com.example.assignment1eh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout regular = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        regular.setLayoutParams(rParams);
        regular.setOrientation(GridLayout.VERTICAL);
        regular.setBackgroundColor(Color.parseColor("#787878"));
        regular.setColumnCount(10);
        regular.setRowCount(10);

        //bar1

        GridLayout.Spec row_spec = GridLayout.spec(0,2f);
        GridLayout.Spec col_spec = GridLayout.spec(0,2f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(10,10,10,10);
        TextView tv;


        //bar2
        tv = new TextView(this);
        tv.setText("1");
        tv.setTextSize(16);
        regular.addView(tv);

        //bar3
        tv = new TextView(this);
        tv.setText("2");
        tv.setTextSize(16);
        regular.addView(tv);


        setContentView(regular);
    }
}
