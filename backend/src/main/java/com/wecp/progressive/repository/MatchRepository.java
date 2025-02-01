package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface MatchRepository {
=======
import com.wecp.progressive.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    Match findByMatchId(int matchId);

    List<Match> findAllByStatus(String status);

    @Modifying
    @Transactional
    @Query("DELETE FROM matches m WHERE m.firstTeam.teamId = :teamId OR m.secondTeam.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
}
