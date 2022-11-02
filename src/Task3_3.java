public class Task3_3 {
    public static void main(String[] args) {
        int one = 4;
        int two = 30;
        int three = 7;
        if (one > two && one < three) {
            System.out.println("Наибольшее из трех число " + three);
        } else if (one > two && one > three) {
            System.out.println("Наибольшее из трех число " + one);
        } else {
            System.out.println("Наибольшее из трех число " + two);
        }
    }
}
