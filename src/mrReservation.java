import java.util.*;

class Reservation {
    int start;
    int end;

    Reservation(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class mrReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 회의실의 수
        int M = sc.nextInt(); // 예약된 회의의 수

        Map<String, List<Reservation>> meetingRooms = new HashMap<>();

        // 각 회의실의 이름 초기화
        for (int i = 0; i < N; i++) {
            String roomName = sc.next();
            meetingRooms.put(roomName, new ArrayList<>());
        }

        // 예약된 회의 정보 입력
        for (int i = 0; i < M; i++) {
            String roomName = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();

            meetingRooms.get(roomName).add(new Reservation(start, end));
        }

        // 출력
        for (Map.Entry<String, List<Reservation>> entry : meetingRooms.entrySet()) {
            String roomName = entry.getKey();
            List<Reservation> reservations = entry.getValue();

            System.out.println("Room " + roomName + ":");

            List<String> timeSlots = findAvailableTimeSlots(reservations);
            if (timeSlots.isEmpty()) {
                System.out.println("Not available");
            } else {
                System.out.println(timeSlots.size() + " available:");
                timeSlots.forEach(System.out::println);
            }

            System.out.println("-----dd");

        }
    }

    private static List<String> findAvailableTimeSlots(List<Reservation> reservations) {
        List<String> availableTimeSlots = new ArrayList<>();
        int currentStart = 9;

        for (Reservation reservation : reservations) {
            if (currentStart < reservation.start) {
                availableTimeSlots.add(String.format("%02d-%02d", currentStart, Math.min(reservation.start, 18)));
            }
            currentStart = Math.max(currentStart, reservation.end);
        }

        if (currentStart < 18) {
            availableTimeSlots.add(String.format("%02d-18", currentStart,18));
        }

        return availableTimeSlots;
    }

}

