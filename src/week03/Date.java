package Week03;

public class Date {
    // instance variables
    private int day;
    private int month;
    private int year;

    // constructor with all attributes
    public Date(int day, int month, int year) {
        // use the setters to assign the attributes
        // to avoid duplication of input validations
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // input validation for day
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        // input validation for month
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // input validation for year
        if (year < 1980 || year > 2079) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String getDate() {
        return String.format("%02d/%02d/%02d", day, month, year);
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
