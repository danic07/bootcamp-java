import java.util.Date;

class validacionFechas {

    private String day;
    private String month;
    private String year;

    public boolean validationDay (int day, int month){

        int dayCheck = 31;
        if (month == 2) {dayCheck = 28;}
        if (day >= 1 && day <=31); {return true;}

        return false;

    }

    public boolean validationMonth(int month){
        int monthCheck = 12;
        if (month >=1 && month <= 12); {return true;}
        return false;
    }

    public boolean validationYear (int year) {
        int yearCheck = 2099;
        if (year >=1900 &&year <= 2099); {return true;}
        return false;

    }


}