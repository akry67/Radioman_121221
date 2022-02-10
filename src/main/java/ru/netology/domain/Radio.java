package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberRadioStation = 9;
    private int maxNumberRadioStation = getNumberRadioStation();

    public Radio() {
        // конструктор без параметров
    }

    public Radio(int numberRadioStation) {
        // констурктор с параметрами кол-во радиостанций
        this.numberRadioStation = numberRadioStation;
    }


    public int getNumberRadioStation() {
        //get numberRadioStation
        return numberRadioStation;
    }


    public void nextNumberRadioStation() {
        // следующая радиостанция по новым параметрам
        if (numberRadioStation >= maxNumberRadioStation) {
            this.numberRadioStation = 0;
            return;
        }
        if (numberRadioStation >= 0) {
            this.numberRadioStation = numberRadioStation + 1;
        }
    }

    public void prevNumberRadioStation() {
        // предыдущая радиостанция
        if (numberRadioStation <= 0) {
            this.numberRadioStation = maxNumberRadioStation;
            return;
        }
        if (numberRadioStation > 0) {
            this.numberRadioStation = numberRadioStation - 1;
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
