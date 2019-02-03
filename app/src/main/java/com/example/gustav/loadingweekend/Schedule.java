package com.example.gustav.loadingweekend;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;

public class Schedule {

    DateTime currentTime = new DateTime();
    int currentWeekday = currentTime.getDayOfWeek();
    static LocalTime moStart, moEnd, tuStart, tuEnd, weStart, weEnd, thStart, thEnd, frStart, frEnd;

    // creating a Schedule with start and end times for every day as parameters
    public Schedule(LocalTime moStart, LocalTime moEnd, LocalTime tuStart, LocalTime tuEnd, LocalTime weStart, LocalTime weEnd,
                    LocalTime thStart, LocalTime thEnd, LocalTime frStart, LocalTime frEnd) {

        this.moStart = moStart;
        this.moEnd = moEnd;
        this.tuStart = tuStart;
        this.tuEnd = tuEnd;
        this.weStart = weStart;
        this.weEnd = weEnd;
        this.thStart = thStart;
        this.thEnd = thEnd;
        this.frStart = frStart;
        this.frEnd = frEnd;
    }

    // method to call when MainMethod wants to know how much to fill the progress bar
    public static long getProgress(Schedule schedule) {
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
                todayStartTime = moStart;
                todayEndTime = moEnd;
            }
            case 2: {
                todayStartTime = tuStart;
                todayEndTime = tuEnd;
            }
            case 3: {
                todayStartTime = weStart;
                todayEndTime = weEnd;
            }
            case 4: {
                todayStartTime = thStart;
                todayEndTime = thEnd;
            }
            case 5: {
                todayStartTime = frStart;
                todayEndTime = frEnd;
            }
            default: {
                todayStartTime = new LocalTime(8, 00);
                todayEndTime = new LocalTime(17, 00);
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

        private int getMondayLength() {
            return (this.moEnd.getMillisOfDay()-moStart.getMillisOfDay())/60000;
        }
    }
}
