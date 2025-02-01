package com.wecp.progressive.service;

import com.wecp.progressive.entity.Match;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
import java.util.List;

public interface MatchService {

<<<<<<< HEAD
    List<Match> getAllMatches();

    Match getMatchById(int matchId);

    Integer addMatch(Match match);

    void updateMatch(Match match);

    void deleteMatch(int matchId);

    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status) {
=======
    List<Match> getAllMatches() throws SQLException;

    Match getMatchById(int matchId) throws SQLException;

    Integer addMatch(Match match) throws SQLException;

    void updateMatch(Match match) throws SQLException;

    void deleteMatch(int matchId) throws SQLException;

    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status)  throws SQLException {
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
        return null;
    }
}
