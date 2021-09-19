package com.bridgelabz.moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper__ShouldReturnSad() {
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String actualResult=moodanalyser.analyseMood("User is Sad");
        Assert.assertEquals("Sad",actualResult);
    }
    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", actualResult);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}
