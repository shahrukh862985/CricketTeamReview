package com.example.cricketteamreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Team team = (Team) getIntent().getSerializableExtra("cricketTeam");
       // Toast.makeText(this,team.getCountry(),Toast.LENGTH_LONG).show();
        listView = findViewById(R.id.player_list);
        textView = findViewById(R.id.country_name);
        textView.setText(team.getCountry());
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,team.getPlayers());
        listView.setAdapter(adapter);
    }
}
