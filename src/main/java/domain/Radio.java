package domain;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9){
            return;
        }
        if (currentStation < 0){
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

   public int pushPrevStation () {
    int newCurrentStation = currentStation - 1;
    if (currentStation == 0) {
        newCurrentStation = 9;
    }
    return newCurrentStation;
    }

    public int pushNextStation () {
        int newCurrentStation = currentStation + 1;
        if (currentStation == 9) {
            newCurrentStation = 0;
        }
        return newCurrentStation;
    }

    public int increaseVolume () {
        int newVolume = currentVolume + 1;
        if (currentVolume == 10) {
            newVolume = 10;
        }
        return newVolume;
    }

    public int decreaseVolume () {
        int newVolume = currentVolume - 1;
        if (newVolume < 0) {
            newVolume =0;
        }
        return newVolume;
    }
}

