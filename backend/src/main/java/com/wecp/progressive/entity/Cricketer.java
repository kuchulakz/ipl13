package com.wecp.progressive.entity;

import javax.persistence.*;
import java.util.Comparator;

@Entity
public class Cricketer implements Comparable<Cricketer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cricketerId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "team_id")
    private Team team;

    private String cricketerName;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int totalRuns;
    private int totalWickets;

    public Cricketer() {
    }

    public Cricketer(int cricketerId, int teamId, String cricketerName, int age, String nationality, int experience, String role, int totalRuns, int totalWickets) {
        this.cricketerId = cricketerId;
        this.team.setTeamId(teamId);
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public int getCricketerId() {
        return cricketerId;
    }

    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    @Override
    public int compareTo(Cricketer otherCricketer) {
        return Comparator.comparingInt(Cricketer::getExperience)
                .compare(this, otherCricketer);
    }
}


// Entity Class: Represents a database table.
// Annotations: Used for ORM (Object-Relational Mapping).
// Fields: Represent columns in the table.

// @Id and @GeneratedValue(strategy = GenerationType.IDENTITY) indicate that cricketerId is the primary key and its value is automatically generated.
// @ManyToOne(cascade = CascadeType.MERGE) and @JoinColumn(name = "team_id") indicate a many-to-one relationship with the Team entity, with team_id as the foreign key.
// Other fields represent various attributes of a cricketer.

// Constructors: Initialize objects.
// Comparable Interface: Allows sorting of Cricketer objects.

// This method uses a Comparator to compare the experience of two Cricketer objects. The comparingInt method creates a comparator that compares int values extracted by the getExperience method.
// The :: operator in Java is called the method reference operator. It is used to refer to methods or constructors without invoking them. It provides a way to pass a method as an argument to a function.
