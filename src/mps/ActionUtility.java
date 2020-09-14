package mps;

public class ActionUtility {

    private ActionUtility(){

    }
    public static Commissioner getInstanceOfCommissioner(boolean permissionFlag){
        return new Commissioner(permissionFlag);
    }


    public static String arrestAction(Commissioner commissioner,ParliamentManagementSystem parliamentManagementSystem)
    {
        if(parliamentManagementSystem.exceedSpendLimit())
            return commissioner.arrest(parliamentManagementSystem);
        else return "ExceedSpendLimit is less than allotted Limit";
    }

}
