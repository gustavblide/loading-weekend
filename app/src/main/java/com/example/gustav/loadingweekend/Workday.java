package com.example.gustav.loadingweekend;

import org.joda.time.LocalTime;
import org.joda.time.Minutes;

public class Workday {

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}

    private LocalTime dayBeginsAt;
    private LocalTime dayEndsAt;
    private Weekday weekday;

    public Workday(Weekday weekday) {

        this.weekday = weekday;

    }

    public Weekday getWeekday() {
        return weekday;
    }

    public LocalTime getDayStartTime() {
        return dayBeginsAt;
    }

    public LocalTime getDayEndTime() {
        return dayEndsAt;
    }

    public int getDayLength() {
        return Minutes.minutesBetween(dayBeginsAt, dayEndsAt).getMinutes();
    }

    public void setDayStartTime(LocalTime time) {
        this.dayBeginsAt = time;
    }

    public void setDayEndTime(LocalTime time) {
        this.dayEndsAt = time;
    }
}
