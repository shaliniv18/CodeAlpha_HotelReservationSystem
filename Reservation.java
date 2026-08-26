public class Reservation {

    private int bookingId;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    private String roomCategory;
    private double amount;
    private String paymentStatus;

    public Reservation(
            int bookingId,
            String customerName,
            String phoneNumber,
            int roomNumber,
            String roomCategory,
            double amount,
            String paymentStatus) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.roomCategory = roomCategory;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayBooking() {

        System.out.println("\n--------------------------------------");
        System.out.println("          BOOKING DETAILS");
        System.out.println("--------------------------------------");
        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("Room Number    : " + roomNumber);
        System.out.println("Room Category  : " + roomCategory);
        System.out.println("Amount         : Rs. " + amount);
        System.out.println("Payment Status : " + paymentStatus);
        System.out.println("--------------------------------------");
    }

    public String toFileString() {

        return bookingId + ","
                + customerName + ","
                + phoneNumber + ","
                + roomNumber + ","
                + roomCategory + ","
                + amount + ","
                + paymentStatus;
    }
}