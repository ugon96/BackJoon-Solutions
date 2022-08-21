package conditional;

import java.util.Scanner;

public class Num2525 {
    // 오븐 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentHour = sc.nextInt();
        int currentMin = sc.nextInt();
        int cookingTime = sc.nextInt();

        int endMin = currentMin + cookingTime;
        int endHour = currentHour;
        if(endMin >= 60){
            endHour += endMin/60;
            endMin = endMin%60;
            if(endHour >= 24){
                endHour %= 24;
            }
        }
        System.out.println(endHour+" "+endMin);
    }
}
