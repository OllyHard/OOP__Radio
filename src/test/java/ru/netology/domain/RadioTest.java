package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 5;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMoreMax() {
        Radio radio = new Radio();
        int currentStation = 11;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationLessMin() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onNextStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 6;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onNextStationIfMax() {
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onPrevStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        int expected = 4;
        radio.setCurrentStation(currentStation);
        radio.onPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void  onPrevStationMin() {
        Radio radio = new Radio();
        int currentStation = 1;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        radio.onPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void onPrevStationLessMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        radio.setCurrentStation(currentStation);
        radio.onPrevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void changeStation() {
        Radio radio = new Radio(0, 0, 20);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    void setCurrentVolumeInRange() {
        Radio radio = new Radio();
        int currentVolume = 50;
        int expected = 50;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMoreMax() {
        Radio radio = new Radio();
        int currentVolume = 101;
        int expected = 100;
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeLessMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        radio.onNextStation();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void onNextVolume() {
        Radio radio = new Radio();
        int currentVolume = 50;
        int expected = 51;
        radio.setCurrentVolume(currentVolume);
        radio.onNextVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void onNextVolumeIfMax() {
        Radio radio = new Radio();
        int currentVolume = 100;
        int expected = 100;
        radio.setCurrentVolume(currentVolume);
        radio.onNextVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void onPrevVolume() {
        Radio radio = new Radio();
        int currentVolume = 50;
        int expected = 49;
        radio.setCurrentVolume(currentVolume);
        radio.onPrevVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void onPrevVolumeIfMin() {
        Radio radio = new Radio();
        int currentVolume = 0;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        radio.onPrevVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}