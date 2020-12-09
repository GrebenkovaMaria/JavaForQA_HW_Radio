package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldPrevStationIfMoreMaxStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(radio.getMaxStation() + 5);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfLessZero() {
        Radio radio = new Radio();
        int expected = radio.getMaxStation();
        radio.setCurrentStation(radio.getMinStation()-1);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfZero() {
        Radio radio = new Radio();
        int expected = radio.getMaxStation();
        radio.setCurrentStation(radio.getMinStation());
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfMaxStation() {
        Radio radio = new Radio();
        int expected = radio.getMaxStation() - 1;
        radio.setCurrentStation (radio.getMaxStation());
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationIfBetweenStations() {
        Radio radio = new Radio();
        int expected = radio.getCurrentStation()-1;
        radio.setCurrentStation((radio.getMinStation()+radio.getMaxStation())/2);
        radio.pushPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotNextStationIfMaxStation() {
        Radio radio = new Radio();
        int expected = radio.getMinStation();
        radio.setCurrentStation(radio.getMaxStation());
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationIfZero() {
        Radio radio = new Radio();
        int expected = radio.getMinStation()+1;
        radio.setCurrentStation(radio.getMinStation());
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationBetweenBoders() {
        Radio radio = new Radio();
        int expected = radio.getCurrentStation()+1;
        radio.setCurrentStation((radio.getMinStation()+radio.getMaxStation())/2);
        radio.pushNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeifZero() {
        Radio radio = new Radio();
        int expected = radio.getMinVolume()+1;
        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeifMoreHundred() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(radio.getMaxVolume()+2);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeifHundred() {
        Radio radio = new Radio();
        int expected = radio.getMaxVolume();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = radio.getCurrentVolume()+1;
        radio.setCurrentVolume((radio.getMinVolume()+ radio.getMaxVolume())/2);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeBetweenBoders() {
        Radio radio = new Radio();
        int expected = radio.getCurrentVolume()-1;
        radio.setCurrentVolume((radio.getMinVolume()+ radio.getMaxVolume())/2);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeIfZero() {
        Radio radio = new Radio();
        int expected = radio.getMinVolume();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeIfHundred() {
        int expected = radio.getMaxVolume()-1;
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}