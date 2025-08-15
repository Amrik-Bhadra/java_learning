package basics.inner_classes;

public class Hotel {
    private String name;
    private int totalRooms, reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numberOfRooms){
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name cannot be empty");
                    return false;
                }

                if(numberOfRooms < 0){
                    System.out.println("Number of rooms should be positive");
                    return false;
                }

                if(reservedRooms + numberOfRooms > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }

                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += numberOfRooms;
            System.out.println("Reservation confirmed for " + guestName);
        }else{
            System.out.println("Reservation Failed!");
        }
    }
}
