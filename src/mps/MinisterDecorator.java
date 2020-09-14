package mps;

import java.math.BigInteger;

public class MinisterDecorator extends MPSDecorator {

    private final BigInteger spendingLimit;
    public MinisterDecorator(ParliamentManagementSystem decoratedParliamentManagementSystem,BigInteger spendingLimit) {
        super(decoratedParliamentManagementSystem);
        this.spendingLimit = spendingLimit;
    }

    @Override
    public String getConstituency() {
        return decoratedParliamentManagementSystem.getConstituency()+"DELHI";
    }

    @Override
    public boolean exceedSpendLimit() {
        return this.spendingLimit.compareTo(new BigInteger("1000000")) > 0;
    }



    @Override
    public String getDriver() {
        return decoratedParliamentManagementSystem.getDriver()+DRIVEREnum.AMBASSADOR;
    }
}
