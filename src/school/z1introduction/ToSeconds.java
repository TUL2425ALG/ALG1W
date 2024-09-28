package school.z1introduction;
public class ToSeconds {
    public static void main(String[] args) {
        
        
//A)
//input
int hoursA = 3;
int minutesA = 30;
int secondsA = 20;

//processing
int secondsInMinute = 60;
int secondsInHour = 60*secondsInMinute;
int finalSecondsA = hoursA * secondsInHour + minutesA * secondsInMinute + secondsA;

//output
System.out.println(finalSecondsA);
      
        

    }
    
}
