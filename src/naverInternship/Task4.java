package naverInternship;

public class Task4 {
    public static void main(String[] args) {
        Point2D[] A = new Point2D[6];


    }

    public int solution(Point2D[] A) {
        if (A.length < 3) {
            return 0;
        } else {
            int collinear = 0;

            Point2D p1 = new Point2D();
            Point2D p2 = new Point2D();
            Point2D p3 = new Point2D();

            // choose p1
            for (int i = 0; i < A.length; i++) {
                p1 = A[i];

                // choose p2
                for (int j = i + 1; j < A.length; j++) {
                    p2 = A[j];
                    // choose p3
                    for (int k = j + 1; k < A.length; k++) {
                        p3 = A[k];
                        double ang1 = (double) (p2.x - p1.x) / (p2.y - p1.y);
                        double ang2 = (double) (p3.x - p2.x) / (p3.y - p2.y);
                        if (ang1 == ang2) {
                            collinear++;
                        }
                    }
                }
            }

            return collinear;
        }
    }

    class Point2D {
        public int x;
        public int y;
    }
}
