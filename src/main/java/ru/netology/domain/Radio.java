package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int soundVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > 10) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void onNextSound() {
        if (soundVolume == 10) {
            this.soundVolume = soundVolume;
        }
        if (soundVolume < 10) {
            this.soundVolume++;
        }

    }

    public void onPreviousSound() {
        if (soundVolume > 0) {
            this.soundVolume--;
        }
        if (soundVolume == 0) {
            this.soundVolume = soundVolume;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void onNextStation() {
        if (currentStation < 9) {
            this.currentStation++;
        }
        if (currentStation == 9) {
            this.currentStation = 0;
        }
    }

    public void onPreviousStation() {
        if (currentStation > 0) {
            this.currentStation--;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }

}


