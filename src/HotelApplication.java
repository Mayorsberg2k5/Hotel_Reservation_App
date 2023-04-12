import java.util.Scanner;

public class HotelApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection = "";
        do {
            System.out.print(
                    "1. Customer Menu \n" +
                            "2. Admin Menu \n"
            );
            try{
                selection = scanner.nextLine();
                switch(Integer.parseInt(selection)) {
                    case 1:
                        MainMenu.customerMenu();
                        break;
                    case 2:
                        AdminMenu.adminMenu();
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Enter valid option\n");
            }
        }
        while(!selection.equals("1") && !selection.equals("2"));
        scanner.close();
    }
}
