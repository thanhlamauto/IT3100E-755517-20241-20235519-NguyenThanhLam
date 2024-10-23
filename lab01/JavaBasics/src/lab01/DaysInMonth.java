package lab01;

import java.util.Scanner;

public class DaysInMonth {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month;
        int year;
        
        // Get valid inputs from the user
        while (true) {
            System.out.print("Enter the month: ");
            month = sc.next();
            System.out.print("Enter the year: ");
            year = sc.nextInt();
            
            if (year >= 0 && isValidMonth(month)) {
                break;  // Exit loop if inputs are valid
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }
        
        // Find and display the number of days in the entered month and year
        int days = getDaysInMonth(month, year);
        System.out.println("The number of days in " + month + " " + year + " is: " + days);
        
        sc.close();
    }
    
    public static boolean isValidMonth(String month) {
        String[] validMonths = {"January", "Jan", "1", "February", "Feb", "2", 
                                "March", "Mar", "3", "April", "Apr", "4", 
                                "May", "5", "June", "Jun", "6", 
                                "July", "Jul", "7", "August", "Aug", "8", 
                                "September", "Sep", "9", "October", "Oct", "10", 
                                "November", "Nov", "11", "December", "Dec", "12"};
        
        for (String validMonth : validMonths) {
            if (validMonth.equalsIgnoreCase(month)) {
                return true; // Valid month found
            }
        }
        return false; // No valid month found
    }
    
    public static int getDaysInMonth(String month, int year) {
        if (month.equalsIgnoreCase("January") || month.equals("1")) {
            return 31;
        } else if (month.equalsIgnoreCase("February") || month.equals("2")) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month.equalsIgnoreCase("March") || month.equals("3")) {
            return 31;
        } else if (month.equalsIgnoreCase("April") || month.equals("4")) {
            return 30;
        } else if (month.equalsIgnoreCase("May") || month.equals("5")) {
            return 31;
        } else if (month.equalsIgnoreCase("June") || month.equals("6")) {
            return 30;
        } else if (month.equalsIgnoreCase("July") || month.equals("7")) {
            return 31;
        } else if (month.equalsIgnoreCase("August") || month.equals("8")) {
            return 31;
        } else if (month.equalsIgnoreCase("September") || month.equals("9")) {
            return 30;
        } else if (month.equalsIgnoreCase("October") || month.equals("10")) {
            return 31;
        } else if (month.equalsIgnoreCase("November") || month.equals("11")) {
            return 30;
        } else if (month.equalsIgnoreCase("December") || month.equals("12")) {
            return 31;
        } else {
            return 0; // Should never reach here
        }
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
