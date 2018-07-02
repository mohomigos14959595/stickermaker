package com.example.sazgar.findstuff;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText name;
    Button sayhello;
    TextView text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findview);

        sayhello = (Button) findViewById(R.id.sayhello);
        name=(EditText) findViewById(R.id.name);
        text2=(TextView)findViewById(R.id.text2);

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


    }

