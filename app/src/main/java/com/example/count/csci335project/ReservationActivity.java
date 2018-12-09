package com.example.count.csci335project;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DateFormat;

import static com.example.count.csci335project.DogModel.reservationBool;
import static com.example.count.csci335project.DogModel.reservationDate;

public class ReservationActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        // Get the Intent that started this activity and extract the string
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("key_name");
        String desc = extras.getString("key_desc");
        int pic = extras.getInt("key_img");

        // Capture the layout's TextView and set the string as its text
        TextView dog_name = findViewById(R.id.dog_name);
        TextView dog_desc = findViewById(R.id.dog_desc);
        ImageView dog_img = findViewById(R.id.dog_img);

        dog_name.setText(name);
        dog_desc.setText(desc);
        dog_img.setImageResource(pic);

        /** For the calendar/date picker function */
        TextView t = findViewById(R.id.DateSelection);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView error = findViewById(R.id.error_date);
                error.setVisibility(View.INVISIBLE);
                AppCompatDialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });
    }

    /** For the calendar/date picker function */
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.YEAR, year);
        c.set(java.util.Calendar.MONTH, month);
        c.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);

        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView DateSelection = findViewById(R.id.DateSelection);
        DateSelection.setText(currentDateString);
    }

    /** Reserve button functionality */
    public void reserveThisDog(View view) {

        TextView date = findViewById(R.id.DateSelection);
        if (date.getText().equals("Click me to select pickup date"))
        {
            TextView error = findViewById(R.id.error_date);
            error.setVisibility(View.VISIBLE);
        }
        else{

            TextView dog_name = findViewById(R.id.dog_name);
            String dogName = dog_name.getText().toString();
            String rDate = date.getText().toString();

            setReserved(dogName, rDate);

            Intent intent = new Intent(this, MyReservations.class);


            view.getContext().startActivity(intent);

        }
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


    public void setReserved(String name, String date){
        if (name.equals("Beyonce")) {
            reservationBool[0] = true;
            reservationDate[0] = date;
        } else if (name.equals("Jay-Z")) {
            reservationBool[1] = true;
            reservationDate[1] = date;
        } else if (name.equals("Kim")) {
            reservationBool[2] = true;
            reservationDate[2] = date;
        } else if (name.equals("Kanye")) {
            reservationBool[3] = true;
            reservationDate[3] = date;
        } else if (name.equals("Selena")) {
            reservationBool[4] = true;
            reservationDate[4] = date;
        } else if (name.equals("JB")) {
            reservationBool[5] = true;
            reservationDate[5] = date;
        }
    }
}


