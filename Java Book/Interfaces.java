import java.lang.*;
public class Interfaces {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


    }
    
}


interface Car{
    //final int tiers;

    void setNumberofTiers(int tiers);  
    void setFuelType(String fuel);  
}

class Vroom implements Car{

    private int tiers;
    public void setNumberofTiers(int tiers){
        this.tiers = tiers;
    }

    public void setFuelType(String fuel){

    }

    
}



