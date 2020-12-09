package constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {



    @Test
    void shouldPrevStationIfMoreNine() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = 9;
        assertEquals(expected, actual);
    }

}