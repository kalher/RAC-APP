package com.regional.customsapp;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;


public class Customs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customs_layout);

        ImageView image = (ImageView) findViewById(R.id.logo_view);

        TextView grossProfit = (TextView) findViewById(R.id.grossProfitCost);
        TextView harmonisedCode = (TextView) findViewById(R.id.hsCode);
        TextView rulesOfOrigin = (TextView) findViewById(R.id.rulesOfOrigin);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.customs, menu);
        return true;
    }

    //Customs App Code ...





}
