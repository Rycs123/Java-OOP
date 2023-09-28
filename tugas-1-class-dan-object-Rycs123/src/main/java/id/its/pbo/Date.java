package id.its.pbo;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        if (isInFebruary()) {
            if ((isLeapYear(this.year) && isDayValidUntil(29)) ||
                    !(isLeapYear(this.year)) && isDayValidUntil(28)){
                return this.day;
            }
        }
        if(!isInFebruary() && isDayValidUntil(31)){
            return this.day;
        }

        return 1;
    }

    private boolean isDayValidUntil(int finalDay) {
        return this.day > 0 && this.day <= finalDay;
    }

    private boolean isInFebruary() {
        return this.month == 2;
    }

    public int getMonth(){
        if(isMonthBetweenJanuaryToDecember()){
            return this.month;
        }
        return 1;
    }

    private boolean isMonthBetweenJanuaryToDecember() {
        return this.month > 0 && this.month < 13;
    }

    public int getYear(){
        if (this.year < 1){
            return 0;
        }
        return this.year;
    }
    public void setDay(int day){
        if (isDayValidUntil(31)){
            this.day = day;
        } else{
            this.day = 1;
        }
    }
    public void setMonth(int month){
        if (isMonthBetweenJanuaryToDecember()){
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void setYear(int year){
        if (year < 0){
            this.year = 0;
        } else {
            this.year = 1;
        }
    }
    public String displayDate (){
        return this.month + "/" + this.day + "/" + this.year;
    }
}