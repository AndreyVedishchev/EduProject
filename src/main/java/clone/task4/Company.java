package clone.task4;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {
    private final String name;
    private String address;
    private List<Client> clients;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.clients = new ArrayList<>();
    }

    @Override
    protected Company clone() {
        try {
            Company cloneCompany = (Company) super.clone();
            cloneCompany.clients = new ArrayList<>(this.clients);
            return cloneCompany;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не поддерживается", e);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", clients=" + clients +
                '}';
    }
}
