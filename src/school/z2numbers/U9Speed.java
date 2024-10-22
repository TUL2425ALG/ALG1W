
package school.z2numbers;


public class U9Speed {
    public static void main(String[] args) {  
        //input
        //Testovaci data  - vysledek: prekrocil o 10km/h
        double maxSpeed = 50;
        double lengthInKm = 25;
        double startSec = 0;
        double startMin = 0;
        double startHour = 13;
        //Testovaci data end: 13:20:00  - vysledek: prekrocil o 25km/h
        //Testovaci data end: 13:30:00  - vysledek: neprekrocil, jel presne
        //Testovaci data end: 13:40:00  - vysledek: neprekrocil, jel pomaleji
        double endSec = 0; 
        double endMin = 40;
        double endHour = 13;
        final int SEC_IN_HOUR = 3600;
        final int MIN_IN_HOUR = 60;
        
        //processing
        double timeInHours = (endSec/SEC_IN_HOUR + endMin/MIN_IN_HOUR + endHour)-(startSec/SEC_IN_HOUR + startMin/MIN_IN_HOUR + startHour);
        double speed = lengthInKm/timeInHours;
        
        //output  
        double overSpeed = speed - maxSpeed;
        boolean isOverSpeed = overSpeed > 0;
        
        if(isOverSpeed){
            System.out.format("The reached speed was %.3fkm/h, which was over the speed limit by %.3f km/h ",speed,overSpeed);
        }
        else{
            System.out.format("The reached speed was %.3f km/h, which was not over the speed limit", speed);
        }
    }
}
