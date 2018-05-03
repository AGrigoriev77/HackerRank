package hackerRank.Implementation.DayOfTheProgrammer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {


    public static void main(String[] args) {
        int year = 1918;

        String date = "";
        if (year < 1918) date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        else if (year == 1918) date += "26.09." + year;
        else date = LocalDate.ofYearDay(year, 256).format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));

        System.out.println(date);

    }


}
