package lineInternship;

public class Prob3 {
    public static void main(String[] args) {
        int fuel = 19;
        int[] powers = {40,30,20,10};
        int[] distances = {1000, 2000, 3000, 4000};
        System.out.println(solution(fuel, powers, distances));
    }
    public static int solution(int fuel, int[] powers, int[] distances) {
        double[] disPerPoewr = new double[powers.length];
        double max = 0;
        double sum = 0;
        int index = 0;

        for (int i = 0; i < powers.length; i++) {
            disPerPoewr[i] = (double) distances[i] / powers[i];
            if (disPerPoewr[i] > max) {
                max = disPerPoewr[i];
                index = i;
                sum += disPerPoewr[i];
            }
        }

        int bestFuel = (int)(disPerPoewr[index]/sum * fuel);
        int takesTime = (int)Math.ceil((distances[index] - 100/powers[index]*50) / 100);

        int answer = 0;
        return takesTime;
    }
}
