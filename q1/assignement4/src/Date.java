public class Date {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass())
            return false;
        Date d = (Date) o;
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }
}
