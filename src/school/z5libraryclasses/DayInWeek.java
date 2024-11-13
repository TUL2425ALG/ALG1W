package school.z5libraryclasses;

/**
 *
 * @author tukan
 */
public class DayInWeek {
            public static void main(String[] args)
        {
            // https://cs.wikipedia.org/wiki/Algoritmus_pro_v%C3%BDpo%C4%8Det_dne_v_t%C3%BDdnu
            denTydne(28,5,2023);
        }
        
        public static void denTydne(int den, int mesic, int rok)
        {
            int denvypis = den;
            int rokvypis = rok;
            int[] dnyvmesici = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            String[] dnyvtydnu = new String[] {"Sobota", "Neděle", "Pondělí", "Úterý", "Středa", "Čtvrtek", "Pátek"};
            if (LeapYear(rok))
            {
                dnyvmesici[3] = 29;
            }
            if(den > dnyvmesici[mesic-1] || den < 1 || mesic < 1 || mesic > 12)
            {
                System.out.println(denvypis + ". " + mesic + ". " + rokvypis + " je nesprávný DATUM.");
            }
            else
            {
                if (mesic < 3)
                {
                    mesic = mesic + 12;
                    rok--;
                }
                /*
                System.out.println(den);
                System.out.println(mesic);
                System.out.println(rok);
                */
            int vypocet = den + 13*(mesic + 1) / 5 + (rok % 100) + (rok % 100) / 4 + (rok / 100) / 4 + 5 * (rok / 100);
            vypocet = vypocet % 7;
                System.out.println(denvypis + ". " + mesic + ". " + rokvypis + " - " + dnyvtydnu[vypocet]);
            }
        }
        public static boolean LeapYear(int year)
        {
         boolean leap = false;
         if (year % 4 == 0)
         {
             if (year % 100 == 0)
             {
                 if (year % 400 == 0) leap = true;
                 else
                      leap = false;
             }
         }
         return leap;
        }
}
