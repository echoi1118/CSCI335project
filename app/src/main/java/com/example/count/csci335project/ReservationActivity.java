package com.example.count.csci335project;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class ReservationActivity extends AppCompatActivity {

    public String date;

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    public static final String DOG_NAME_RESERVED = "com.example.myfirstapp.DOG_NAME_MESSAGE";
    public static final String DATE_RESERVED = "com.example.myfirstapp.DATE_MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(Beyonce.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView dogDesc = findViewById(R.id.dogs);
        dogDesc.setText(message);

        mDisplayDate = (TextView) findViewById(R.id.DateSelection);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        ReservationActivity.this,
                        R.style.AppTheme,
                        mDateSetListener,
                        year,
                        month,
                        day
                );

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;

                date = month + "/" + day +"/" + year;
                mDisplayDate.setText(date);
            }
        };

    }


    public void onReserve(View view){



        Intent intent = new Intent(this, MyReservations.class);

        TextView textView = findViewById(R.id.dog_name);
        String dogName = textView.getText().toString();
        intent.putExtra(DOG_NAME_RESERVED, dogName);

        intent.putExtra(DATE_RESERVED, date);

        startActivity(intent);


    }

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
