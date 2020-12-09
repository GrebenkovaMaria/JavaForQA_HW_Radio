package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldPrevStationIfMoreMaxStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation = this.maxStation + 5;
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfLessZero() {
        Radio radio = new Radio();
        int expected = this.maxStation;
        radio.setCurrentStation(-1);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfZero() {
        Radio radio = new Radio();
        int expected = this.maxStation;
        radio.setCurrentStation(0);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfMaxStation() {
        Radio radio = new Radio();
        int expected = this.maxStation - 1;
        radio.setCurrentStation = this.maxStation;
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfBetweenStations() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setMaxStation = this.maxStation;
        radio.setCurrentStation(5);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotNextStationIfMaxStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation = this.maxStation;
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfZero() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentStation(0);
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationBetweenBoders() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setMaxStation = this.maxStation;
        radio.setCurrentStation(5);
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifZero() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeifMoreTen() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeifHundred() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = 51;
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = 49;
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeIfZero() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeIfHundred() {
        Radio radio = new Radio();
        int expected = 99;
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}