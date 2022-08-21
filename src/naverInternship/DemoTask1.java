package naverInternship;

public class DemoTask1 {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        int i = 1;
        while(true){
            Boolean b = false;
            for(int j = 0; j < A.length ; j ++){
                if(A[j] == i){
                    b = true;
                }
            }
            if(!b){
                return i;
            }
            i++;
        }
    }
}
