public class Year {
    public static int LeapYearCount(int year) {
        return ((year/4 ) - (year/100) + (year/400));

    }
}
