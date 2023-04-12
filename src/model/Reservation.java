package model;
import java.util.Date;

public class Reservation {

    public final Customer customer;
    public final IRoom room;
    public final Date checkInDate;
    public  final Date checkoutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkoutDate = checkOutDate;

    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public IRoom getRoom() {
        return this.room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", checkInDate=" + checkInDate +
                ", checkoutDate=" + checkoutDate +
                '}';
    }
}
