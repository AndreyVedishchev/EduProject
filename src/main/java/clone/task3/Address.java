package clone.task3;

public class Address/*implements Cloneable*/ {
    String street;
    int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}
