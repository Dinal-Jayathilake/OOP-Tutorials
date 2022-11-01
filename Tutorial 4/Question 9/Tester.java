package Tutorial4.Question9;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws ParseException {
        int option, appType, app_day, app_month, app_year, count;
        app_day = app_month = app_year = count = 0;
        String description = "";
        String[][] appointments = new String[3][5];
        LocalDate currentDate = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        Appointment onetime = new Onetime();
        Appointment daily = new Daily();
        Appointment monthly = new Monthly();

        initialise(appointments);
        while (Objects.equals(appointments[2][4], "")) {
            System.out.print("\n[0] Add Appointment\n[1] Check Appointment Date\n\nSelect An Option: ");
            option = scanner.nextInt();
            if (option == 0) {
                System.out.print("\nWhat Type Of Appointment Would You Like To Make?\n\n[0] Onetime\n[1] Daily\n[2] Monthly\n\nSelect An Option:");
                appType = scanner.nextInt();
                if (appType != 1) {
                    scanner.nextLine();
                    System.out.print("\nEnter A Description: ");
                    description = scanner.nextLine();
                    System.out.print("\nNow, Enter A Date\n\nDay: ");
                    app_day = scanner.nextInt();
                    System.out.print("Month: ");
                    app_month = scanner.nextInt();
                    if (appType == 0) {
                        System.out.print("Year: ");
                        app_year = scanner.nextInt();
                    } else {
                        app_year = Integer.parseInt(currentYear(currentDate));
                    }
                }
                String[] temp = appointments[count];
                temp[0] = appTypeFinder(appType);
                temp[1] = description;
                temp[2] = Integer.toString(app_day);
                temp[3] = Integer.toString(app_month);
                temp[4] = Integer.toString(app_year);
            } else if (option == 1) {
                System.out.print("\nEnter Appointment Details\n\nDay: ");
                int checkDay = scanner.nextInt();
                System.out.print("Month: ");
                int checkMonth = scanner.nextInt();
                System.out.print("Year: ");
                int checkYear = scanner.nextInt();
                label:
                for (int i = 0; i < 3; i++) {
                    switch (appointments[i][0]) {
                        case "Onetime":
                            onetime.app_day = Integer.parseInt(appointments[i][2]);
                            onetime.app_month = Integer.parseInt(appointments[i][3]);
                            onetime.app_year = Integer.parseInt(appointments[i][4]);
                            if (onetime.occursOn(checkYear, checkMonth, checkDay)) {
                                System.out.println("\nMatch Found!\n\nAppointment Type: Onetime\nDescription: " + appointments[i][1] + "\nDay Of The Week: "+ onetime.dayOfTheWeek());
                            }
                            break;
                        case "Daily":
                            daily.app_day = Integer.parseInt(currentDay(currentDate));
                            daily.app_month = Integer.parseInt(currentMonth(currentDate));
                            daily.app_year = Integer.parseInt(currentYear(currentDate));
                            if (daily.occursOn(checkDay, checkMonth, checkYear)) {
                                System.out.println("\nMatch Found!\n\nAppointment Type: Daily\nDescription: " + appointments[i][1] + "\nDay Of The Week: "+ onetime.dayOfTheWeek());
                            }
                            break;
                        case "Monthly":
                            monthly.app_day = Integer.parseInt(appointments[i][2]);
                            monthly.app_month = Integer.parseInt(appointments[i][3]);
                            monthly.app_year = Integer.parseInt(appointments[i][4]);
                            if (monthly.occursOn(checkDay, checkMonth, checkYear)) {
                                System.out.println("\nMatch Found!\n\nAppointment Type: Monthly\nDescription: " + appointments[i][1] + "\nDay Of The Week: "+ onetime.dayOfTheWeek());
                            }
                            break;
                        default:
                            break label;
                    }
                }
            } else {
                System.out.println("Invalid Option!");
            }
            count++;
        }
        System.out.println("\nSorry, But There Are No Appointment Slots Available");
    }
    public static void initialise(String[][] appointments) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                appointments[i][j] = "";
            }
        }
    }
    public static String appTypeFinder(int appType) {
        String temp;
        if (appType == 0) {
            temp = "Onetime";
        } else if (appType == 1) {
            temp = "Daily";
        } else {
            temp = "Monthly";
        }
        return temp;
    }
    public static String currentDay(LocalDate currentDate) {
        return currentDate.getDayOfMonth() + "";
    }
    public static String currentMonth(LocalDate currentDate) {
        return currentDate.getMonthValue() + "";
    }
    public static String currentYear(LocalDate currentDate) {
        return currentDate.getYear() + "";
    }
}