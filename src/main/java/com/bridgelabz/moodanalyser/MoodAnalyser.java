package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {

        }
        return "Happy";
    }
    public static String message;


    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();

    }

    public MoodAnalyser() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
        }
        return "Happy";
    }
}

