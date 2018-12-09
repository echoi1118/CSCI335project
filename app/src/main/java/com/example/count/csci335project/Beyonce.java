package com.example.count.csci335project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.count.csci335project.DogModel.favoriteBool;

public class Beyonce extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Test string";//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beyonce);

        if(!favoriteBool[0])
        {
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_empty_favorites);
        }
        else{
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_favorites);
        }

    }


    public void Favorites(View view){
        if(favoriteBool[0])
        {
            favoriteBool[0] = false;
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_empty_favorites);
        }
        else{
            favoriteBool[0] = true;
            ImageButton FaveButton = findViewById(R.id.FavoriteButton);
            FaveButton.setImageResource(R.drawable.ic_favorites);
        }

    }


    /** Reserve Beyonce */
    public void goToReserveBeyonce(View view) {
        Intent intent = new Intent(this, ReservationActivity.class);
        Bundle extras = new Bundle();

        TextView dog_name = findViewById(R.id.res_dog_name);
        TextView dog_desc = findViewById(R.id.dog_desc);

        extras.putString("key_name", dog_name.getText().toString());
        extras.putString("key_desc", dog_desc.getText().toString());
        extras.putInt("key_img", R.drawable.dog1image);

        intent.putExtras(extras);
        startActivity(intent);
    }

    /** Bottom navigation links */
    public void goToDogDirectory(View view){
        Intent intent = new Intent(this, DogDirectory.class);
        startActivity(intent);
    }

    public void goToFavorites(View view){
        Intent intent = new Intent(this, Favorites.class);
        startActivity(intent);
    }

    public void goToOurMission(View view){
        Intent intent = new Intent(this, OurMission.class);
        startActivity(intent);
    }

    public void goToMyReservations(View view){
        Intent intent = new Intent(this, MyReservations.class);
        startActivity(intent);
    }
}