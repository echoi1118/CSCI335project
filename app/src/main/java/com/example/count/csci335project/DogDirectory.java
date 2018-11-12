package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DogDirectory extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_directory);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    /**public void onItemClick(MenuItem item)
    {


    }*/

    public void goToDogDirectory(View view){
        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }

    public void goToBeyonce(View view){
        Intent intent = new Intent(this, Beyonce.class);
        startActivity(intent);
    }

    public void goToJayZ(View view){
        Intent intent = new Intent(this, JayZ.class);
        startActivity(intent);
    }

    public void goToKim(View view) {
        Intent intent = new Intent(this, Kim.class);
        startActivity(intent);
    }

    public void goToKanye(View view){
        Intent intent = new Intent(this, Kanye.class);
        startActivity(intent);
    }

    public void goToSelena(View view){
        Intent intent = new Intent(this, Selena.class);
        startActivity(intent);
    }
    public void goToJB(View view){
        Intent intent = new Intent(this, JB.class);
        startActivity(intent);
    }



}
