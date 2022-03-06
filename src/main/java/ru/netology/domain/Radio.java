package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor


public class Radio {


    private int currentRadioStation;
    private int currentVolume;
    private int numberRadioStation = 9;


    public Radio() {
        // конструктор без параметров
    }

    public Radio(int numberRadioStation) {
        // констурктор с параметрами кол-во радиостанций
        this.numberRadioStation = numberRadioStation;
    }

    public void setCurrentRadioStation(int numberRadioStation) {
        if (currentRadioStation > numberRadioStation) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = numberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberRadioStation() {
        //get numberRadioStation
        return numberRadioStation;
    }


    public void nextNumberRadioStation() {
        // следующая радиостанция по новым параметрам
        if (this.currentRadioStation >= this.numberRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        if (this.currentRadioStation >= 0) {
            this.currentRadioStation = this.currentRadioStation + 1;
        }
    }

    public void prevNumberRadioStation() {
        // предыдущая радиостанция
        if (this.currentRadioStation <= 0) {
            this.currentRadioStation = this.numberRadioStation;
            return;
        }
        if (this.currentRadioStation > 0) {
            this.currentRadioStation = this.currentRadioStation - 1;
        }

    }


    public void moreVolume() {
        //увеличение звука
        if (currentVolume < 100) {
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
        if (currentVolume > 100) {
            this.currentVolume = 100;
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