package ru.netology.smartHouse;

public class Radio {
    private int MaxRadioStation = 9;
    private int MinRadioStation = 0;
    private int currentRadioStationNumber;
    private int currentVolume;

    public Radio() {
        this.MaxRadioStation = MaxRadioStation;
        this.MinRadioStation = MinRadioStation;
    }

    public Radio(int MaxStation) {
        MaxRadioStation = MaxStation - 1;
    }

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < MinRadioStation) {
            return;
        }
        if (newCurrentRadioStationNumber > MaxRadioStation) {
            return;
        }
        this.currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentRadioStationNumber == MaxRadioStation) {
            currentRadioStationNumber = MinRadioStation;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prevStation() {
        if (currentRadioStationNumber == MinRadioStation) {
            currentRadioStationNumber = MaxRadioStation;
        } else {
            currentRadioStationNumber--;
        }
    }

    public void turnUpTheVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }


    public void turnDownTheVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
