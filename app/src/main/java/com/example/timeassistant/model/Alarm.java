package com.example.timeassistant.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alarm {

    private int amPm, hour, minute;
    private boolean[] weekDays;
    private String textToSpeech;

}
