package clone.task2;

//1. Создайте класс Person с полями name и age, реализуйте его клонирование
//2. Напишите программу, которая создает копию объекта и изменяет ее
//3. Обработайте ситуацию с клонированием null-объекта

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(User user) {
        this.name = user.name;
        this.age = user.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
