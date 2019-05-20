package org.techktown.quizstudy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // TextView textView;
    //String[] items = {"LEE","CHOI","JEONG","RHO","crow","sally","cohen","rice"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MyView vw = new MyView(this);
        setContentView(R.layout.activity_main);



        /*
        textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");

            }
        });
        */




        //ListView listView = (ListView) findViewById(R.id.listview);
        //ArrayAdapter<String> adpater = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        //listView.setAdapter(adpater);


    }


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String option = item.getTitle().toString();
        if(option.equals("Forward Page"))
            browser.goForward();

        if(option.equals("Back Page"))
            browser.goBack();

        return true;
    }
    */
/*
    protected class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {


            Path path = new Path();
            canvas.drawColor(Color.WHITE);

            Paint Pnt = new Paint();
            Pnt.setStrokeWidth(5);
            Pnt.setColor(Color.RED);
            Pnt.setStyle(Paint.Style.STROKE);

            path.addRect(100,00,150,90,Path.Direction.CW);
            path.addCircle(50,50,40,Path.Direction.CW);
            canvas.drawPath(path, Pnt);

            path.reset();
            path.moveTo(10,110);
            path.lineTo(50,150);
            path.lineTo(400,10);

            Pnt.setStrokeWidth(3);
            Pnt.setColor(Color.BLUE);
            canvas.drawPath(path,Pnt);

            Pnt.setTextSize(20);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawTextOnPath("Text on Path",path,0,0,Pnt);
            */



            //super.onDraw(canvas);
           // Paint pnt = new Paint();
           // pnt.setColor(Color.BLUE);
           // canvas.drawColor(Color.RED);
            //canvas.drawRect(100,100,200,200,pnt);


           // Paint Pnt = new Paint(Paint.ANTI_ALIAS_FLAG);
/*
            Pnt.setStrokeWidth(8);
            Pnt.setColor(Color.RED);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(50,50,40,Pnt);

            Pnt.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150,50,40,Pnt);

            Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(250,50,40,Pnt);


            Pnt.setColor(Color.BLUE);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(50,150,40,Pnt);

            Pnt.setColor(Color.RED);
            Pnt.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(50,150,40,Pnt);

            Pnt.setColor(Color.RED);
            Pnt.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150,150,40,Pnt);

            Pnt.setColor(Color.BLUE);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(150,150,40,Pnt);
            */
/*
Pnt.setColor(Color.BLUE);
Pnt.setStrokeWidth(16);
canvas.drawLine(50,30,240,30,Pnt);
Pnt.setStrokeCap(Paint.Cap.ROUND);
canvas.drawLine(50,60,240,60,Pnt);
Pnt.setStrokeCap(Paint.Cap.SQUARE);
canvas.drawLine(50,90,240,90,Pnt);

Pnt.setColor(Color.BLACK);
Pnt.setStrokeWidth(20);
Pnt.setStyle(Paint.Style.STROKE);
Pnt.setStrokeJoin(Paint.Join.MITER);
canvas.drawRect(50,150,90,200,Pnt);
Pnt.setStrokeJoin(Paint.Join.BEVEL);
canvas.drawRect(120,150,160,200,Pnt);
Pnt.setStrokeJoin(Paint.Join.ROUND);
canvas.drawRect(190,150,230,200,Pnt);
*/














}
