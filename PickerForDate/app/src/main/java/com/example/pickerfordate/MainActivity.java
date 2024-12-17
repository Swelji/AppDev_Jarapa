package com.example.pickerfordate;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to show the date picker when the button is clicked
    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.datepicker));
    }

    // Method to process the date picker result
    public void processDatePickerResult(int year, int month, int day) {
        // Month is 0-based, so you may want to add 1 to the month value
        String selectedDate = day + "/" + (month + 1) + "/" + year;
        Toast.makeText(this, getString(R.string.date_) + selectedDate, Toast.LENGTH_SHORT).show();
    }
}
