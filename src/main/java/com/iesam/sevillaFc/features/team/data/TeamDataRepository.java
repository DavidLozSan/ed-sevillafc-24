package com.iesam.sevillaFc.features.team.data;

import com.iesam.sevillaFc.features.team.data.local.FileLocalDataSource;
import com.iesam.sevillaFc.features.team.domain.Team;
import com.iesam.sevillaFc.features.team.domain.TeamRepository;

public class TeamDataRepository implements TeamRepository {
    public static TeamDataRepository instance = null;
    private FileLocalDataSource localTeams = new FileLocalDataSource();
    public static TeamDataRepository newInstance() {
        if (instance==null) {
            instance = new TeamDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Team team) {
        localTeams.save(team);
    }

    @Override
    public Team obtain() {
        return localTeams.obtain();
    }
}
