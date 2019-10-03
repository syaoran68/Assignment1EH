package com.example.assignment1eh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView main = new HorizontalScrollView(this);
        ViewGroup.LayoutParams Hparams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT

        );


        GridLayout regular = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        regular.setLayoutParams(rParams);
        regular.setOrientation(GridLayout.VERTICAL);
        //regular.setBackgroundColor(Color.parseColor("#787878"));
        //regular.setColumnCount(6);
        //regular.setRowCount(12);



        //bar1
        for(int i = 0; i < 12; i++)
        {
            TextView tv;
            tv = new TextView(this);
            tv.setText(i + "");
            tv.setBackgroundColor(Color.GRAY);
            GridLayout.Spec row_spec = GridLayout.spec(i);
            GridLayout.Spec col_spec = GridLayout.spec(0);
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
        GridLayout.Spec row1_spec = GridLayout.spec(0, 1);
        GridLayout.Spec col1_spec = GridLayout.spec(1, 7);
        GridLayout.LayoutParams tParams = new GridLayout.LayoutParams(row1_spec, col1_spec);
        tv1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tParams.width = 1500;
        //cParams.setMargins(10,10,10,10);
        tv1.setLayoutParams(tParams);
        regular.addView(tv1);

        //Properties
        TextView tv3 = new TextView(this);
        tv3.setText("Properties");
        tv3.setBackgroundColor(Color.BLACK);
        tv3.setTextColor(Color.WHITE);
        GridLayout.Spec row3_spec = GridLayout.spec(1,2,1f);
        GridLayout.Spec col3_spec = GridLayout.spec(1,2);
        GridLayout.LayoutParams pParams = new GridLayout.LayoutParams(row3_spec, col3_spec);
        tv3.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        pParams.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv3.setLayoutParams(pParams);
        regular.addView(tv3);

        //Name
        TextView tv4 = new TextView(this);
        tv4.setText("name");
        //tv4.setBackgroundColor(Color.BLUE);
        GridLayout.Spec row4_spec = GridLayout.spec(1);
        GridLayout.Spec col4_spec = GridLayout.spec(3,2);
        GridLayout.LayoutParams nParams = new GridLayout.LayoutParams(row4_spec, col4_spec);
        tv4.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        nParams.width = 500;
        //cParams.setMargins(10,10,10,10);
        tv4.setLayoutParams(nParams);
        regular.addView(tv4);

        //Category
        TextView tv5 = new TextView(this);
        tv5.setText("category");
        GridLayout.Spec row5_spec = GridLayout.spec(2);
        GridLayout.Spec col5_spec = GridLayout.spec(3,2);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row5_spec, col5_spec);
        tv5.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        cParams.width = 500;
        //cParams.setMargins(10,10,10,10);
        tv5.setLayoutParams(cParams);
        regular.addView(tv5);

        //Day Hour Classification
        TextView tv6 = new TextView(this);
        tv6.setText("Day Hour Classification");
        //tv6.setBackgroundColor(Color.BLUE);
        GridLayout.Spec row6_spec = GridLayout.spec(1);
        GridLayout.Spec col6_spec = GridLayout.spec(5);
        GridLayout.LayoutParams dParams = new GridLayout.LayoutParams(row6_spec, col6_spec);
        tv6.setGravity(Gravity.CENTER_VERTICAL);
        //dParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv6.setLayoutParams(dParams);
        regular.addView(tv6);

        //Day and Time
        TextView tv7 = new TextView(this);
        tv7.setText("Day and Time");
        GridLayout.Spec row7_spec = GridLayout.spec(2);
        GridLayout.Spec col7_spec = GridLayout.spec(5);
        GridLayout.LayoutParams d2Params = new GridLayout.LayoutParams(row7_spec, col7_spec);
        tv7.setGravity(Gravity.CENTER_VERTICAL);
        //d2Params.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv7.setLayoutParams(d2Params);
        regular.addView(tv7);

        //Rule
        TextView tv8 = new TextView(this);
        tv8.setText("Rule");
        tv8.setBackgroundColor(Color.parseColor("#66CCFF"));
        Typeface r1boldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv8.setTypeface(r1boldTypeFace);
        GridLayout.Spec row8_spec = GridLayout.spec(3,3,1f);
        GridLayout.Spec col8_spec = GridLayout.spec(1,1,1f);
        GridLayout.LayoutParams r2Params = new GridLayout.LayoutParams(row8_spec, col8_spec);
        tv8.setGravity(Gravity.CENTER_HORIZONTAL);
        r2Params.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv8.setLayoutParams(r2Params);
        regular.addView(tv8);

        //C1
        TextView tv9 = new TextView(this);
        tv9.setText("C1");
        Typeface c1boldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv9.setTypeface(c1boldTypeFace);
        tv9.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row9_spec = GridLayout.spec(3);
        GridLayout.Spec col9_spec = GridLayout.spec(3,2);
        GridLayout.LayoutParams c2Params = new GridLayout.LayoutParams(row9_spec, col9_spec);
        tv9.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        c2Params.width = 500;
        //cParams.setMargins(10,10,10,10);
        tv9.setLayoutParams(c2Params);
        regular.addView(tv9);

        //A1
        TextView tv10 = new TextView(this);
        tv10.setText("A1");
        Typeface a1boldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv10.setTypeface(a1boldTypeFace);
        tv10.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row10_spec = GridLayout.spec(3);
        GridLayout.Spec col10_spec = GridLayout.spec(5);
        GridLayout.LayoutParams a1Params = new GridLayout.LayoutParams(row10_spec, col10_spec);
        tv10.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        a1Params.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv10.setLayoutParams(a1Params);
        regular.addView(tv10);

        //Min <= hour && hour <= max
        TextView tv11 = new TextView(this);
        tv11.setText("Min <= hour && hour <= max");
        //Typeface minboldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv11.setTypeface(c1boldTypeFace);
        tv11.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row11_spec = GridLayout.spec(4);
        GridLayout.Spec col11_spec = GridLayout.spec(3,2);
        GridLayout.LayoutParams minParams = new GridLayout.LayoutParams(row11_spec, col11_spec);
        tv11.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        minParams.width = 500;
        //cParams.setMargins(10,10,10,10);
        tv11.setLayoutParams(minParams);
        regular.addView(tv11);

        //System.out.printIn(greeting + ", World!")
        TextView tv12 = new TextView(this);
        tv12.setText("System.out.printIn(greeting + \", World!\")");
        //Typeface minboldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv11.setTypeface(c1boldTypeFace);
        tv12.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row12_spec = GridLayout.spec(4,1);
        GridLayout.Spec col12_spec = GridLayout.spec(5,2);
        GridLayout.LayoutParams sysParams = new GridLayout.LayoutParams(row12_spec, col12_spec);
        tv12.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        sysParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv12.setLayoutParams(sysParams);
        regular.addView(tv12);

        //int min
        TextView tv13 = new TextView(this);
        tv13.setText("int min");
        //Typeface minboldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv11.setTypeface(c1boldTypeFace);
        tv13.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row13_spec = GridLayout.spec(5);
        GridLayout.Spec col13_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams intParams = new GridLayout.LayoutParams(row13_spec, col13_spec);
        tv13.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        intParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv13.setLayoutParams(intParams);
        regular.addView(tv13);

        //int max
        TextView tv14 = new TextView(this);
        tv14.setText("int max");
        //Typeface minboldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv11.setTypeface(c1boldTypeFace);
        tv14.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row14_spec = GridLayout.spec(5);
        GridLayout.Spec col14_spec = GridLayout.spec(4) ;
        GridLayout.LayoutParams maxParams = new GridLayout.LayoutParams(row14_spec, col14_spec);
        tv14.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        maxParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv14.setLayoutParams(maxParams);
        regular.addView(tv14);

        //String Greeting
        TextView tv15 = new TextView(this);
        tv15.setText("string greeting");
        //Typeface minboldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv11.setTypeface(c1boldTypeFace);
        tv15.setBackgroundColor(Color.parseColor("#66CCFF"));
        GridLayout.Spec row15_spec = GridLayout.spec(5);
        GridLayout.Spec col15_spec = GridLayout.spec(5) ;
        GridLayout.LayoutParams stringParams = new GridLayout.LayoutParams(row15_spec, col15_spec);
        tv15.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        stringParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv15.setLayoutParams(stringParams);
        regular.addView(tv15);


        main.addView(regular);



        setContentView(main);

    }
}
