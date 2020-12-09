package domain;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


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
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
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
        if (this.currentStation < 0) {
            this.currentStation = 9;
        }
    }

    public void pushNextStation() {
        this.currentStation = this.currentStation + 1;
        if (this.currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void increaseVolume() {
        this.currentVolume = this.currentVolume + 1;
        if (this.currentVolume > 10) {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        this.currentVolume = this.currentVolume - 1;
        if (this.currentVolume < 0) {
            this.currentVolume = 0;
        }
    }
}

