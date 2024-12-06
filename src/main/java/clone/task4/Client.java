package clone.task4;

import java.util.Arrays;

public class Client implements Cloneable {
    private final String name;
    private final int age;
    private final String[] phoneNumbers;

    public Client(String name, int age, String[] phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    protected Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не поддерживается", e);
        }
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers.clone();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
}
