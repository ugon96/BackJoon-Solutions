package naverInternship;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(solution(9736));
    }
    public static int solution(int N) {
        int largest = 0;
        int shift = 0;
        int temp = N;
        for (int i = 1; i < 30; ++i) {
            int index = (temp & 1);
            temp = ((temp >> 1) | (index << 29));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }
}

