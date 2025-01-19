package com.wecp.progressive.entity;

import javax.persistence.*;
import java.util.Date;

// Since "match" is a reserved word in mysql, using table name as "matches"
@Entity(name = "matches")
// The :: operator in Java is called the method reference operator. It is used to refer to methods or constructors without invoking them. It provides a way to pass a method as an argument to a function.
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "first_team_id")
    private Team firstTeam;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "second_team_id")
    private Team secondTeam;

    @Temporal(TemporalType.DATE) //@Temporal(TemporalType.DATE) specifies that matchDate should be stored as a date in the database.
    private Date matchDate;

    private String venue;
    private String result;
    private String status;

    @ManyToOne
    @JoinColumn(name = "winner_team_id")
    private Team winnerTeam;

    public Match() {
    }

    public Match(int matchId, int firstTeamId, int secondTeamId, Date matchDate, String venue, String result, String status, int winnerTeamId) {
        this.matchId = matchId;
        this.firstTeam.setTeamId(firstTeamId);
        this.secondTeam.setTeamId(secondTeamId);
        this.matchDate = matchDate;
        this.venue = venue;
        this.result = result;
        this.status = status;
        this.winnerTeam.setTeamId(winnerTeamId);
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Team getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Team winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}