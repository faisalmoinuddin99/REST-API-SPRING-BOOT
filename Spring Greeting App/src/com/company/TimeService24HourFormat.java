package com.company;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class TimeService24HourFormat implements TimeService {
    @Override
    public int getCurrentTime() {
        int hour = LocalDateTime.now().getHour();
        return hour > 24 ? hour - 24 : hour;
    }
}
