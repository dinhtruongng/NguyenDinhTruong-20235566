import java.util.Scanner;
import java.time.YearMonth;

public class App {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int year = -1;
        int month = -1;

        String[] full = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        // String[] let = {
        //     "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        //     "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        // };
        // String[] abb = {
        //     "Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.",
        //     "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."
        // };
        
        // check the year input
        System.out.println("Enter the year: ");
        String year1 = keyboard.nextLine().trim();
        try {
            year = Integer.parseInt(year1);
            if (year<0){
                System.out.println("Invalid year number. Please try again.");
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid year number. Please try again.");
        }

        // check the month input
        System.out.println("Enter the month: ");
        String month1 = keyboard.nextLine().trim();
        try {
            month = Integer.parseInt(month1);
            if((month<1) || (month>12)) {
                System.out.println("Invalid month number. Please enter a value between 1 and 12.");
            }
        } catch (NumberFormatException e) {
            for (int i = 0; i < full.length; i++) {
                String m = full[i];
                // Check for full name match, 3-letter abbreviation, or abbreviation with a period
                if (m.equals(month1) ||
                    m.startsWith(month1) ||
                    m.startsWith(month1.replace(".", ""))) {

                    month = i+1;
                    break;
                }
            }
        }

        keyboard.close();

        // control flow to return number of days
        
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println(daysInMonth);
        
}
}
