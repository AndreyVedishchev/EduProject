package clone.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {

        //создал два клиента
        Client c1 = new Client("cl1", 20, new String[]{"1111","2222"});
        Client c2 = new Client("cl2", 30, new String[]{"3333","4444"});
        Client c3 = new Client("cl3", 40, new String[]{"5555","6666"});

        //создал фирму с двумя клиентами
        Company company1 = new Company("фирма", "ул. пушкина");
        company1.setClients(new ArrayList<>(Arrays.asList(c1, c2)));
        System.out.println("company1: " + company1);

        //создание клона фирмы, замена клиента и указание другого адреса
        Company company2 = company1.clone();
        company2.getClients().remove(0);
        company2.getClients().add(c3);
        company2.setAddress("ул. ленина");
        System.out.println("company2: " + company2);

        //проверка оригнала, он без изменений
        System.out.println("company1: " + company1);
    }
}
