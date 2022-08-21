package function;

public class Num4673 {
    // 셀프 넘버
    public static void main(String[] args) {
        boolean[] arr = new boolean[10000];

        for(int i = 1; i<=10000;i++) {
            if(conCheck(i)<=10000)
                arr[conCheck(i)-1] = true;
        }

        int i = 0;
        while(i<10000) {
            if(arr[i] ==false)
                System.out.println(i+1);
            i++;
        }

    }

    public static int conCheck(int i){
        int sum = 0;
        sum = i;
        int a=0,b=0,c=0,d=0,e=0;
        a = i/10000;
        i = i - a*10000;

        b= i/1000;
        i = i - b*1000;

        c = i/100;
        i = i - c*100;

        d=i/10;
        i = i - d*10;

        e = i;
        sum = sum+a+b+c+d+e;

        return sum;
    }
}
