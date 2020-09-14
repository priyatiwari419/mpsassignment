package mps;

public class Commissioner {

   private final boolean hasPermission;

    public Commissioner(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }

    public String arrest(ParliamentManagementSystem parliamentManagementSystem){

     if(parliamentManagementSystem instanceof MinisterDecorator && hasPermission)
     {
        return "Minister has been arrested by Commissioner";
     }
     else if(parliamentManagementSystem instanceof MinisterDecorator)
     {
         return "Can not arrest without PM permission";
     }
     else if(parliamentManagementSystem instanceof PMDecorator)
     {
        return "PM can not be arrested";
     }
     else {
         return "MP has been arrested by Commissioner";
     }

}


}
