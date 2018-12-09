package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Create an Account link */
    public void goToCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAnAccount.class);
        startActivity(intent);
    }

    public void goToDogDirectory(View view){




        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }



}
