package com.example.assignment1eh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
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
        //regular.setBackgroundColor(Color.parseColor("#787878"));
        regular.setColumnCount(12);
        regular.setRowCount(12);

        //bar1
        for(int i = 0; i < 12; i++)
        {
            TextView tv;
            tv = new TextView(this);
            tv.setText(i + "");
            tv.setBackgroundColor(Color.GRAY);
            GridLayout.Spec row_spec = GridLayout.spec(i,1f);
            GridLayout.Spec col_spec = GridLayout.spec(0,1f);
            GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
            cParams.width = 65;
            //cParams.setMargins(10,10,10,10);
            tv.setLayoutParams(cParams);
            regular.addView(tv);
        }

        TextView tv;
        TextView tv1 = new TextView(this);
        tv1.setText("Rules void hello1(int hour)");
        tv1.setBackgroundColor(Color.BLACK);
        tv1.setTextColor(Color.WHITE);
        GridLayout.Spec row1_spec = GridLayout.spec(0,1,1f);
        GridLayout.Spec col1_spec = GridLayout.spec(1,11,1f);
        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(row1_spec, col1_spec);
        tv1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        gParams.width = 1015;
        //cParams.setMargins(10,10,10,10);
        tv1.setLayoutParams(gParams);
        regular.addView(tv1);
//
//        //bar2
//        TextView tv1 = new TextView(this);
//        tv1.setText("2");
//        tv1.setBackgroundColor(Color.GRAY);
//        tv1.setTextSize(16);
//        GridLayout.Spec row1_spec = GridLayout.spec(1,1f);
//        GridLayout.Spec col1_spec = GridLayout.spec(0,1f);
//        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(row1_spec, col1_spec);
//        tv1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
//        gParams.width = 50;
//        tv1.setLayoutParams(gParams);
//        regular.addView(tv1);
//
//        //bar3
//        TextView tv2 = new TextView(this);
//        tv2.setText("3");
//        tv2.setBackgroundColor(Color.GRAY);
//        tv2.setTextSize(16);
//        GridLayout.Spec row2_spec = GridLayout.spec(2,1f);
//        GridLayout.Spec col2_spec = GridLayout.spec(0,1f);
//        GridLayout.LayoutParams tv2Params = new GridLayout.LayoutParams(row2_spec, col2_spec);
//        tv2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
//        tv2Params.width = 50;
//        tv2.setLayoutParams(tv2Params);
//        regular.addView(tv2);







        setContentView(regular);

    }
}
