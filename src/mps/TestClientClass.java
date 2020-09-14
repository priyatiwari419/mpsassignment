package mps;

import java.math.BigInteger;

import static mps.ActionUtility.getInstanceOfCommissioner;
import static mps.FactoryForParliamentManagementSystem.getObjectBasedUponRequest;

public class TestClientClass {

    public static void main(String[] args) {
        ParliamentManagementSystem mpObject = getObjectBasedUponRequest("MP",new BigInteger("50000"));
        ParliamentManagementSystem ministerObject = getObjectBasedUponRequest("MINISTER",new BigInteger("50000"));
        ParliamentManagementSystem pmObject = getObjectBasedUponRequest("PM",new BigInteger("50000"));
        ParliamentManagementSystem pmWithBenefitsObject = getObjectBasedUponRequest("PM With Benefits",new BigInteger("50000"));
        System.out.println(mpObject.getConstituency()+" For MP ");
        System.out.println(ministerObject.getConstituency()+" For Minister ");
        System.out.println(pmObject.getConstituency()+" For PM ");
        System.out.println(mpObject.getDriver()+" For MP ");
        System.out.println(ministerObject.getDriver()+" For Minister ");
        System.out.println(pmObject.getDriver()+" For PM ");
        System.out.println(pmWithBenefitsObject.getDriver());

        Commissioner commissionerWithArrestPermission = getInstanceOfCommissioner(true);
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,mpObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,ministerObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,pmObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,pmWithBenefitsObject));

        Commissioner commissionerWithOutArrestPermission = getInstanceOfCommissioner(false);
        System.out.println(ActionUtility.arrestAction(commissionerWithOutArrestPermission,mpObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithOutArrestPermission,ministerObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithOutArrestPermission,pmObject));
        System.out.println(ActionUtility.arrestAction(commissionerWithOutArrestPermission,pmWithBenefitsObject));

        ParliamentManagementSystem mpObjectExceedSpendLimit = getObjectBasedUponRequest("MP",new BigInteger("50000000"));
        ParliamentManagementSystem ministerObjectExceedSpendLimit = getObjectBasedUponRequest("MINISTER",new BigInteger("500000000"));
        ParliamentManagementSystem pmObjectExceedSpendLimit = getObjectBasedUponRequest("PM",new BigInteger("50000000"));

        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,mpObjectExceedSpendLimit));
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,ministerObjectExceedSpendLimit));
        System.out.println(ActionUtility.arrestAction(commissionerWithArrestPermission,pmObjectExceedSpendLimit));
        System.out.println(ActionUtility.arrestAction(commissionerWithOutArrestPermission,ministerObjectExceedSpendLimit));


    }


}
