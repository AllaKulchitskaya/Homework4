public class Task3_rewrite {
    public static void main(String[] args) {
        int carriageCapacity = 102;
        int seats = 60;
        int takenSeats = 85;
        if (takenSeats < seats) {
            System.out.println("В вагоне остались сидячие места");
        } else if (takenSeats >= seats && takenSeats < carriageCapacity) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("В вагоне не осталось мест");
        }
    }
}
