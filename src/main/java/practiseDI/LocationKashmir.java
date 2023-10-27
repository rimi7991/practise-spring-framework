package practiseDI;

import org.springframework.stereotype.Component;

@Component("locationKashmir")
public class LocationKashmir implements LocationDetails{
    @Override
    public void getPlaces(String place1,String place2)
    {
        System.out.println("First Location of Kashmir: "+place1);
        System.out.println("Second Location of Kashmir: "+place2);
    }
}
