package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        //диапазон от 0 до 9 радиостанция
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation() {
        if (currentRadioStation >= 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void prevCurrentRadioStation() {
        if (currentRadioStation <= 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        //getCurrentRadioStation - дай текущую радиостанцию
        return currentRadioStation;
    }

    public void moreVolume() {
        //увеличение звука
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }


    public void underVolume() {
        //уменьшение звука
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        //диапазон от 0 до 10 громкости
        if (currentVolume > 10) {
            this.currentVolume = 10;
            return;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getCurrentVolume() {
        // дай текущую громкость
        return currentVolume;
    }

}
