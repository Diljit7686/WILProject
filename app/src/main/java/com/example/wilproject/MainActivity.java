package com.example.wilproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mainMenuButton , signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainMenuButton = (Button) findViewById(R.id.button);

        signUpButton = (Button) findViewById(R.id.signUpBtnID);


        mainMenuButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
//
//        mainMenuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openNewActivity();
//            }
//        });
//    }
//    public void openNewActivity(){
//        Intent mainMenuIntent = new Intent(this, navigationActivity.class);
//        startActivity(mainMenuIntent);
//
////        Intent signUpIntent = new Intent(this, signUpActivity.class);
////        startActivity(signUpIntent);
//    }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button:
                Intent intent = new Intent(this,navigationActivity.class);
                startActivity(intent);
                break;


                case R.id.signUpBtnID:
                    Intent intent2 = new Intent(this,signUpActivity.class);
                    startActivity(intent2);
                    break;
        }

    }
}
