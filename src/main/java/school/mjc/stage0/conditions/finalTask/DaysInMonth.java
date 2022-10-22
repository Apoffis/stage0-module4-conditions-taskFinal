package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        boolean leap = false;

        if(year%400==0)
            leap = true;
        else  if(year%100!=0)
        {
            leap = year % 4 == 0;
        }
        else
            leap = false;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> {
                System.out.println(leap ? 29 : 28);
            }
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }

    }
}
