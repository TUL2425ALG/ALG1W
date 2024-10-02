package school.z1introduction;

import java.util.Scanner;

public class ToSeconds {
    public static void main(String[] args) {
        
        
//A)
//input
int hoursA = 3;
int minutesA = 30;
int secondsA = 20;
final int SECONDS_IN_MINUTE = 60;
final int SECONDS_IN_HOUR = 60*SECONDS_IN_MINUTE;

//processing
int finalSecondsA = hoursA * SECONDS_IN_HOUR + minutesA * SECONDS_IN_MINUTE + secondsA;

//output
System.out.println(finalSecondsA);

        
//B)
//input
int hoursB = Integer.parseInt(args[0]);
int minutesB = Integer.parseInt(args[1]);
int secondsB = Integer.parseInt(args[2]);

//processing
int finalSecondsB = hoursB * SECONDS_IN_HOUR + minutesB * SECONDS_IN_MINUTE + secondsB;

//output
System.out.println(finalSecondsB);


//C)
//input
Scanner scanner = new Scanner(System.in);
System.out.println("Zadej pocet hodin, minut a sekund: ");
int hoursC = scanner.nextInt();
int minutesC = scanner.nextInt();
int secondsC = scanner.nextInt();

//processing
int finalSecondsC = hoursC * SECONDS_IN_HOUR + minutesC * SECONDS_IN_MINUTE + secondsC;

//output
System.out.println(finalSecondsC);
    }
    
}
