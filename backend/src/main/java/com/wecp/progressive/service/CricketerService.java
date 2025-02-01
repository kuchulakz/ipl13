package com.wecp.progressive.service;

import com.wecp.progressive.entity.Cricketer;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
import java.util.List;

public interface CricketerService {

<<<<<<< HEAD
    List<Cricketer> getAllCricketers();

    Integer addCricketer(Cricketer cricketer);

    List<Cricketer> getAllCricketersSortedByExperience();
=======
    List<Cricketer> getAllCricketers() throws SQLException;

    Integer addCricketer(Cricketer cricketer) throws SQLException;

    List<Cricketer> getAllCricketersSortedByExperience() throws SQLException;
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2

    default void emptyArrayList() {
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java class
<<<<<<< HEAD
    default void updateCricketer(Cricketer cricketer) {}

    default void deleteCricketer(int cricketerId) {}

    default Cricketer getCricketerById(int cricketerId) {
=======
    default void updateCricketer(Cricketer cricketer) throws SQLException {}

    default void deleteCricketer(int cricketerId) throws SQLException {}

    default Cricketer getCricketerById(int cricketerId) throws SQLException {
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
        return null;
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java and CricketerServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Cricketer> getCricketersByTeam(int teamId) {
=======
    default List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
        return null;
    }

}
