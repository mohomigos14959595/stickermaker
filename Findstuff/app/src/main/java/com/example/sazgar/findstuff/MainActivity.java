package com.example.sazgar.findstuff;

import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button sayhello;
    TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sticker);
/*
        sayhello = (Button) findViewById(R.id.sayhello);
        name=(EditText) findViewById(R.id.name);
        text2=(TextView)findViewById(R.id.text2);
        Switch sw=(Switch)findViewById(R.id.switch1);

        RadioButton re=(RadioButton)findViewById(R.id.radioButton);
    }
    public void press(View view){
        //1
        //2
        //3
        EditText t1 = (EditText)findViewById(R.id.name);
        //4
        String message= t1.getText().toString();
        //5
        // 5/1
        CheckBox gender=(CheckBox) findViewById(R.id.gene);
        boolean nam=gender.isChecked();
        String jensiat;
        if (nam){
            jensiat="Mr";
        }
        else {
            jensiat="Mrs";
        }
        TextView t2 = (TextView) findViewById(R.id.text2);
        //6

        t2.setText("hello " + jensiat+ message);

    }

public void switchh(View view){
    Switch sw=(Switch)findViewById(R.id.switch1);
    boolean roshanaee=sw.isChecked();
    String vazeiat;
    if(roshanaee){
        vazeiat="on";
    }
    else {
        vazeiat="off";

    }

    TextView t3=(TextView)findViewById(R.id.text3);
    t3.setText("lights are   " + vazeiat);

}
    public void heat(View view){
        TextView tfinal=(TextView)findViewById(R.id.texttoggle);
        //recognize toggle button
        ToggleButton tog=(ToggleButton)findViewById(R.id.toggleButton1);
        boolean taarik=tog.isChecked();
        String quality;

        if(taarik){
            quality=" on";
            Toast.makeText(this,"lights clicked",Toast.LENGTH_LONG).show();

        }
        else {
            quality="off";
            Toast.makeText(this,"lights clicked",Toast.LENGTH_LONG).show();
        }

        tfinal.setText("heaters of this part are " + quality);

    }
    public void next(View view){
        Toast.makeText(this,"there is no other page  hahahahahah"
        ,Toast.LENGTH_LONG).show();

    */
    }

    public void laugh(View view) {
        //1 farakhani  views
        ImageView imleft = (ImageView) findViewById(R.id.firsleftimage);
        EditText edname = (EditText) findViewById(R.id.entername);
        ImageView imfinal = (ImageView) findViewById(R.id.finalimage);
        TextView tefinal = (TextView) findViewById(R.id.textviewfinal);
        Switch swmale = (Switch) findViewById(R.id.switchmale);

        //2 get the image of them
        Drawable message = imleft.getDrawable();

        String namemessage = edname.getText().toString();
        boolean male = swmale.isChecked();
        String jensiat;
        if (male) {
            jensiat = "mr";
        } else {
            jensiat = "mrs";
        }
        //3set the image in the fina limage view
        imfinal.setImageDrawable(message);

        //4 set text texview final
        tefinal.setText(jensiat + namemessage + " is laghing");


    }

    public void cry(View view) {
        //1 farakhani  views
        ImageView imcenter = (ImageView) findViewById(R.id.firscenterimage);
        EditText edname = (EditText) findViewById(R.id.entername);
        ImageView imfinal = (ImageView) findViewById(R.id.finalimage);
        TextView tefinal = (TextView) findViewById(R.id.textviewfinal);
        Switch swmale = (Switch) findViewById(R.id.switchmale);

        //2 get the image of them
        Drawable message = imcenter.getDrawable();

        String namemessage = edname.getText().toString();
        boolean male = swmale.isChecked();
        String jensiatt;
        if (male) {
            jensiatt = "mr";
        } else {jensiatt = "mrs";

        }

        //3set the image in the fina limage view
        imfinal.setImageDrawable(message);

        //4 set text textview final
        tefinal.setText(jensiatt +" "+ namemessage + " is crying");
    }

    public void look(View view) {
        //1 farakhani  views
        ImageView imright = (ImageView) findViewById(R.id.firsrightimage);
        EditText edname = (EditText) findViewById(R.id.entername);
        ImageView imfinal = (ImageView) findViewById(R.id.finalimage);
        TextView tefinal = (TextView) findViewById(R.id.textviewfinal);
        Switch swmale = (Switch) findViewById(R.id.switchmale);

        //2 get the image of them
        Drawable message = imright.getDrawable();

        String namemessage = edname.getText().toString();
        boolean male = swmale.isChecked();
        String jensiat;
        if (male) {
            jensiat = "mr";
        } else {
            jensiat = "mrs";
        }
            //3set the image in the fina limage view
            imfinal.setImageDrawable(message);

            //4 set text texview final
            tefinal.setText(jensiat +" "+ namemessage + " is wishing");




    }

}