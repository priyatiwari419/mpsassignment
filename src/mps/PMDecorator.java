package mps;

import java.math.BigInteger;

public class PMDecorator extends MPSDecorator {

    protected DRIVEREnum driverEnum;
    private final BigInteger spendingLimit;
    private final String msg;
    public PMDecorator(ParliamentManagementSystem decoratedParliamentManagementSystem,DRIVEREnum driverEnum,BigInteger spendingLimit,String msg) {
        super(decoratedParliamentManagementSystem);
        this.driverEnum=driverEnum;
        this.spendingLimit = spendingLimit;
        this.msg = msg;
    }

    @Override
    public String getConstituency() {
        return decoratedParliamentManagementSystem.getConstituency()+"NOIDA";
    }

    @Override
    public boolean exceedSpendLimit() {
        return this.spendingLimit.compareTo(new BigInteger("10000000")) > 0;
    }

    @Override
    public String getDriver() {
        if(msg.equals(" Pm enjoys his special benefits "))
        {
            return  decoratedParliamentManagementSystem.getDriver()+DRIVEREnum.MERCEDES+msg+driverEnum;
        }
        else
        {
            return  decoratedParliamentManagementSystem.getDriver()+DRIVEREnum.MERCEDES;
        }

    }
}
