package school.z1introduction;

import java.util.Scanner;

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

        
//B)
//input
int hoursB = Integer.parseInt(args[0]);
int minutesB = Integer.parseInt(args[1]);
int secondsB = Integer.parseInt(args[2]);

//processing
int finalSecondsB = hoursB * secondsInHour + minutesB * secondsInMinute + secondsB;

//output
System.out.println(finalSecondsB);


//C)
//input
Scanner scanner = new Scanner(System.in);
int hoursC = scanner.nextInt();
int minutesC = scanner.nextInt();
int secondsC = scanner.nextInt();

//processing
int finalSecondsC = hoursC * secondsInHour + minutesC * secondsInMinute + secondsC;

//output
System.out.println(finalSecondsC);
    }
    
}
