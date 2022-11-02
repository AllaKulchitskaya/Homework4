public class Task3 {
    public static void main(String[] args) {
        int carriageCapacity = 102;
        int seats = 60;
        int standingRoom = carriageCapacity - seats;
        int takenSeats = 36;
        if (takenSeats < seats) {
            System.out.println("В вагоне осталось еще " + (seats - takenSeats) + " сидячих мест");
        }
        int takenStandingRoom = 23;
        if (takenStandingRoom < standingRoom) {
            System.out.println("В вагоне осталось еше " + (standingRoom - takenStandingRoom) + " стоячих мест");
        }
        int takenSeats2 = 60;
        if (takenSeats2 == seats) {
            System.out.println("В вагоне не осталось сидячих мест");
        }

        int takenStandingRoom2 = 42;
        if (takenStandingRoom2 == standingRoom) {
            System.out.println("В вагоне не осталось стоячих мест");
        }
        int takenPlacesTotal = 102;
        if (takenPlacesTotal == carriageCapacity) {
            System.out.println("В вагоне не осталось мест");
        }
    }
}
