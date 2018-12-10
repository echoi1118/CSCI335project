package com.example.count.csci335project;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateAcctSuccessNotice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acct_success_notice);

        final Context context = this;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }

    /** Called when the user clicks the text to return them to the login screen */
    public void goToLoginScreen(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
