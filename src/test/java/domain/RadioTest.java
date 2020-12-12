package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldPrevStationIfLessZero() {
        Radio radio = new Radio("noname", -1, 0, 10, 0, 100, 0);
        int expected = radio.getMaxStation();
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldPrevStationIfZero() {
        Radio radio = new Radio("noname", 0, 0, 10, 0, 100, 0);
        int expected = radio.getMaxStation();
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfMaxStation() {
        Radio radio = new Radio("noname", 10, 0, 10, 0, 100, 0);
        int expected = radio.getMaxStation() - 1;
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfBetweenStations() {
        Radio radio = new Radio("noname", 5, 0, 10, 0, 100, 0);
        int expected = radio.getCurrentStation()-1;
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotNextStationIfMaxStation() {
        Radio radio = new Radio("noname", 10, 0, 10, 0, 100, 0);
        int expected = radio.getMinStation();
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfZero() {
        Radio radio = new Radio("noname", 0, 0, 10, 0, 100, 0);
        int expected = radio.getMinStation()+1;
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationBetweenBoders() {
        Radio radio = new Radio("noname", 5, 0, 10, 0, 100, 0);
        int expected = radio.getCurrentStation()+1;
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifZero() {
        Radio radio = new Radio("noname", 0, 0, 10, 0, 100, 0);
        int expected = radio.getMinVolume()+1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    void shouldNotIncreaseVolumeifHundred() {
        Radio radio = new Radio("noname", 0, 100, 10, 0, 100, 0);
        int expected = radio.getMaxVolume();
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseVolumeBetweenBoders() {
        Radio radio = new Radio("noname", 0, 50, 10, 0, 100, 0);
        int expected = radio.getCurrentVolume()+1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeBetweenBoders() {
        Radio radio = new Radio("noname", 0, 50, 10, 0, 100, 0);
        int expected = radio.getCurrentVolume()-1;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeIfZero() {
        Radio radio = new Radio("noname", 0, 0, 10, 0, 100, 0);
        int expected = radio.getMinVolume();
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeIfHundred() {
        Radio radio = new Radio("noname", 0, 100, 10, 0, 100, 0);
        int expected = radio.getMaxVolume()-1;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldNotDecreaseVolumeIflessMin() {
        Radio radio = new Radio("noname", 0, -1, 10, 0, 100, 0);
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
