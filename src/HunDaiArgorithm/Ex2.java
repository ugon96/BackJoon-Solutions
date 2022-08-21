package HunDaiArgorithm;

public class Ex2 {
    public static void main(String[] args) {
        Point a = new Point();
        a.x = 1;
        a.y = 2;

        int sum = 0;

        while(sum<10){
            sum++;
            if(sum == 7){
                System.out.println(sum);
                continue;
            }
        }

    }
    static class Point{
        int x;
        int y;
        public Point(){
            x = 0;
            y = 0;
        }
    }
}
