package h_militaryElite.interfaces;


import h_militaryElite.soldier.mission.Mission;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface ICommando  extends ISpecialisedSoldier{
    void addMission(Mission mission);
}
