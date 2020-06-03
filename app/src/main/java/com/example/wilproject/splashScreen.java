package com.example.wilproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Context context = this;
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(Exception ex){
                    Toast.makeText(context, "Something went wrong",Toast.LENGTH_LONG).show();
                }finally {
                    finish();
                    startActivity(new Intent(context,MainActivity.class));
                }
            }
        };
        timer.start();
    }
}
