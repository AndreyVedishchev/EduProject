package records.task2;

import java.util.UUID;

public record Transaction(String id, double amount, TransactionType type) {

    public Transaction {
        if (amount < 0) {
            throw new IllegalArgumentException("Некорректная сумма.");
        }

        if (id == null || id.isEmpty()) {
            id = String.valueOf(UUID.randomUUID());
        }
    }

    enum TransactionType {
        DEPOSIT, WITHDRAWAL, TRANSFER
    }
}

class Starter {
    public static void main(String[] args) {
        Transaction tr = new Transaction(null, 1111, Transaction.TransactionType.DEPOSIT);
        System.out.println(tr);
    }
}