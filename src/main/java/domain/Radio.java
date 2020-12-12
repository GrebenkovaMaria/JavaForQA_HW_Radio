package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@AllArgsConstructor

@Data


public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;



    public void pushPrevStation() {
        this.currentStation = this.currentStation - 1;
        if (this.currentStation <= minStation) {
            this.currentStation = maxStation;
        }
    }

    public void pushNextStation() {
        this.currentStation = this.currentStation + 1;
        if (this.currentStation >= maxStation) {
            this.currentStation = minStation;
        }
    }

    public void increaseVolume() {
        this.currentVolume = this.currentVolume + 1;
        if (this.currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }

    }

    public void decreaseVolume() {
        this.currentVolume = this.currentVolume - 1;
        if (this.currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }

    }
}

