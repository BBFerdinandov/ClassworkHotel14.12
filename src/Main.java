import java.util.ArrayList;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        int chooseAnOption;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guests> hotelGuests = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.println("3. Print the names and prices of a particular city");
            System.out.println("4. Exit");
            System.out.print("Choose an option: "); chooseAnOption = scanner.nextInt();

            switch (chooseAnOption) {
                case 1:
                    System.out.println();
                    hotelGuests.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(hotelGuests);
                    break;
                case 3:
                    System.out.println();
                    printHotelGuestsFromParticularCity(hotelGuests, scanner);
                    break;
                case 4: exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void printData(ArrayList<Guests> Guests) {
        System.out.println("Print all data!");
        for (Guests h : Guests) {
            System.out.println(h.toString());
        }
    }

    public static Guests insertData(Scanner scanner) {

        String nothing = scanner.nextLine();
        String name;
        String EGN;
        int martialStatus;
        int nights;
        double bedPrice;
        String city;

        System.out.println("Insert data!");
        System.out.println();

        System.out.print("Name: "); name = scanner.nextLine();
        System.out.println();

        System.out.print("EGN: "); EGN = scanner.nextLine();
        System.out.println();

        System.out.print("Marriage Status 1 for engaged or 2 for single: "); martialStatus = scanner.nextInt();
        System.out.println();

        System.out.print("Nights: "); nights = scanner.nextInt();
        System.out.println();

        System.out.print("Price for beds: "); bedPrice = scanner.nextInt();
        System.out.println();

        String nothing1 = scanner.nextLine();

        System.out.print("City: "); city = scanner.nextLine();

        return new Guests(name, EGN, martialStatus, nights, bedPrice, city);
    }

    public static void printHotelGuestsFromParticularCity(ArrayList<Guests> Guests, Scanner sc) {

        int totalPrice = 0;
        ArrayList<Guests> newStudents = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();


        for (Guests h : Guests) {
            if(h.city.equals(city)) {
                newStudents.add(h);
                totalPrice += h.bedPrice;
            }
        }



        System.out.println();
        for (Guests h : newStudents) {
            System.out.println("Guest name: " + h.name);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
    }
}

//test