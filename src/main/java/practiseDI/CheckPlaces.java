package practiseDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CheckPlaces {

   // @Qualifier("locationHimachal")
    private LocationDetails locationDetails;
    private LocationDetails locationRajasthan;

    private LocationDetails locationHimachal;
    private LocationDetails locationKashmir;

    @Autowired
    public CheckPlaces(@Qualifier("locationRajasthan") LocationDetails locationHimachal, LocationDetails locationKashmir )
    {
        this.locationKashmir = locationKashmir;
        this.locationHimachal = locationHimachal;
        System.out.println("Constructor based dependency injection");
    }

//    public CheckPlaces(LocationDetails locationRajasthan)
//    {
//        this.locationRajasthan = locationRajasthan;
//        System.out.println("Constructor based dependency injection");
//    }


//    @Autowired
//    public void setLocationDetails(@Qualifier("locationHimachal") LocationDetails locationDetails) {
//        System.out.println("Setter based dependency injection");
//        this.locationDetails = locationDetails;
//    }

    public void checkTheSpot(String place1, String place2)
    {
        //this.locationDetails.getPlaces(place1,place2);
        this.locationKashmir.getPlaces(place1,place2);
        this.locationHimachal.getPlaces(place1,place2);
    }
}
