import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Practice5_2 {

    public static void main(String[] args) {

        int[][] employee = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[][] totHour = new int[employee.length][2];

        for (int i = 0; i < employee.length; i++) {
            totHour[i][0] = i;
            for (int j = 0; j < employee[i].length; j++) {
                totHour[i][1] += employee[i][j];
            }
        }

        //근로시간 내림차순 정렬
        Arrays.sort(totHour, new Comparator<int[]>() {
            @Override
            public int compare(final int[] H1,final int[] H2) {

                final int hour1 = H1[1];
                final int hour2 = H2[1];

                return Integer.compare(hour2,hour1);
            }
        });

        //출력
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + totHour[i][0] + " : " + totHour[i][1]);
        }

    }
}
