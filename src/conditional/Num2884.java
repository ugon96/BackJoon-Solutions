package conditional;

import java.util.Scanner;

public class Num2884 {
    // 알람 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int setHour;
        int setMin;

        // 분이 45분보다 작으면 시간에서 한시간 뺴주기
        if(m<45){
            setMin = m+ 60 - 45;
            setHour = h-1;
            // 한 시간 뺐을때 음수가 된다면 24를 더해주기(하루는 24시간이니까)
            if(setHour < 0 ){
                setHour += 24;
            }
        } else {
            setMin = m -45;
            setHour = h;
        }

        System.out.println(setHour+ " " + setMin);
    }
}
