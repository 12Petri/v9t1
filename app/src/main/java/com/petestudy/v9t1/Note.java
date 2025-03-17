package com.petestudy.v9t1;

import java.util.Calendar;

public class Note {
    public int Id;
    public  String title;
    public  String content;
    public  String timeAndDate;
    private static int noteCounter = 0;

    public Note(String title, String content) {
        noteCounter++;
        this.Id = noteCounter;
        this.title = title;
        this.content = content;

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) +1;
        int year = calendar.get(Calendar.YEAR);
        this.timeAndDate = String.format("%02d:%02d %d.%d.%d", hour, minute, day, month, year);
    }
}
