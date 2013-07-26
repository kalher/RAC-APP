package com.regional.customsapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Customs extends Activity {
    private ImageView image;
    private Button grossProfit;
    private Button harmonisedCode;
    private Button rulesOfOrigin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.customs_layout);

        image = (ImageView) findViewById(R.id.logo_view);

        grossProfit = (Button) findViewById(R.id.grossProfitCost);
        grossProfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,GrossProfit.class);
                startActivity(intent);
            }
        });

        harmonisedCode = (Button) findViewById(R.id.hsCode);
        harmonisedCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,HsCode.class);
                startActivity(intent);
            }
        });

        rulesOfOrigin = (Button) findViewById(R.id.rulesOfOrigin);
        rulesOfOrigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Customs.this,RulesOfOrigin.class);
                startActivity(intent);
            }
        });

       /* Button cancelButton=(Button) findViewById(R.id.cancelButtonOnCus);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
        });
*/


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.customs, menu);
        return true;
    }



}
