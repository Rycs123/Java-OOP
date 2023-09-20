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
        //  * Bulan 2, tahun kabisat, dan hari 1 - 29 maka return day atau return invalid
        if (this.month == 2 && isLeapYear(this.year)) {
            if (this.day > 0 && this.day < 30) {
                return this.day;
            } else {
                return this.day = 1;
            }
        }
        // * bulan 2, bukan tahun kabisat, hari 1 - 28 retrun harinya
        else if (this.month == 2 && !(isLeapYear(this.year))){
            if(this.day > 0 && this.day < 29){
                return this.day;
            } else {
                return this.day = 1;
            }
        }
        // * selain bulan 2 hari 1 - 31
        else if(this.month > 0 && this.month < 13 && this.month != 2){
            return this.day;
        }
        // * invalid day
        else if (this.day < 0){
            return this.day = 1;
        }
        return this.day;
    }

    public int getMonth(){
        if(this.month > 0 && this.month < 13){
            return this.month;
        }
        return this.month = 1;
    }
    public int getYear(){
        if (this.year < 1){
            return 0;
        }
        return this.year;
    }
    public void setDay(int day){
        if ((day > 0)  &&  (day < 32)){
            this.day = day;
        } else{
            this.day = 1;
        }
    }
    public void setMonth(int month){
        if ((month > 0)  &&  (day < 13)){
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
