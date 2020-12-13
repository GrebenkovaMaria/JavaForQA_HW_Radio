package domain;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio() {
    }

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

      public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
       }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

