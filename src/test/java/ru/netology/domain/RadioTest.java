package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldReturnSoundsVolumeMore() {
        Radio radio = new Radio();
        int soundVolume = 11;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnSoundsVolumeLess() {
        Radio radio = new Radio();
        int soundVolume = -1;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnSoundsVolumeInRange() {
        Radio radio = new Radio();
        int soundVolume = 5;
        int expected = 5;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void onNextSoundInRange() {
        Radio radio = new Radio();
        int soundVolume = 5;
        int expected = 6;
        radio.setSoundVolume(soundVolume);
        radio.onNextSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void onNextSoundMax() {
        Radio radio = new Radio();
        int soundVolume = 10;
        int expected = 10;
        radio.setSoundVolume(soundVolume);
        radio.onNextSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void onPreviousSoundInRange() {
        Radio radio = new Radio();
        int soundVolume = 5;
        int expected = 4;
        radio.setSoundVolume(soundVolume);
        radio.onPreviousSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void onPreviousSoundMin() {
        Radio radio = new Radio();
        int soundVolume = 0;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        radio.onPreviousSound();
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnCurrentStationInRange() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 5;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldReturnCurrentStationMoreRange() {
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldReturnCurrentStationLessRange() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onNextStationInRange() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 6;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onNextStationMax() {
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onPreviousStationMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        radio.setCurrentStation(currentStation);
        radio.onPreviousStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onPreviousStationInRange() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 4;
        radio.setCurrentStation(currentStation);
        radio.onPreviousStation();
        assertEquals(expected, radio.getCurrentStation());
    }
}