package com.example.count.csci335project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateAnAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_an_account);
    }

    /** Called when the user clicks the "Create" (account) button */
    public void goToCreateAccountSuccessPage(View view) {
        Intent intent = new Intent(this, CreateAcctSuccessNotice.class);
        startActivity(intent);
    }
}