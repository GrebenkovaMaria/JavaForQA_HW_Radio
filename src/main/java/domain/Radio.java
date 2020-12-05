package domain;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;

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

