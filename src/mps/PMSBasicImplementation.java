package mps;

public class PMSBasicImplementation implements ParliamentManagementSystem {

    @Override
    public String getConstituency() {
        return "Winning Constituency ";
    }

    @Override
    public boolean exceedSpendLimit() {
        return false;
    }

    @Override
    public String getDriver() {
        return "Default Driver ";
    }
}
