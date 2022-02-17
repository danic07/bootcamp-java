import java.time.Month;
import java.time.Year;
import java.util.Date;

class validationDate {

    private String currentDay;
    private String currentMonth;
    private String currentYear;
    private Date currentDate;


    public boolean validationDay (int currentDay, int currentMonth){

        int currentDayCheck = 31;
        if (currentMonth == 2 && currentYear % 4 ==0) {
            currentDayCheck = 29;}
        if (currentMonth == 2) {currentDayCheck = 28;}
        if (currentDay >= 1 && currentDay <=31); {return true;}

        return false;

    }

    public boolean validationMonth(int month){
        int monthCheck = 12;
        if (month >=1 && month <= 12);
        return false;
    }

    public boolean validationYear (int year) {
        int yearCheck = 2099;
        if (year >=1900 &&year <= 2099);
        return false;

    }


}