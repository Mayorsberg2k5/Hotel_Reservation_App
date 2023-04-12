package model;
import java.util.Objects;
import java.util.regex.Pattern;
public class Customer {
    public final String firstName;
    public final String lastName;
    public final String email;


    public Customer (String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        if (correctEmail(email)){
            this.email = email;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public String getEmail() {
        return email;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private static boolean correctEmail(String email){
        String emailRegistration = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegistration);
        return pattern.matcher(email).matches();
    }
    @Override
    public String toString() {
        return "Customer{ "+
                "firstName ='" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }

}
