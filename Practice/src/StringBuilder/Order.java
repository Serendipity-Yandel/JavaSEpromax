package StringBuilder;

public class Order{
    private int year;
    private int monthday;
    private int ms;

    public Order(int year, int monthday, int ms) {
        this.year = year;
        this.monthday = monthday;
        this.ms = ms;
    }

    int getYear(){
        return year;
    }
    int getMonthday(){
        return monthday;
    }
    int getSecond(){
        return ms;
    }

    @Override
    public String toString() {
        return "Order{" +
                "year=" + year +
                ", monthday=" + monthday +
                ", ms=" + ms +
                '}';
    }
}


