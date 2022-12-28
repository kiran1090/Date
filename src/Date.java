

public class Date {
    int Day,Month,Year;
    public Date(int Day,int Month,int Year)
    {
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }
    public int getMonth()
    {
    return Month;
    }
    public int getDay()
    {
        return Day;

    }
    public int getYear()
    {
        return Year;
    }


    public void setMonth(int i) {


    }

    public void setDay(int i) {

    }

    public int setYear(int i) {
        return Year;
    }

    public int setDate(int i, int i1, int i2) {
        return Year;
    }
    @Override
    public String toString() {
        return "Date{" +
                "Day=" + Day +
                ", Month=" + Month +
                ", Year=" + Year +
                '}';
    }

}
