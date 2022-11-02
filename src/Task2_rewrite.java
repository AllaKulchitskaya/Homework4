public class Task2_rewrite {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться учиться в университет");
        } else {
            System.out.println("Человек окончил университет и может искать первую работу");
        }
    }
}
