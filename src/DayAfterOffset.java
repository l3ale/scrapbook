import java.util.Scanner;

public class DayAfterOffset {

    public static void main(String[] args) {

        while (true) {

            Scanner input = new Scanner(System.in);
            StringBuilder sb = new StringBuilder("The day after your offset is ");

            System.out.println("Enter the day");
            String day = input.nextLine();

            System.out.println("Enter offset");
            int offset = input.nextInt();

            String output = sb.append(getDay(day, offset)).toString();

            System.out.println(output);

        }

    }

    public static String getDay(String day, int offset) {

        int newIndex = 0;
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for (int index = 0; index < days.length; index++) {
            if (days[index].equalsIgnoreCase(day)) { //easier than handling different cases
                newIndex = (index + offset) % days.length; //mod 7 would also work
            }
        }

        return days[newIndex];
    }

}