public class Main {
    public static void main(String[] args) {
//        Seseorang berangkat pukul  08 : 52 : 45
//        ( pukul 08 lewat 52 menit 45 detik ) ,
//        dan tiba ditujuan setelah 5000 detik kemudian.
//        Susun program untuk menghitung dan mencetak pukul berapa
//        ( jam : menit : detik ) dia tiba ditempat tujuan.

        int hour = 8;
        int minute = 52;
        int second = 45;
        int durationInSeconds = 5000;

        System.out.println("========== Question 1 ==========");
        System.out.println("Departure Time:");
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Flight Duration in seconds: " + durationInSeconds);
        System.out.println("========== BREAKDOWN ==========");
        int convertedHourToSeconds = hour * 3600;
        int convertedMinuteToSecond = minute * 60;
        int totalInSecond = convertedMinuteToSecond + convertedHourToSeconds + second + durationInSeconds;
        System.out.println("Convert Hour to Second: 8 * 3600 = " + convertedHourToSeconds);
        System.out.println("Convert Minute to Second: 52 * 60 = " + convertedHourToSeconds);
        System.out.println("Second: " + second);
        System.out.println("Flight Duration in seconds: " + durationInSeconds  + " second");

        int arrivedHour = totalInSecond / 3600; // jam
        int arrivedMinute = (totalInSecond % 3600) / 60;
        int arrivedSecond = (totalInSecond % 3600) % 60;
        System.out.println("Answer 1st Question, Hour + Minute + Second + 5000 second = " + totalInSecond + " seconds");
        System.out.println("Arrived at the destination with Converted Second To Hour, Minute and Second");
        System.out.println("========== ANSWER ==========");
        System.out.println("Arrived Time:");
        System.out.println("Hour: " + arrivedHour);
        System.out.println("Minute: " + arrivedMinute);
        System.out.println("Second: " + arrivedSecond);
        System.out.println("============================");

//  2.      Seseorang berangkat pukul  08 : 52 : 45
//        ( pukul 08 lewat 52 menit 45 detik ) ,
//        dan tiba ditujuan pukul : 12 : 15 : 10.
//        Susun program untuk menghitung dan mencetak berapa jam, berapa menit dan berapa detik waktu yang dia habiskan dalam perjalanan.

        int departureHour = 8;
        int departureMinute = 52;
        int departureSecond = 45;
        int arrivedHours = 12;
        int arrivedMinutes = 15;
        int arrivedSeconds = 10;

        System.out.println("========== Question 2 ==========");
        System.out.println("Departure Time:");
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Arrived Time:");
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("========== BREAKDOWN ==========");

        int departHoursToSeconds = departureHour * 3600;
        int departMinuteToSeconds = departureMinute * 60;
        int totalSecondsDepart = departHoursToSeconds + departMinuteToSeconds + departureSecond;

        System.out.println("Convert Departure Hour to Second: 8 * 3600 = " + convertedHourToSeconds);
        System.out.println("Convert Departure Minute to Second: 52 * 60 = " + convertedHourToSeconds);
        System.out.println("Departure Second: " + second);
        System.out.println("Total Departure in Second: " + totalSecondsDepart + " seconds");

        int arrivedHourstoSeconds = arrivedHours * 3600;
        int arrivedMinutestoSeconds = arrivedMinutes * 60;
        int totalSecondsArrived = arrivedHourstoSeconds + arrivedMinutestoSeconds + arrivedSeconds;

        System.out.println("Convert Arrived Hour to Second: 12 * 3600 = " + convertedHourToSeconds);
        System.out.println("Convert Arrived Minute to Second: 15 * 60 = " + convertedHourToSeconds);
        System.out.println("Departure Second: " + arrivedSeconds);
        System.out.println("Total Arrived in Second: " + totalSecondsDepart + " seconds");

        int diffSecondDeptArr = totalSecondsArrived - totalSecondsDepart;
        int diffHourDeptArr = diffSecondDeptArr  / 3600; // jam
        int diffMinutesDeptArr = (diffSecondDeptArr % 3600) / 60;
        int leftSecond = (diffSecondDeptArr % 3600) % 60;

        System.out.println("========== ANSWER ==========");
        System.out.println("Flight Duration in Second: Total Arrived in Second - Total Depart in Second = " + diffSecondDeptArr);
        System.out.println("Hour: diffSecondDeptArr div 3600 = " + diffHourDeptArr);
        System.out.println("Minute: (diffHourDeptArr mod 3600) div 60 = " + diffMinutesDeptArr);
        System.out.println("Second: (diffSecondDeptArr % 3600) % 60 = " + leftSecond);
        System.out.println("============================");
    }
}