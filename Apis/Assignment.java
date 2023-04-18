package Apis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment {
    public static void main(String[] args) {
        LocalDate lDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = lDate.format(formatter);
        System.out.println(date);
    }
}
