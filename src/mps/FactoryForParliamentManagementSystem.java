package mps;

import java.math.BigInteger;

public class FactoryForParliamentManagementSystem {

    private FactoryForParliamentManagementSystem(){

    }
    public static ParliamentManagementSystem getObjectBasedUponRequest(String request,BigInteger expenditure)
    {
        ParliamentManagementSystem pmsBasicImplementation = new PMSBasicImplementation();
        if("MP".equals(request))
        {
            return new MPDecorator(pmsBasicImplementation,expenditure);
        }
        else if ("MINISTER".equals(request))
        {
            return new MinisterDecorator(pmsBasicImplementation,expenditure);
        }
        else if("PM".equals(request))
        {
           return new PMDecorator(pmsBasicImplementation,null,expenditure,"");
        }
        else
        {
          return new PMDecorator(pmsBasicImplementation,DRIVEREnum.AIRCRAFT,expenditure," Pm enjoys his special benefits ");
        }
    }
}
