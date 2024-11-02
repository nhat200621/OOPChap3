public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time);
        time.nextSecond();
        System.out.println("After nextSecond(): " + time);
        time.previousSecond();
        System.out.println("After previousSecond(): " + time);
        time.nextMinute();
        System.out.println("After nextMinute(): " + time);
        time.nextHour();
        System.out.println("After nextHour(): " + time);
        time.setTime(12, 30, 45);
        System.out.println("After setTime(12, 30, 45): " + time);
        time.nextMinute().nextHour();
        System.out.println("After nextMinute() and nextHour(): " + time);
        try {
            time.setHour(25);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        try {
            time.setMinute(61);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        try {
            time.setSecond(61);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
