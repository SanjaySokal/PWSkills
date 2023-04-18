package Collections.Enums;

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class Enums {
    // enum Result {
    //     PASS, FAIL, NORESULT;
    // }

    public static void main(String[] args) {
        enum Result {
            PASS, FAIL, NORESULT;
        }

        Week mon = Week.MON;
        System.out.println(mon);

        Result res = Result.PASS;
        System.out.println(res);
    }
}