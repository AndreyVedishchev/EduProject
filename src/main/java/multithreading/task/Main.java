package multithreading.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        ///////// Заполнение //////////////////
        List<Account> accounts = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            accounts.add(new Account(i, 100*i));
        }
        accounts.forEach(System.out::println);
        ///////////////////////////////////////

        for (int i = 0; i < accounts.size(); i++) {
            Thread thread = new Thread(() -> {

                int fromIdx = new Random().nextInt(10);
                int toIdx = new Random().nextInt(10);
                int amount = 300;

                Account from = accounts.get(fromIdx);
                Account to = accounts.get(toIdx);

//                sendAtomic(from, to, amount);
                sendSynchronized(from, to, amount);
            });
            thread.start();
        }
    }

    /**
     * запуск через Atomic
     */
    public static void sendAtomic(Account from, Account to, int amount) {
        AtomicReference<Account> atomicAcc = new AtomicReference<>(from);
        int beforeFrom = from.balance;
        int beforeTo = to.balance;
        String name = Thread.currentThread().getName();

        if (from.balance >= amount) {

            from.balance = from.balance - amount;
            to.balance = to.balance + amount;

            if (atomicAcc.compareAndSet(from, to)) {
                System.out.println(name + " Перевели из аккаунта " + from.id + "(" + beforeFrom + ")"
                        + " в аккаунт " + to.id + "(" + beforeTo + ")" + " сумму " + amount
                        + "; новые значения from: " + from.balance + "; to: " + to.balance
                );
            }
        } else {
            System.out.println("Сумма перевода больше допустимой!! Баланс: " + from.balance + ", а запрос для перевода: " + amount);
        }
    }

    /**
     * запуск через synchronized
     */
    public static void sendSynchronized(Account from, Account to, int amount) {

        int beforeFrom;
        int beforeTo;
        String name = Thread.currentThread().getName();

        if (from.balance >= amount) { // валидация баланса
            synchronized(from) { // from блокируется первый
                beforeFrom = from.balance;
                from.balance = from.balance - amount;
            }

            synchronized(to) { // to блокируется второй.
                beforeTo = to.balance;
                to.balance = to.balance + amount;
            }
            //Напиши пожалуйста в ответе реализацию, где надо сравнивать id, я не понял замысел этого выражения if (acc1.id > acc2.id) ? firstLock = acc1; secondLock = acc2 : наоборот

            System.out.println(name + " Перевели из аккаунта " + from.id + "(" + beforeFrom + ")"
                    + " в аккаунт " + to.id + "(" + beforeTo + ")" + " сумму " + amount
                    + "; новые значения from: " + from.balance + "; to: " + to.balance
            );
        } else {
            System.out.println("Сумма перевода больше допустимой!! Баланс: " + from.balance + ", а запрос для перевода: " + amount);
        }
    }
}

// нужно реализовать сервис, который будет отправлять средства с одного счета на другой (реалзация должна работать для многопоточного приложения)
// что реализовать задачу избежать dead lock нужно понять как блокировать аккаунты всегда в одном и том же порядке
// нам нужно сделать так чтобы могли избежать блокировки метода полностью
// валидация
// пессемистичный (используется при высокой нагрузке) или оптимистичный подход (низкая нагрузка, присутствуют операции чтения)

//transferMoney(acc1, acc2, amount) {
//    1) validation
//    2) с помощью id  мы можем выявить порядок для блокировки аккаунтов
//    - создаем два объекта которые будем использовать для блокировки
//            - if (acc1.id > acc2.id) ? firstLock = acc1; secondLock = acc2 : наоборот
//    synchronized(firstLock)
//
//    synchronized(secondLock)
//}