public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.printf("Value was 2");
//        }else if (value == 3){
//            System.out.printf("Was not 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        char value = 'C';
        System.out.println(value + " is " + switchChallange(value));

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badRespond = month + " is bad";
                yield badRespond;
            }
        };
    }

    public static String switchChallange(char value){

        switch (value){
            case 'A':
                return "Able";
            case 'B':
                return "Bingo";
            case'C':
                return "Cat";
            case'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not found";
        }

    }

    public static void printDayOfWeek(int day){
        String dayOFWeek = switch (day){
            case 0 -> {
                yield
             "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOFWeek);
    }

    public static void printWeekDay(int day){
        String dayOfWeek = "Invalid Day";
        if (day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        }else if (day == 3){
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
