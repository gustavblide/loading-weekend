package com.example.gustav.loadingweekend;

import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import org.joda.time.LocalTime;


public class MainActivity extends AppCompatActivity {

    LocalTime local8AM = new LocalTime(8,00);
    LocalTime local5PM = new LocalTime(17,00);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.progress_bar_layout);
        ProgressBar progressBar = findViewById(R.id.progress_bar);
        // setting progress bar to 0 by default
        progressBar.setProgress(0);

        Button scheduleButton = findViewById(R.id.schedule_button);
        scheduleButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getSupportFragmentManager();
                ScheduleFragment scheduleFragment = new ScheduleFragment();
                fm.beginTransaction().add(R.id.progress_bar_layout,scheduleFragment).commit();
            }
        });

        LinearLayout weekdays = findViewById(R.id.weekdays);
        TextView mondayView = findViewById(R.id.monday_view);
        TextView tuesdayView = findViewById(R.id.tuesday_view);
        TextView wednesdayView = findViewById(R.id.wednesday_view);
        TextView thursdayView = findViewById(R.id.thursday_view);
        TextView fridayView = findViewById(R.id.friday_view);

//        Spinner mondayStartHourSpinner = findViewById(R.id.monday_start_hour);
//        String[] hours = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" };
////create an adapter to describe how the items are displayed, adapters are used in several places in android.
////There are multiple variations of this, but this is the basic variant.
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hours);
////set the spinners adapter to the previously created one.
//        mondayStartHourSpinner.setAdapter(adapter);
        // TODO starting with this one...

        Schedule schedule = new Schedule();


        Workday monday = schedule.getMonday();
        monday.setDayStartTime(local8AM);
        monday.setDayEndTime(local5PM);

        Workday tuesday = schedule.getTuesday();
        tuesday.setDayStartTime(local8AM);
        tuesday.setDayEndTime(local5PM);

        Workday wednesday = schedule.getWednesday();
        wednesday.setDayStartTime(local8AM);
        wednesday.setDayEndTime(local5PM);

        Workday thursday = schedule.getThursday();
        thursday.setDayStartTime(local8AM);
        thursday.setDayEndTime(local5PM);

        Workday friday = schedule.getFriday();
        friday.setDayStartTime(local8AM);
        friday.setDayEndTime(local5PM);

        float lengthOfWorkWeek = schedule.getLengthOfWorkWeek();
        float weekdaysWeightSum = 5;
        weekdays.setWeightSum(weekdaysWeightSum);

        float mondayWiewWeight = weekdaysWeightSum / ( lengthOfWorkWeek / monday.getDayLength());
        float tuesdayWiewWeight = weekdaysWeightSum / ( lengthOfWorkWeek / tuesday.getDayLength());
        float wednesdayWiewWeight = weekdaysWeightSum / ( lengthOfWorkWeek / wednesday.getDayLength());
        float thursdayWiewWeight = weekdaysWeightSum / ( lengthOfWorkWeek / thursday.getDayLength());
        float fridayWiewWeight = weekdaysWeightSum / ( lengthOfWorkWeek / friday.getDayLength());


        mondayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, mondayWiewWeight));
        tuesdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, tuesdayWiewWeight));
        wednesdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, wednesdayWiewWeight));
        thursdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, thursdayWiewWeight));
        fridayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, fridayWiewWeight));

        int progress = (int) schedule.getProgress();
        progressBar.setProgress(progress);
    }
}