public class Task2_2 {
    public static void main(String[] args) {
        int age = 3;
        boolean attractionIsForbidden = age < 5;
        boolean attractionOnlyWithAdult = age >=5 && age < 14;
        if (attractionIsForbidden) {
            System.out.println("Если возраст ребенка " + age + " года, то ему нельзя кататься на аттракционе");
        } else if (attractionOnlyWithAdult) {
            System.out.println("Если возраст ребенка " + age + " лет, то ему можно кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка " + age + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}
