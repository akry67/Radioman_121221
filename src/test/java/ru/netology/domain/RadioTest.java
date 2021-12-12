package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    //текущая радиостанция
    public void getCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    //текущая радиостанция если больше 10
    public void getCurrentRadioStationUnder() {
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
        radio.currentRadioStation = 1;
        radio.nextCurrentRadioStation();

        int expected = 2;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }

    @Test
    //следующая радиостанция если больше 9
    public void nextCurrentRadioStationUnder() {
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
    //предыдущая радиостанция
    public void prevCurrentRadioStationUnder() {
        Radio radio = new Radio();
        radio.currentRadioStation = 0;
        radio.prevCurrentRadioStation();

        int expected = 9;
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
        radio.currentVolume = 2;
        radio.underVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);

    }

    @Test
    //уменьшение звука
    public void underVolumeUnder() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
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
    //увеличение звука
    public void moreVolumeUnder() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.moreVolume();

        int expected = 1;
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

    @Test
    //текущая громкость
    public void getCurrentVolumeLow() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}