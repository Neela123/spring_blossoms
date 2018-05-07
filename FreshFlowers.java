package com.example.shilpa.springblossoms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FreshFlowers extends Activity {
    /** Called when the activity is first created. */
    ImageView flower1_display , flower2_display ,flower3_display,flower4_display;
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.freshandartificalflowers);




        flower1_display = (ImageView) findViewById(R.id.phone_icon4);
        flower1_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(FreshFlowers.this, FlowerDescrip1.class);
                startActivity(i);
            }
        });

        flower2_display = (ImageView) findViewById(R.id.phone_icon5);
        flower2_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(FreshFlowers.this, FlowerDescrip2.class);
                startActivity(i);
            }
        });


        flower3_display= (ImageView) findViewById(R.id.phone_icon6);
        flower3_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(FreshFlowers.this, FlowerDescrip3.class);
                startActivity(i);
            }
        });

        flower4_display= (ImageView) findViewById(R.id.phone_icon7);
        flower4_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(FreshFlowers.this, FlowerDescrip4.class);
                startActivity(i);
            }
        });




    }
}
