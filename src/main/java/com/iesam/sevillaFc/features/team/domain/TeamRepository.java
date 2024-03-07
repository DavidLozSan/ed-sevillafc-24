package com.iesam.sevillaFc.features.team.domain;

public interface TeamRepository {
    void save(Team team);
    Team obtain();
}
