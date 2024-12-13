package school.z5libraryclasses;

/**
 *
 * @author tukan
 */
public class DayInWeek {

    public static void main(String[] args) {
        // https://cs.wikipedia.org/wiki/Algoritmus_pro_v%C3%BDpo%C4%8Det_dne_v_t%C3%BDdnu
        denTydne(1, 1, 2024);
    }
    public static void denTydne(int den, int mesic, int rok)
    {
        System.out.print(den + ". " + mesic + ". " + rok + " - ");
        OutputDayInWeek(DayFromDate(den, mesic, rok));
    }

    public static boolean LeapYear(int year)
    {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            }
        }
        return leap;
    }
    public static int DayFromDate(int day, int month, int year)
    {
        int[] dnyvmesici = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (LeapYear(year)) {
            dnyvmesici[3] = 29;
        }
        if (day > dnyvmesici[month - 1] || day < 1 || month < 1 || month > 12) {
            return (-1);
        } else {
            if (month < 3) {
                month = month + 12;
                year--;
            }
            int vypocet = day + 13 * (month + 1) / 5 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100);
            return (vypocet % 7);
        }
    }
    public static void OutputDayInWeek(int day)
    {
        if (day < 0)
        {
            System.out.print("Datum je NEPLATNÝ.");
        }
        else
        {
            String[] dnyvtydnu = new String[]{"Sobota", "Neděle", "Pondělí", "Úterý", "Středa", "Čtvrtek", "Pátek"};
            System.out.print(dnyvtydnu[day]);
        }
        System.out.println("");
    }
}
