public class Task1_2 {
    public static void main(String[] args) {
        int age = 30;
        boolean goToKindergarten = age >=2 && age <=6;
        boolean goToSchool = age >=7 && age <=18;
        boolean goToUniversity = age > 18 && age < 24;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
}
