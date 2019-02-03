package com.example.gustav.loadingweekend;

import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import org.joda.time.LocalTime;


public class MainActivity extends AppCompatActivity {

    LocalTime local8AM = new LocalTime(8,00);
    LocalTime local5PM = new LocalTime(17,00);

    Schedule schedule = new Schedule(local8AM,local5PM,local8AM,local5PM,local8AM,local5PM,local8AM,local5PM,local8AM,local5PM);

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

        View mondayView = findViewById(R.id.monday_view);
        View tuesdayView = findViewById(R.id.tuesday_view);
        View wednesdayView = findViewById(R.id.wednesday_view);
        View thursdayView = findViewById(R.id.thursday_view);
        View fridayView = findViewById(R.id.friday_view);


       /*  mondayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, schedule.monday.getDayLength()));
        tuesdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, schedule.tuesday.getDayLength()));
        wednesdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, schedule.wednesday.getDayLength()));
        thursdayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, schedule.thursday.getDayLength()));
        fridayView.setLayoutParams(new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.MATCH_PARENT, schedule.friday.getDayLength()));

        int progress = (int) Schedule.getProgress(schedule);
        progressBar.setProgress(progress);*/

    }
}