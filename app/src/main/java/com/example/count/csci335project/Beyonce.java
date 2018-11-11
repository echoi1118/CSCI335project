package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Beyonce extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Test string";//
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dogs:
                        mTextMessage.setText(R.string.dogs);
                        return true;
                    case R.id.favorites:
                        mTextMessage.setText(R.string.favorites);
                        return true;
                    case R.id.reservations:
                        mTextMessage.setText(R.string.reservations);
                        return true;
                    case R.id.our_mission:
                        mTextMessage.setText(R.string.our_mission);
                        return true;
                }
                return false;
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beyonce);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void onItemClick(MenuItem item) {


    }

    public void goToDogDirectory(View view) {
        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }

    /** Beyonce - Reservation button used to pass data*/
    public void passInfoToReservationActivity(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        TextView descOfDog = findViewById(R.id.DogDescription);

        String message = descOfDog.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}