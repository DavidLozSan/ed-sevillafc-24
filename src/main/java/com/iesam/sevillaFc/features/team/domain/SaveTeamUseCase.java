package com.iesam.sevillaFc.features.team.domain;

public class SaveTeamUseCase {
    public final TeamRepository teamRepository;

    public SaveTeamUseCase(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void execute(Team team) {
        this.teamRepository.save(team);
    }
}
