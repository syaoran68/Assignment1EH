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


        //Title bar
        TextView tv;
        TextView tv1 = new TextView(this);
        tv1.setText("Rules void hello1(int hour)");
        tv1.setBackgroundColor(Color.BLACK);
        tv1.setTextColor(Color.WHITE);
        GridLayout.Spec row1_spec = GridLayout.spec(0,1,1f);
        GridLayout.Spec col1_spec = GridLayout.spec(1,11,1f);
        GridLayout.LayoutParams tParams = new GridLayout.LayoutParams(row1_spec, col1_spec);
        tv1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tParams.width = 1015;
        //cParams.setMargins(10,10,10,10);
        tv1.setLayoutParams(tParams);
        regular.addView(tv1);

//        //Properties (not sure why this is here? maybe duplicate)
//        TextView tv2 = new TextView(this);
//        tv2.setText("Rules void hello1(int hour)");
//        tv2.setBackgroundColor(Color.BLACK);
//        tv2.setTextColor(Color.WHITE);
//        GridLayout.Spec row2_spec = GridLayout.spec(1,2,1f);
//        GridLayout.Spec col2_spec = GridLayout.spec(1,2,1f);
//        GridLayout.LayoutParams gParams = new GridLayout.LayoutParams(row2_spec, col2_spec);
//        tv2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
//        gParams.width = 1015;
//        //cParams.setMargins(10,10,10,10);
//        tv2.setLayoutParams(gParams);
//        regular.addView(tv2);

        //Properties
        TextView tv3 = new TextView(this);
        tv3.setText("Properties");
        GridLayout.Spec row3_spec = GridLayout.spec(1,2,1f);
        GridLayout.Spec col3_spec = GridLayout.spec(1,2,1f);
        GridLayout.LayoutParams pParams = new GridLayout.LayoutParams(row3_spec, col3_spec);
        tv3.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        pParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv3.setLayoutParams(pParams);
        regular.addView(tv3);

        //Name
        TextView tv4 = new TextView(this);
        tv4.setText("name");
        GridLayout.Spec row4_spec = GridLayout.spec(1,1,1f);
        GridLayout.Spec col4_spec = GridLayout.spec(3,2,1f);
        GridLayout.LayoutParams nParams = new GridLayout.LayoutParams(row4_spec, col4_spec);
        tv4.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        nParams.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv4.setLayoutParams(nParams);
        regular.addView(tv4);

        //Category
        TextView tv5 = new TextView(this);
        tv5.setText("category");
        GridLayout.Spec row5_spec = GridLayout.spec(2,1,1f);
        GridLayout.Spec col5_spec = GridLayout.spec(3,1,1f);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row5_spec, col5_spec);
        tv5.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        cParams.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv5.setLayoutParams(cParams);
        regular.addView(tv5);

        //Day Hour Classification
        TextView tv6 = new TextView(this);
        tv6.setText("Day Hour Classification");
        GridLayout.Spec row6_spec = GridLayout.spec(1,1,1f);
        GridLayout.Spec col6_spec = GridLayout.spec(5,1,1f);
        GridLayout.LayoutParams dParams = new GridLayout.LayoutParams(row6_spec, col6_spec);
        tv6.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        dParams.width = 465;
        //cParams.setMargins(10,10,10,10);
        tv6.setLayoutParams(dParams);
        regular.addView(tv6);

        //Day and Time
        TextView tv7 = new TextView(this);
        tv7.setText("Day and Time");
        GridLayout.Spec row7_spec = GridLayout.spec(2,1,1f);
        GridLayout.Spec col7_spec = GridLayout.spec(5,1,1f);
        GridLayout.LayoutParams d2Params = new GridLayout.LayoutParams(row7_spec, col7_spec);
        tv7.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        d2Params.width = 465;
        //cParams.setMargins(10,10,10,10);
        tv7.setLayoutParams(d2Params);
        regular.addView(tv7);

        //Rule
        TextView tv8 = new TextView(this);
        tv8.setText("Rule");
        tv8.setBackgroundColor(Color.parseColor("#66CCFF"));

        GridLayout.Spec row8_spec = GridLayout.spec(3,1,1f);
        GridLayout.Spec col8_spec = GridLayout.spec(2,1,1f);
        GridLayout.LayoutParams r2Params = new GridLayout.LayoutParams(row8_spec, col8_spec);
        tv8.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        r2Params.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv8.setLayoutParams(r2Params);
        regular.addView(tv8);
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
