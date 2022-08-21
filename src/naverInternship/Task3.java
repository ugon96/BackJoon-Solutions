package naverInternship;

public class Task3 {
    public static void main(String[] args) {
        /*int[] A = {1};
        int[] B = {3};
        System.out.println(solution(3, A, B));*/

        int[] A = {2,2,1,2};
        int[] B = {1,3,4,4};
        System.out.println(solution(5, A, B));
    }
    public static int solution(int N, int[] A, int[] B) {
        int sum = 0;

        Point[] arrPoints = new Point[N];
        for(int i = 0; i < arrPoints.length; i++){
            arrPoints[i] = new Point();
        }
        for(int i = 0; i < A.length; i++){
            arrPoints[A[i]-1].edge++;
        }
        for(int i = 0; i < B.length; i++){
            arrPoints[B[i]-1].edge++;
        }
        for(int i = N; i > 0; i--){
            int max = 0;
            int index = 0;
            for(int j = 0; j < arrPoints.length; j++){
                if(arrPoints[j].value == 0 && arrPoints[j].edge >= max){
                    max = arrPoints[j].edge;
                    index = j;
                }
            }
            arrPoints[index].value = i;
        }

        for(int i = 0; i < arrPoints.length; i++){
            sum += arrPoints[i].edge * arrPoints[i].value;
        }
        return sum;
    }
    static class Point {
        int edge;
        int value;
        public Point(){
            edge = 0;
            value = 0;
        }
    }
}
