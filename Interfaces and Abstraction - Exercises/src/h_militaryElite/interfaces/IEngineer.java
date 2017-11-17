package h_militaryElite.interfaces;


import h_militaryElite.soldier.repair.Repair;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IEngineer extends ISpecialisedSoldier {
    void addRepair(Repair repair);
}
