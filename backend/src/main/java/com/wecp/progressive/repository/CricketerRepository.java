package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface CricketerRepository {
=======
import com.wecp.progressive.entity.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CricketerRepository extends JpaRepository<Cricketer, Integer> {

    Cricketer findByCricketerId(int cricketerId);

    List<Cricketer> findByTeam_TeamId(int teamId);

    long countByTeam_TeamId(int teamId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Cricketer c WHERE c.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId") int teamId);
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
}
