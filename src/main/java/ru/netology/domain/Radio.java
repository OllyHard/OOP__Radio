package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation = 9;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if(currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void onNextStation() {
        if (currentStation < maxStation) {
            this.currentStation++;
        }
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
    }

    public void onPrevStation() {
        if (currentStation > minStation) {
            this.currentStation--;
        }
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
    }

    public Radio(int currentStation, int minStation, int maxStation) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
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
        if (currentVolume == maxVolume) {
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



