package stepByStep.silver5.D220729;

/*
    2022.07.29
    #날짜 #Time #Date #LocalDate #Period
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

public class Num1308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tYear = Integer.parseInt(st.nextToken());
        int tMonth = Integer.parseInt(st.nextToken());
        int tDay = Integer.parseInt(st.nextToken());

        LocalDate today = LocalDate.of(tYear, tMonth, tDay);

        st = new StringTokenizer(br.readLine());
        int eYear = Integer.parseInt(st.nextToken());
        int eMonth = Integer.parseInt(st.nextToken());
        int eDay = Integer.parseInt(st.nextToken());

        LocalDate endDay = LocalDate.of(eYear, eMonth, eDay);

        Period period = Period.between(today, endDay);
        if(period.getYears()>=1000){
            System.out.println("gg");
        } else {
            int count = 0;
            while(today.compareTo(endDay) != 0){
                today = today.plusDays(1);
                count++;
            }
            System.out.println("D-" + count);
        }
    }
}
