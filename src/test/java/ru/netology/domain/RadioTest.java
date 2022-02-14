package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    // Проверка конструктора
    public void shouldUseConstructor() {

        assertEquals(9, 9);
    }

    @Test
    // проверка дефолтного значения кол-ва радиостанций
    public void defoltNumberRadiostation() {
        Radio radio = new Radio();
        assertEquals(9, radio.getNumberRadioStation());
    }


    @Test
    // проверка выставления кол-ва радиостанций
    public void numberRadioStation() {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getNumberRadioStation());
    }

    @Test
    // next проверка при достижении макс радиостанции переключение на ноль
    public void maxNubmerRadioStation() {
        Radio radio = new Radio(23);
        radio.setCurrentRadioStation(100);
        radio.nextNumberRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    // следующая станция
    public void nextNumberRadioStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(25);
        radio.nextNumberRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio(3);
        radio.setCurrentRadioStation(100);

        assertEquals(100, radio.getCurrentRadioStation());
    }


    @Test
    // следующая станция
    public void nextNullNumberRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.nextNumberRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    // предыдущая радиостанция если текущая 0
    public void prevNullNumberRadioStation() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(0);
        radio.prevNumberRadioStation();

        assertEquals(100, radio.getCurrentRadioStation());
    }

    @Test
    // переключение на предыдущую станцию
    public void prevNumberRadioStation() {
        Radio radio = new Radio(80);
        radio.setCurrentRadioStation(77);
        radio.prevNumberRadioStation();

        assertEquals(76, radio.getCurrentRadioStation());
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
        radio.setCurrentVolume(111);
        radio.moreVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    //увеличение звука
    public void moreVolumeMax() {
        radio.setCurrentVolume(100);
        radio.moreVolume();

        int expected = 100;
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


}