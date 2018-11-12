package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }

    /** Called when the user clicks the "Donate" button */
    public void goToDonateSuccessScreen(View view) {
        Intent intent = new Intent(this, DonateSuccessNotice.class);
        startActivity(intent);
    }
}
