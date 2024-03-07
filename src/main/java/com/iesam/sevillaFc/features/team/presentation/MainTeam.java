package com.iesam.sevillaFc.features.team.presentation;

import com.iesam.sevillaFc.features.team.domain.GetTeamUseCase;
import com.iesam.sevillaFc.features.team.domain.Team;
import com.iesam.sevillaFc.features.team.data.TeamDataRepository;
import com.iesam.sevillaFc.features.team.domain.SaveTeamUseCase;

public class MainTeam {
    public static void save(Team team) {
        SaveTeamUseCase saveTeamUseCase = new SaveTeamUseCase(TeamDataRepository.newInstance());
        saveTeamUseCase.execute(team);
    }

    public static void print() {
        GetTeamUseCase getTeamUseCase = new GetTeamUseCase(TeamDataRepository.newInstance());
        System.out.println(getTeamUseCase.execute());
    }
}
