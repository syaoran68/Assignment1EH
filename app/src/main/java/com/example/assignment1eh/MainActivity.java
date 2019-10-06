package com.example.assignment1eh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
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


        //side bar
        //bar1
        for(int i = 0; i < 11; i++)
        {
            TextView tv;
            tv = new TextView(this);
            tv.setText("" + (i + 1));
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

        //Line 1
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

        //Line 2
        //Properties
        TextView tv3 = new TextView(this);
        tv3.setText("Properties");
        //tv3.setBackgroundColor(Color.BLACK);
        //tv3.setTextColor(Color.WHITE);
        GridLayout.Spec row3_spec = GridLayout.spec(1,2,1f);
        GridLayout.Spec col3_spec = GridLayout.spec(1,2);
        GridLayout.LayoutParams pParams = new GridLayout.LayoutParams(row3_spec, col3_spec);
        tv3.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        pParams.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv3.setLayoutParams(pParams);
        regular.addView(tv3);

        //Line 2 Top Part
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

        //Line 2 Part 2
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


        //Line 3
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

        //Line 4
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

        //Line 5
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
        GridLayout.Spec col15_spec = GridLayout.spec(5);
        GridLayout.LayoutParams stringParams = new GridLayout.LayoutParams(row15_spec, col15_spec);
        tv15.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        stringParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv15.setLayoutParams(stringParams);
        regular.addView(tv15);

        // Line 6
        //Rule2
        TextView tv16 = new TextView(this);
        tv16.setText("Rule");
        //tv16.setBackgroundColor(Color.parseColor("#66CCFF"));
        Typeface r3boldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv16.setTypeface(r3boldTypeFace);
        GridLayout.Spec row16_spec = GridLayout.spec(6);
        GridLayout.Spec col16_spec = GridLayout.spec(1,1,1f);
        GridLayout.LayoutParams r3Params = new GridLayout.LayoutParams(row16_spec, col16_spec);
        tv16.setGravity(Gravity.CENTER_VERTICAL);
        r3Params.width = 300;
        //cParams.setMargins(10,10,10,10);
        tv16.setLayoutParams(r3Params);
        regular.addView(tv16);

        //from
        TextView tv17 = new TextView(this);
        tv17.setText("From");
        Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv17.setTypeface(fromBoldTypeFace);
        tv17.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row17_spec = GridLayout.spec(6);
        GridLayout.Spec col17_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams fromParams = new GridLayout.LayoutParams(row17_spec, col17_spec);
        tv17.setGravity(Gravity.CENTER_VERTICAL);
        fromParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv17.setLayoutParams(fromParams);
        regular.addView(tv17);

        //to
        TextView tv18 = new TextView(this);
        tv18.setText("To");
        Typeface toBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv18.setTypeface(toBoldTypeFace);
        tv18.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row18_spec = GridLayout.spec(6);
        GridLayout.Spec col18_spec = GridLayout.spec(4);
        GridLayout.LayoutParams toParams = new GridLayout.LayoutParams(row18_spec, col18_spec);
        tv18.setGravity(Gravity.CENTER_VERTICAL);
        toParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv18.setLayoutParams(toParams);
        regular.addView(tv18);

        //Greeting
        TextView tv19 = new TextView(this);
        tv19.setText("Greeting");
        Typeface greetBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        tv19.setTypeface(greetBoldTypeFace);
        tv19.setBackgroundColor(Color.parseColor("#FF7F00"));
        GridLayout.Spec row19_spec = GridLayout.spec(6);
        GridLayout.Spec col19_spec = GridLayout.spec(5);
        GridLayout.LayoutParams greetParams = new GridLayout.LayoutParams(row19_spec, col19_spec);
        tv19.setGravity(Gravity.CENTER_VERTICAL);
        greetParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv19.setLayoutParams(greetParams);
        regular.addView(tv19);


        //Line 7
        //loop for R10 - R40 quicker and easier
        //R10

        for(int j = 1; j < 5; j++)
        {
            TextView tv20 = new TextView(this);
            tv20.setText("R" + (j * 10));
            //tv16.setBackgroundColor(Color.parseColor("#66CCFF"));
            //Typeface r3boldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
            tv20.setTypeface(r3boldTypeFace);
            GridLayout.Spec row20_spec = GridLayout.spec(6 + j);
            GridLayout.Spec col20_spec = GridLayout.spec(1,1,1f);
            GridLayout.LayoutParams r10Params = new GridLayout.LayoutParams(row20_spec, col20_spec);
            tv20.setGravity(Gravity.CENTER_VERTICAL);
            r10Params.width = 300;
            //cParams.setMargins(10,10,10,10);
            tv20.setLayoutParams(r10Params);
            regular.addView(tv20);
        }

        //0
        TextView tv21 = new TextView(this);
        tv21.setText("0");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv21.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row20_spec = GridLayout.spec(7);
        GridLayout.Spec col20_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams zeroParams = new GridLayout.LayoutParams(row20_spec, col20_spec);
        tv21.setGravity(Gravity.END);
        zeroParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv21.setLayoutParams(zeroParams);
        regular.addView(tv21);

        //11
        TextView tv22 = new TextView(this);
        tv22.setText("11");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv22.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row21_spec = GridLayout.spec(7);
        GridLayout.Spec col21_spec = GridLayout.spec(4,1);
        GridLayout.LayoutParams elevenParams = new GridLayout.LayoutParams(row21_spec, col21_spec);
        tv22.setGravity(Gravity.END);
        elevenParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv22.setLayoutParams(elevenParams);
        regular.addView(tv22);

        //Good Morning
        TextView tv23 = new TextView(this);
        tv23.setText("Good Morning");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv23.setBackgroundColor(Color.parseColor("#FF7F00"));
        GridLayout.Spec row23_spec = GridLayout.spec(7);
        GridLayout.Spec col23_spec = GridLayout.spec(5);
        GridLayout.LayoutParams goodMParams = new GridLayout.LayoutParams(row23_spec, col23_spec);
        tv23.setGravity(Gravity.CENTER_VERTICAL);
        goodMParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv23.setLayoutParams(goodMParams);
        regular.addView(tv23);

        //Line 8
        //12
        TextView tv24 = new TextView(this);
        tv24.setText("12");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv24.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row24_spec = GridLayout.spec(8);
        GridLayout.Spec col24_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams twelveParams = new GridLayout.LayoutParams(row24_spec, col24_spec);
        tv24.setGravity(Gravity.END);
        twelveParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv24.setLayoutParams(twelveParams);
        regular.addView(tv24);

        //17
        TextView tv25 = new TextView(this);
        tv25.setText("17");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv25.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row25_spec = GridLayout.spec(8);
        GridLayout.Spec col25_spec = GridLayout.spec(4,1);
        GridLayout.LayoutParams seventeenParams = new GridLayout.LayoutParams(row25_spec, col25_spec);
        tv25.setGravity(Gravity.END);
        seventeenParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv25.setLayoutParams(seventeenParams);
        regular.addView(tv25);

        //Good Afternoon
        TextView tv26 = new TextView(this);
        tv26.setText("Good Afternoon");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv26.setBackgroundColor(Color.parseColor("#FF7F00"));
        GridLayout.Spec row26_spec = GridLayout.spec(8);
        GridLayout.Spec col26_spec = GridLayout.spec(5);
        GridLayout.LayoutParams goodAParams = new GridLayout.LayoutParams(row26_spec, col26_spec);
        tv26.setGravity(Gravity.CENTER_VERTICAL);
        goodAParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv26.setLayoutParams(goodAParams);
        regular.addView(tv26);

        //Line 9
        //18
        TextView tv27 = new TextView(this);
        tv27.setText("18");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv27.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row27_spec = GridLayout.spec(9);
        GridLayout.Spec col27_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams eighteenParams = new GridLayout.LayoutParams(row27_spec, col27_spec);
        tv27.setGravity(Gravity.END);
        eighteenParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv27.setLayoutParams(eighteenParams);
        regular.addView(tv27);

        //21
        TextView tv28 = new TextView(this);
        tv28.setText("21");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv28.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row28_spec = GridLayout.spec(9);
        GridLayout.Spec col28_spec = GridLayout.spec(4,1);
        GridLayout.LayoutParams twentyOneParams = new GridLayout.LayoutParams(row28_spec, col28_spec);
        tv28.setGravity(Gravity.END);
        twentyOneParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv28.setLayoutParams(twentyOneParams);
        regular.addView(tv28);

        //Good Evening
        TextView tv29 = new TextView(this);
        tv29.setText("Good Evening");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv29.setBackgroundColor(Color.parseColor("#FF7F00"));
        GridLayout.Spec row29_spec = GridLayout.spec(9);
        GridLayout.Spec col29_spec = GridLayout.spec(5);
        GridLayout.LayoutParams goodEParams = new GridLayout.LayoutParams(row29_spec, col29_spec);
        tv29.setGravity(Gravity.CENTER_VERTICAL);
        goodEParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv29.setLayoutParams(goodEParams);
        regular.addView(tv29);

        //Line 10
        //22
        TextView tv30 = new TextView(this);
        tv30.setText("22");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv30.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row30_spec = GridLayout.spec(10);
        GridLayout.Spec col30_spec = GridLayout.spec(3,1);
        GridLayout.LayoutParams twentytwoParams = new GridLayout.LayoutParams(row30_spec, col30_spec);
        tv30.setGravity(Gravity.END);
        twentytwoParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv30.setLayoutParams(twentytwoParams);
        regular.addView(tv30);

        //23
        TextView tv31 = new TextView(this);
        tv31.setText("23");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);

        tv31.setBackgroundColor(Color.YELLOW);
        GridLayout.Spec row31_spec = GridLayout.spec(10);
        GridLayout.Spec col31_spec = GridLayout.spec(4,1);
        GridLayout.LayoutParams twentythreeParams = new GridLayout.LayoutParams(row31_spec, col31_spec);
        tv31.setGravity(Gravity.END);
        twentythreeParams.width = 250;
        //cParams.setMargins(10,10,10,10);
        tv31.setLayoutParams(twentythreeParams);
        regular.addView(tv31);

        //Good Night
        TextView tv32 = new TextView(this);
        tv32.setText("Good Night");
        //Typeface fromBoldTypeFace = Typeface.defaultFromStyle(Typeface.BOLD);
        //tv21.setTypeface(fromBoldTypeFace);
        tv32.setBackgroundColor(Color.parseColor("#FF7F00"));
        GridLayout.Spec row32_spec = GridLayout.spec(10);
        GridLayout.Spec col32_spec = GridLayout.spec(5);

        GridLayout.LayoutParams goodNParams = new GridLayout.LayoutParams(row32_spec, col32_spec);
        tv32.setGravity(Gravity.CENTER_VERTICAL);
        goodNParams.width = 700;
        //cParams.setMargins(10,10,10,10);
        tv32.setLayoutParams(goodNParams);
        regular.addView(tv32);

        main.addView(regular);



        setContentView(R.layout.excel_layout);

    }
}
