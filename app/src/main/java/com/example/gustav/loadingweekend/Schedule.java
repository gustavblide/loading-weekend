package com.example.gustav.loadingweekend;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class Schedule {

    Workday monday = new Workday(Workday.Weekday.MONDAY);
    Workday tuesday = new Workday(Workday.Weekday.TUESDAY);
    Workday wednesday = new Workday(Workday.Weekday.WEDNESDAY);
    Workday thursday = new Workday(Workday.Weekday.THURSDAY);
    Workday friday = new Workday(Workday.Weekday.FRIDAY);

    public Workday getMonday() {
        return this.monday;
    }

    public Workday getTuesday() {
        return this.tuesday;
    }

    public Workday getWednesday() {
        return this.wednesday;
    }

    public Workday getThursday() {
        return this.thursday;
    }

    public Workday getFriday() {
        return this.friday;
    }

    public int getLengthOfWorkWeek () {

        return  getMonday().getDayLength() +
                getTuesday().getDayLength() +
                getWednesday().getDayLength() +
                getThursday().getDayLength() +
                getFriday().getDayLength();
    }

    // method to call when MainMethod wants to know how much to fill the progress bar
    public long getProgress() {
        int progressBarMax = 1000;
        DateTime currentTime = new DateTime();
        int currentWeekday = currentTime.getDayOfWeek();
        // if today is weekend, simply fill the whole progress bar.
        if (currentWeekday > 5) return progressBarMax;

        int passedWorkdays = currentWeekday - 1;
        double minutesWorkedToday;
        LocalTime todayStartTime;
        LocalTime todayEndTime;
        switch (currentWeekday) {
            case 1: {
                todayStartTime = monday.getDayStartTime();
                todayEndTime = monday.getDayEndTime();
            }
            case 2: {
                todayStartTime = tuesday.getDayStartTime();
                todayEndTime = tuesday.getDayEndTime();
            }
            case 3: {
                todayStartTime = wednesday.getDayStartTime();
                todayEndTime = wednesday.getDayEndTime();
            }
            case 4: {
                todayStartTime = thursday.getDayStartTime();
                todayEndTime = thursday.getDayEndTime();
            }
            case 5: {
                todayStartTime = friday.getDayStartTime();
                todayEndTime = friday.getDayEndTime();
            }
            default: {
                todayStartTime = new LocalTime(8, 00);
                todayEndTime = new LocalTime(17, 00);
            }
        }

        if (currentTime.getMillisOfDay() < todayStartTime.getMillisOfDay()) {
            minutesWorkedToday = 0;
        } else if (currentTime.getMillisOfDay() > todayEndTime.getMillisOfDay()) {
            minutesWorkedToday = (todayEndTime.getMillisOfDay()-todayStartTime.getMillisOfDay())/60000;
        } else {
            minutesWorkedToday = (currentTime.getMillisOfDay()-todayStartTime.getMillisOfDay())/60000;
        }
        double minutesWorkedThisWeek = (9 * 60 * passedWorkdays) + minutesWorkedToday;
        double minutesInAWorkweek = 9 * 60 * 5;
        double partOfWeekWorked = minutesWorkedThisWeek / minutesInAWorkweek;
        double progress = progressBarMax * partOfWeekWorked;
        return Math.round(progress);
        }

//        private int getMondayLength() {
//            return (this.moEnd.getMillisOfDay()-moStart.getMillisOfDay())/60000;
//        }
    }

