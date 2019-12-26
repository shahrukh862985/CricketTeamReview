package com.example.cricketteamreview;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonConvert {

    public static ArrayList<Team> JsonCriketConvert(String json)
    {
        ArrayList<Team> teams =new ArrayList<>();
        try
        {
            JSONObject mainObj = new JSONObject(json);
            JSONArray teamsArray =  mainObj.getJSONArray("teams");
            for (int i =0; i<teamsArray.length();i++)
            {
                JSONObject team =  teamsArray.getJSONObject(i);
                Team CricketTeam = new Team();
                CricketTeam.setCaptain(team.getString("captian"));
                CricketTeam.setCountry(team.getString("country"));
                CricketTeam.setCode(team.getString("code"));
                JSONArray players = team.getJSONArray("players");
                CricketTeam.setPlayers(new ArrayList<String>());
                for(int j =0; j<players.length();j++)
                {
                    CricketTeam.getPlayers().add(players.getString(j));
                }
                teams.add(CricketTeam);
            }
        }
        catch(Exception ex)
        {
            Log.v("error",ex.getMessage());
        }
        return teams;
    }

}
