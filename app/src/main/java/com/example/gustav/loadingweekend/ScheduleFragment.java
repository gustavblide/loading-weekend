package com.example.gustav.loadingweekend;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ScheduleFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.schedule_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        String[] hours = new String[]{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" };
        String[] minutes = new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

        // Monday start hour
        ArrayAdapter<String> mondayStartHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner mondayStartHourSpinner = getView().findViewById(R.id.monday_start_hour);
        mondayStartHourSpinner.setBackgroundColor(Color.LTGRAY);
        mondayStartHourSpinner.setAdapter(mondayStartHourAdapter);

        // Monday start minute
        ArrayAdapter<String> mondayStartMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner mondayStartMinuteSpinner = getView().findViewById(R.id.monday_start_minute);
        mondayStartMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        mondayStartMinuteSpinner.setAdapter(mondayStartMinuteAdapter);

        // Monday end hour
        ArrayAdapter<String> mondayEndHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner mondayEndHourSpinner = getView().findViewById(R.id.monday_end_hour);
        mondayEndHourSpinner.setBackgroundColor(Color.LTGRAY);
        mondayEndHourSpinner.setAdapter(mondayEndHourAdapter);

        // Monday end minute
        ArrayAdapter<String> mondayEndMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner mondayEndMinuteSpinner = getView().findViewById(R.id.monday_end_minute);
        mondayEndMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        mondayEndMinuteSpinner.setAdapter(mondayEndMinuteAdapter);

        // Tuesday start hour
        ArrayAdapter<String> tuesdayStartHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner tuesdayStartHourSpinner = getView().findViewById(R.id.tuesday_start_hour);
        tuesdayStartHourSpinner.setBackgroundColor(Color.LTGRAY);
        tuesdayStartHourSpinner.setAdapter(tuesdayStartHourAdapter);

        // Tuesday start minute
        ArrayAdapter<String> tuesdayStartMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner tuesdayStartMinuteSpinner = getView().findViewById(R.id.tuesday_start_minute);
        tuesdayStartMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        tuesdayStartMinuteSpinner.setAdapter(tuesdayStartMinuteAdapter);

        // Tuesday end hour
        ArrayAdapter<String> tuesdayEndHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner tuesdayEndHourSpinner = getView().findViewById(R.id.tuesday_end_hour);
        tuesdayEndHourSpinner.setBackgroundColor(Color.LTGRAY);
        tuesdayEndHourSpinner.setAdapter(tuesdayEndHourAdapter);

        // Tuesday end minute
        ArrayAdapter<String> tuesdayEndMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner tuesdayEndMinuteSpinner = getView().findViewById(R.id.tuesday_end_minute);
        tuesdayEndMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        tuesdayEndMinuteSpinner.setAdapter(tuesdayEndMinuteAdapter);

        // Wednesday start hour
        ArrayAdapter<String> wednesdayStartHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner wednesdayStartHourSpinner = getView().findViewById(R.id.wednesday_start_hour);
        wednesdayStartHourSpinner.setBackgroundColor(Color.LTGRAY);
        wednesdayStartHourSpinner.setAdapter(wednesdayStartHourAdapter);

        // Wednesday start minute
        ArrayAdapter<String> wednesdayStartMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner wednesdayStartMinuteSpinner = getView().findViewById(R.id.wednesday_start_minute);
        wednesdayStartMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        wednesdayStartMinuteSpinner.setAdapter(wednesdayStartMinuteAdapter);

        // Wednesday end hour
        ArrayAdapter<String> wednesdayEndHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner wednesdayEndHourSpinner = getView().findViewById(R.id.wednesday_end_hour);
        wednesdayEndHourSpinner.setBackgroundColor(Color.LTGRAY);
        wednesdayEndHourSpinner.setAdapter(wednesdayEndHourAdapter);

        // Wednesday end minute
        ArrayAdapter<String> wednesdayEndMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner wednesdayEndMinuteSpinner = getView().findViewById(R.id.wednesday_end_minute);
        wednesdayEndMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        wednesdayEndMinuteSpinner.setAdapter(wednesdayEndMinuteAdapter);

        // Thursday start hour
        ArrayAdapter<String> thursdayStartHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner thursdayStartHourSpinner = getView().findViewById(R.id.thursday_start_hour);
        thursdayStartHourSpinner.setBackgroundColor(Color.LTGRAY);
        thursdayStartHourSpinner.setAdapter(thursdayStartHourAdapter);

        // Thursday start minute
        ArrayAdapter<String> thursdayStartMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner thursdayStartMinuteSpinner = getView().findViewById(R.id.thursday_start_minute);
        thursdayStartMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        thursdayStartMinuteSpinner.setAdapter(thursdayStartMinuteAdapter);

        // Thursday end hour
        ArrayAdapter<String> thursdayEndHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner thursdayEndHourSpinner = getView().findViewById(R.id.thursday_end_hour);
        thursdayEndHourSpinner.setBackgroundColor(Color.LTGRAY);
        thursdayEndHourSpinner.setAdapter(thursdayEndHourAdapter);

        // Thursday end minute
        ArrayAdapter<String> thursdayEndMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner thursdayEndMinuteSpinner = getView().findViewById(R.id.thursday_end_minute);
        thursdayEndMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        thursdayEndMinuteSpinner.setAdapter(thursdayEndMinuteAdapter);

        // Friday start hour
        ArrayAdapter<String> fridayStartHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner fridayStartHourSpinner = getView().findViewById(R.id.friday_start_hour);
        fridayStartHourSpinner.setBackgroundColor(Color.LTGRAY);
        fridayStartHourSpinner.setAdapter(fridayStartHourAdapter);

        // Friday start minute
        ArrayAdapter<String> fridayStartMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner fridayStartMinuteSpinner = getView().findViewById(R.id.friday_start_minute);
        fridayStartMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        fridayStartMinuteSpinner.setAdapter(fridayStartMinuteAdapter);

        // Friday end hour
        ArrayAdapter<String> fridayEndHourAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, hours);
        Spinner fridayEndHourSpinner = getView().findViewById(R.id.friday_end_hour);
        fridayEndHourSpinner.setBackgroundColor(Color.LTGRAY);
        fridayEndHourSpinner.setAdapter(fridayEndHourAdapter);

        // Friday end minute
        ArrayAdapter<String> fridayEndMinuteAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, minutes);
        Spinner fridayEndMinuteSpinner = getView().findViewById(R.id.friday_end_minute);
        fridayEndMinuteSpinner.setBackgroundColor(Color.LTGRAY);
        fridayEndMinuteSpinner.setAdapter(fridayEndMinuteAdapter);
    }
}