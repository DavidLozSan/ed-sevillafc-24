package com.iesam.sevillaFc.features.team.domain;

public class GetTeamUseCase {
    public final TeamRepository teamRepository;

    public GetTeamUseCase(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team execute() {
        return teamRepository.obtain();
    }
}
