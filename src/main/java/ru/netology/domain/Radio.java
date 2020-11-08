package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation = 9;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void onNextStation() {
        if (currentStation <= maxStation) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
    }

    public void onPrevStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
            this.currentStation = currentStation - 1;
        }

    public Radio(int currentStation, int minStation, int maxStation) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void onNextVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void onPrevVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        }
    }
}