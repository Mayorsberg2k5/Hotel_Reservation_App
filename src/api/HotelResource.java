package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class HotelResource {
    private static HotelResource INSTANCE = new HotelResource();
    private static final CustomerService customerService = CustomerService.getInstance();
    private static final ReservationService reservationService = ReservationService.getInstance();

    private HotelResource() {}

    public static HotelResource getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new HotelResource();
        }
        return INSTANCE;
    }
    public Customer getCustomer (String email) {
        return customerService.getCustomer(email);
    }

    public void createACustomer (String email, String firstName, String lastName) {
        customerService.addCustomer(email, firstName, lastName);
    }

    public IRoom getRoom (String roomNumber) {
        return reservationService.getARoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveARoom(getCustomer(customerEmail), room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomerReservations(String customerEmail) {
        Customer customer = getCustomer(customerEmail);

        if (customer == null) {
            return Collections.emptyList();
        }
        return reservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut) {
        return reservationService.findRooms(checkIn, checkOut);
    }

    public Collection<IRoom> findAlternativeRooms(Date checkIn, Date checkOut) {
        return reservationService.findAlternativeRooms(checkIn, checkOut);
    }

    public Date addDefaultPlusDays(Date date) {
        return reservationService.addDefaultPlusDays(date);
    }


}
