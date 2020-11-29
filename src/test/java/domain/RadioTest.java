package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldPrevStationIfZero() {
     Radio radio = new Radio();
     radio.setCurrentStation(0);
     int expected = 9;
     int actual = radio.pushPrevStation();
     assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 8;
        int actual = radio.pushPrevStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfBetweenStations() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 4;
        int actual = radio.pushPrevStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldPrevStationIfMoreNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 9;
        int actual = radio.pushPrevStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.pushNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 1;
        int actual = radio.pushNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationBetweenBoders() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 6;
        int actual = radio.pushNextStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldEncreaseVolumeifZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldEncreaseVolumeifTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldEncreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 6;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 4;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeIfZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldDecreaseVolumeIfTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

}