package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Team;

<<<<<<< HEAD
import java.util.List;

public interface TeamDAO {
    int addTeam(Team team);
    Team getTeamById(int teamId);
    void updateTeam(Team team);
    void deleteTeam(int teamId) ;
    List<Team> getAllTeams();
=======
import java.sql.SQLException;
import java.util.List;

public interface TeamDAO {
    int addTeam(Team team) throws SQLException, SQLException;
    Team getTeamById(int teamId) throws SQLException;
    void updateTeam(Team team) throws SQLException;
    void deleteTeam(int teamId) throws SQLException;
    List<Team> getAllTeams() throws SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
}
