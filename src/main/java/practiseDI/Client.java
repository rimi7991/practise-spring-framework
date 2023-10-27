package practiseDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String str1 = "Shimla";
        String str2 = "Manali";

        String str3 = "Srinagar";
        String str4 = "Gulmarg";

        String str5 = "Udaipur";
        String str6 = "Jodhpur";

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CheckPlaces checkPlaces = applicationContext.getBean(CheckPlaces.class);
        checkPlaces.checkTheSpot(str3,str4);

        //LocationKashmir locationKashmir = applicationContext.getBean(LocationKashmir.class);
        //locationKashmir.getPlaces(str5,str6);
    }
}
