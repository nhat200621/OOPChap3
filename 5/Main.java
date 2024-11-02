public class Main {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());
        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth());
        System.out.println(d2.previousYear());
        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());
        System.out.println("Looping from 28 Dec 2011 to 2 Mar 2012:");
        MyDate d4 = new MyDate(2011, 12, 28);
        for (int i = 0; i < 65; i++) {
            System.out.println(d4);
            d4.nextDay();
        }
    }
}
