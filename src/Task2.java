public class Task2 {
    public static void main(String[] args) {
        int age1 = 11;
        int age2 = 18;
        int age3 = 25;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("В " + age1 + " лет ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("В " + age2 + " лет человек закончил школу и может отправляться учиться в университет");
        }
        if (age3 >= 24) {
            System.out.println("В " + age3 + " лет человек окончил университет и может искать первую работу");
        }
    }
}
