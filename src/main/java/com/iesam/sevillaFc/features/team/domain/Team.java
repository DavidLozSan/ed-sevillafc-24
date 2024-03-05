package com.iesam.sevillaFc.features.team.domain;

import com.iesam.sevillaFc.features.staff.domain.Player;

import java.util.ArrayList;

public class Team {
    public final String id;
    public final String name;
    public final ArrayList<Player> players;

    public Team(String id, String name, ArrayList<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }
}
