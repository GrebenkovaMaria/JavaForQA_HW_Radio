package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldPrevStationIfMoreNine() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentStation(10);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfLessZero() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentStation(-1);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfZero() {
     Radio radio = new Radio();
     int expected = 9;
     radio.setCurrentStation(0);
     radio.pushPrevStation();
     int actual = radio.getCurrentStation() ;
     assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfNine() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentStation(9);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfBetweenStations() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentStation(5);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfNine() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(9);
        radio.pushNextStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfZero() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentStation(0);
        radio.pushNextStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationBetweenBoders() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setCurrentStation(5);
        radio.pushNextStation();
        int actual = radio.getCurrentStation() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifZero() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifMoreTen() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifTen() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeIfZero() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeIfTen() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume() ;
        assertEquals(expected, actual);
    }



















}