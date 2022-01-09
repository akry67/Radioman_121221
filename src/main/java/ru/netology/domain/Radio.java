package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberRadioStation = 9;
    private int maxNumberRadioStation = getNumberRadioStation();


    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
    }

    public Radio(int numberRadioStation, int maxNumberRadioStation) {
        this.numberRadioStation = numberRadioStation;
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getNumberRadioStation() {
        return this.numberRadioStation;
    }

    public void nextNumberRadioStation() {
        if (this.numberRadioStation >= this.maxNumberRadioStation) {
            this.numberRadioStation = 0;
        } else {
            if (this.numberRadioStation >= 0) {
                ++this.numberRadioStation;
            }

        }
    }

    public void prevNumberRadioStation() {
        if (this.numberRadioStation <= 0) {
            this.numberRadioStation = this.maxNumberRadioStation;
        } else {
            if (this.numberRadioStation > 0) {
                --this.numberRadioStation;
            }

        }
    }

    public void moreVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

    }

    public void underVolume() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        }

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            this.currentVolume = 100;
        } else if (currentVolume < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }
}