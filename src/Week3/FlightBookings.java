package Week3;

public class FlightBookings {

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer = new int[n];

        for (int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1] - 1;
            int seats = booking[2];

            answer[first] += seats;
            if (last + 1 < n) {
                answer[last + 1] -= seats;
            }
        }

        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] bookings = {
                {1, 2, 10},
                {2, 3, 20},
                {2, 5, 25}
        };
        int n = 5;

        int[] result = corpFlightBookings(bookings, n);

        for (int seats : result) {
            System.out.print(seats + " ");
        }
    }
}
