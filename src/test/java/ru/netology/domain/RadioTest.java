package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    //текущая радиостанция
    public void getCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //следующая радиостанция
    public void nextCurrentRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.nextCurrentRadioStation();

        int expected = 0;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);


    }

    @Test
    //предыдущая радиостанция
    public void prevCurrentRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.prevCurrentRadioStation();

        int expected = 8;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }


    @Test
    // достижение максимальной громкости
    public void maxVolume() {
        Radio radio = new Radio();
        radio.maxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);

    }

    @Test
    // достижение минимальной громкости
    public void minVolume() {
        Radio radio = new Radio();
        radio.minVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);


    }


    @Test
    //уменьшение звука
    public void underVolume() {
        Radio radio = new Radio();
        radio.currentVolume = -110;
        radio.underVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);

    }

    @Test
    //увеличение звука
    public void moreVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 11;
        radio.moreVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }


    @Test
    //текущая громкость
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}