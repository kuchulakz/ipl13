package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
import java.util.List;

public interface TeamService {

<<<<<<< HEAD
    List<Team> getAllTeams();

    int addTeam(Team team);

    List<Team> getAllTeamsSortedByName();
=======
    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
<<<<<<< HEAD
    default Team getTeamById(int teamId) {
        return null;
    }

    default void updateTeam(Team team) {}

    default void deleteTeam(int teamId) {}
=======
    default Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    default void updateTeam(Team team) throws SQLException {}

    default void deleteTeam(int teamId) throws SQLException {}
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2

}
