package com.example.cricketteamreview;

import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable {

    private String country;
    private String captain;
    private String code;
    private ArrayList<String> players;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<String> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return this.country;
    }
}
