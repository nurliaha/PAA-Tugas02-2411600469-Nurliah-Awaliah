//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        int convertedHourToSeconds = hour * 3600;
        int convertedMinuteToSecond = minute * 60;
        int totalInSecond = convertedMinuteToSecond + convertedHourToSeconds + second + durationInSeconds;

        int arrivedHour = totalInSecond / 3600; // jam
        int arrivedMinute = (totalInSecond % 3600) / 60;
        int arrivedSecond = (totalInSecond % 3600) % 60;

        System.out.println("Jam : " + arrivedHour);
        System.out.println("Menit : " + arrivedMinute);
        System.out.println("Detik : " + arrivedSecond);


//        Seseorang berangkat pukul  08 : 52 : 45
//        ( pukul 08 lewat 52 menit 45 detik ) ,
//        dan tiba ditujuan pukul : 12 : 15 : 10.
//        Susun program untuk menghitung dan mencetak berapa jam, berapa menit dan berapa detik waktu yang dia habiskan dalam perjalanan.

        int departureHour = 8;
        int departureMinute = 52;
        int departureSecond = 45;
        int arrivedHours = 12;
        int arrivedMinutes = 15;
        int arrivedSeconds = 10;

        int departHourstoSeconds = departureHour * 3600;
        int departMinutetoSeconds = departureMinute * 60;
        int totalSecondsDepart = departHourstoSeconds + departMinutetoSeconds + departureSecond;

        int arrivedHourstoSeconds = arrivedHours * 3600;
        int arrivedMinutestoSeconds = arrivedMinutes * 60 ;
        int totalSecondsArrived = arrivedHourstoSeconds + arrivedMinutestoSeconds + arrivedSeconds;

        int kurangSecondDeptArr = totalSecondsArrived - totalSecondsDepart;
        int convertedSecondHour = kurangSecondDeptArr  / 3600; // jam
        int convertedSecondMinute = (kurangSecondDeptArr % 3600) / 60;
        int leftSecond = (kurangSecondDeptArr % 3600) % 60;





//        int resultHours = arrivedHours - departureHour;
//        int resultMinutes = arrivedMinutes - departureMinute;
//        int resultSeconds = arrivedSeconds - departureSecond;

//        int resultHourstoSeconds = resultHours * 3600;
//        int resultMinutetoSeconds = resultMinutes * 60;
//        int totalSeconds = resultHourstoSeconds + resultMinutetoSeconds + resultSeconds;

        System.out.println("tes");
    }
//
//    public int convertHourToSecond(int hours){
//        return hours * 3600;
//    }
//
//    public int convertMinuteToSecond(int minute){
//        return minute * 60;
//    }
//
//    public int convertSecondToHours(int minute){
//        return minute * 60;
//    }

}