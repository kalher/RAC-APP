package com.regional.customsapp;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;


public class Customs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customs_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.customs, menu);
        return true;
    }

    //Customs App Code ...

    ImageView image = (ImageView) findViewById(R.id.logo_view);
    image.setImageResource(R.drawable.wodem);


}
