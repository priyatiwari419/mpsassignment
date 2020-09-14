package mps;

import java.math.BigInteger;

public class MPDecorator extends MPSDecorator {

private final BigInteger spendingLimit;
    public MPDecorator(ParliamentManagementSystem decoratedParliamentManagementSystem,BigInteger spendingLimit) {
        super(decoratedParliamentManagementSystem);
        this.spendingLimit = spendingLimit;
    }

    @Override
    public String getConstituency() {
        return decoratedParliamentManagementSystem.getConstituency()+"GURUGRAM";
    }

    @Override
    public boolean exceedSpendLimit() {
        return this.spendingLimit.compareTo(new BigInteger("100000")) > 0;
    }

    @Override
    public String getDriver() {
        return decoratedParliamentManagementSystem.getDriver()+DRIVEREnum.FORTUNER;
    }
}
