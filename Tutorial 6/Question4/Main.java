package Tutorial6.Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<String>> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        while (true){
            menu();
            option(count);
            count++;
            System.out.println("\nBook List: " + books);
        }
    }
    static void menu() {
        System.out.println("\n--------------------------");
        System.out.println("[0] Add Book");
        System.out.println("[1] Remove Book");
        System.out.println("--------------------------\n");
        System.out.print("Select An Option:");
    }
    static void addBook(int count) {
        books.add(new ArrayList<>());
        System.out.print("\nEnter Author's Name: ");
        books.get(count).add(0, scanner.nextLine());
        System.out.print("Enter Book Title: ");
        books.get(count).add(1, scanner.nextLine());
        System.out.print("Enter Publication Year: ");
        books.get(count).add(2, scanner.nextLine());
        System.out.print("Enter Price: ");
        books.get(count).add(3, scanner.nextLine());
    }
    static void removeBook() {
        System.out.print("\nEnter Book Title: ");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).get(1).equals(scanner.nextLine())){
                books.remove(i);
            }
        }
    }
    static void option(int count) {
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 0) {
            addBook(count);
        } else if (choice == 1) {
            removeBook();
        }
    }
}
