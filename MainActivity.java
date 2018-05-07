package com.example.shilpa.springblossoms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends Activity {

private static int SPLASH_TIME_OUT =4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // addListenerOnButton();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i1 = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i1);
                finish();
            }
        },SPLASH_TIME_OUT);




    }




            }