package com.regional.customsapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Customs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.customs_layout);

        ImageView image = (ImageView) findViewById(R.id.logo_view);

        Button grossProfit = (Button) findViewById(R.id.grossProfitCost);
        grossProfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,GrossProfit.class);
                startActivity(intent);
            }
        });

        Button harmonisedCode = (Button) findViewById(R.id.hsCode);
        harmonisedCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,HsCode.class);
                startActivity(intent);
            }
        });

        Button rulesOfOrigin = (Button) findViewById(R.id.rulesOfOrigin);
        rulesOfOrigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,RulesOfOrigin.class);
                startActivity(intent);
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.customs, menu);
        return true;
    }



}
