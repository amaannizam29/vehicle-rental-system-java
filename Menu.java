import java.util.Scanner;


public class Menu {

    Scanner scanner;
    RentalShop shop;

    public Menu() {
        scanner = new Scanner(System.in);
        shop = new RentalShop();
    }

    public void run() {
        loadSampleData();  

        int choice = -1;
        while (choice != 0) {
            printMenu();
            choice = scanner.nextInt();

            if (choice == 1) {
                shop.showAvailableVehicles();
            } else if (choice == 2) {
                shop.showAllVehicles();
            } else if (choice == 3) {
                registerCustomer();
            } else if (choice == 4) {
                shop.showCustomers();
            } else if (choice == 5) {
                rent();
            } else if (choice == 6) {
                returnVehicle();
            } else if (choice == 7) {
                shop.showAgreements();
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }

    public void printMenu() {
        System.out.println();
        System.out.println("===== VEHICLE RENTAL SYSTEM =====");
        System.out.println("1. Show available vehicles");
        System.out.println("2. Show all vehicles");
        System.out.println("3. Register customer");
        System.out.println("4. Show customers");
        System.out.println("5. Rent a vehicle");
        System.out.println("6. Return a vehicle");
        System.out.println("7. Show rental agreements");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public void registerCustomer() {
        System.out.print("Enter customer id (number): ");
        int id = scanner.nextInt();
        System.out.print("Enter name (one word): ");
        String name = scanner.next();
        System.out.print("Enter license number: ");
        String license = scanner.next();

        Customer c = new Customer(id, name, license);
        shop.addCustomer(c);
        System.out.println("Customer registered.");
    }

    public void rent() {
        shop.showAvailableVehicles();
        System.out.print("Enter vehicle id to rent: ");
        int vId = scanner.nextInt();
        System.out.print("Enter your customer id: ");
        int cId = scanner.nextInt();
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        shop.rentVehicle(vId, cId, days);
    }

    public void returnVehicle() {
        System.out.print("Enter vehicle id to return: ");
        int vId = scanner.nextInt();
        shop.returnVehicle(vId);
    }

    public void loadSampleData() {
        shop.addVehicle(new Car(1, "VW-Golf", 45.0, 5));
        shop.addVehicle(new Car(2, "BMW-3Series", 70.0, 4));
        shop.addVehicle(new Truck(3, "Mercedes-Sprinter", 120.0, 3.5));
        shop.addVehicle(new Motorcycle(4, "Yamaha-MT07", 35.0, false));
        shop.addVehicle(new Motorcycle(5, "Harley-Davidson", 90.0, true));

        shop.addCustomer(new Customer(100, "Sahil", "DL-12345"));
    }
}
