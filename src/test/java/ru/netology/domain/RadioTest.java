package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    //текущая радиостанция
    public void getCurrentRadioStation() {
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    //текущая радиостанция если больше 10
    public void getCurrentRadioStationUnder() {
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //текущая радиостанция
    public void getCurrentRadioStationLow() {
        radio.setCurrentRadioStation(-11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }


    @Test
    //следующая радиостанция
    public void nextCurrentRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.nextCurrentRadioStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //следующая радиостанция если больше 9
    public void nextCurrentRadioStationUnder() {
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //предыдущая радиостанция
    public void prevCurrentRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.prevCurrentRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    //предыдущая радиостанция
    public void prevCurrentRadioStationLow() {
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    //уменьшение звука
    public void underVolume() {
        radio.setCurrentVolume(2);
        radio.underVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    //уменьшение звука
    public void underVolumeNul() {
        radio.setCurrentVolume(0);
        radio.underVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    //уменьшение звука
    public void underVolumeLow() {
        radio.setCurrentVolume(-10);
        radio.underVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }


    @Test
    //увеличение звука
    public void moreVolumeUnder() {
        radio.setCurrentVolume(11);
        radio.moreVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    //увеличение звука
    public void moreVolumeMax() {
        radio.setCurrentVolume(10);
        radio.moreVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    //увеличение звука
    public void moreVolume() {
        radio.setCurrentVolume(1);
        radio.moreVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    //текущая громкость
    public void getCurrentVolume() {
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    //текущая громкость
    public void getCurrentVolumeLow() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    //текущая громкость
    public void getCurrentVolumeUnder() {
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
}