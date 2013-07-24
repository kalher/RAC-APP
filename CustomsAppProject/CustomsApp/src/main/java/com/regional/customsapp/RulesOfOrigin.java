package com.regional.customsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kjjj on 7/24/13.
 */
public class RulesOfOrigin extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_of_origin);

        Button button =(Button)findViewById(R.id.backbutton2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RulesOfOrigin.this,Customs.class);
                startActivity(intent);
            }
        });

    }
}