package project;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public boolean after(Date d) {
        if (this.year > d.year) {
            return true;
        } else if (this.year == d.year && this.month > d.month) {
            return true;
        } else if (this.year == d.year && this.month == d.month && this.day > d.day) {
            return true;
        } else {
            return false;
        }
    }

    public boolean before(Date d) {
        if (this.year < d.year) {
            return true;
        } else if (this.year == d.year && this.month < d.month) {
            return true;
        } else if (this.year == d.year && this.month == d.month && this.day < d.day) {
            return true;
        } else {
            return false;
        }
    }
}
