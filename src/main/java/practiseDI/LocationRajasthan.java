package practiseDI;

import org.springframework.stereotype.Component;

@Component("locationRajasthan")
public class LocationRajasthan implements LocationDetails{
    @Override
    public void getPlaces(String place1, String place2) {
        System.out.println("First Location of Rajasthan : "+place1);
        System.out.println("Second Location of Rajasthan: "+place2);
    }
}
