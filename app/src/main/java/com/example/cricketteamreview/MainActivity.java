package com.example.cricketteamreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Team> teams;
    final String JSON_DATA = "{\"teams\":[{\"country\":\"Pakistan\",\"captian\":\"Sarfaraz\",\"code\":\"Pak\",\"players\":[\"Player 1\",\"Player 2\",\"Player 3\",\"Player 4\",\"Player 5\",\"Player 6\",\"Player 7\",\"Player 8\",\"Player 9\"]},{\"country\":\"India\",\"captian\":\"Kholi\",\"code\":\"Ind\",\"players\":[\"Player One\",\"Player Two\",\"Player Three\",\"Player 4\",\"Player 5\",\"Player 6\",\"Player 7\",\"Player 8\",\"Player 9\"]}]}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teams = JsonConvert.JsonCriketConvert(JSON_DATA);
        gridView = findViewById(R.id.grid_view);
        ArrayAdapter<Team> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,teams);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                Team team = (Team) adapterView.getItemAtPosition(i);
                intent.putExtra("cricketTeam",team);
                startActivity(intent);
            }
        });
        //Toast.makeText(this,teams.get(0).getCountry(),Toast.LENGTH_LONG).show();
    }
}
