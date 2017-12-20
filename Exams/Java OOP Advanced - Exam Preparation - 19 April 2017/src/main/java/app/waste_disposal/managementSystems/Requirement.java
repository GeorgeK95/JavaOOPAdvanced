package app.waste_disposal.managementSystems;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Requirement {
    String getType();

    void setType(String type);

    void setEnergyBalance(double energyBalance);

    void setCapitalBalance(double capitalBalance);


    double getEnergyBalance();

    double getCapitalBalance();

}
