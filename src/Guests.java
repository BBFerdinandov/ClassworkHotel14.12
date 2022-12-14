public class Guests {

    String name;
    String EGN;
    int martialStatus;
    int nights;
    double bedPrice;
    String city;

    public Guests(String name, String EGN, int martialStatus, int nights, double bedPrice, String city) {
        this.name = name;
        this.EGN = EGN;
        this.martialStatus = martialStatus;
        this.nights = nights;
        this.bedPrice = bedPrice;
        this.city = city;
    }

    public Guests() {

    }

    @Override
    public String toString() {
        return "HotelGuests{" +
                "name='" + name + '\'' +
                ", ucn='" + EGN + '\'' +
                ", maritalStatus=" + martialStatus +
                ", nights=" + nights +
                ", beds=" + bedPrice +
                ", city='" + city + '\'' +
                '}';
    }
}