package com.iesam.sevillaFc.features.match.domain;

import com.iesam.sevillaFc.features.team.domain.Team;
import com.iesam.sevillaFc.features.staff.domain.Referee;
public class Match {
    public final String id;
    public final Team localTeam;
    public final Team visitingTeam;
    public final Referee referee;
    public final String resultado;
    public final String matchDate;

    public Match(String id, Team localTeam, Team visitingTeam, Referee referee, String resultado, String matchDate) {
        this.id = id;
        this.localTeam = localTeam;
        this.visitingTeam = visitingTeam;
        this.referee = referee;
        this.resultado = resultado;
        this.matchDate = matchDate;
    }

}
