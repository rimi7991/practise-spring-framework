package practiseDI;

import org.springframework.stereotype.Component;

@Component("locationHimachal")
public class LocationHimachal implements LocationDetails{
    @Override
    public void getPlaces(String place1, String place2)
    {
        System.out.println("First Location of Himachal : "+place1);
        System.out.println("Second Location of Himachal : "+place2);
    }
}
