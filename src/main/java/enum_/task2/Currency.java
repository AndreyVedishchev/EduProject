package enum_.task2;

//### Задание 2: "Конвертер валют"
//Реализуйте enum `Currency` с основными валютами (USD, EUR, GBP, JPY) и их курсами относительно базовой валюты.
//Добавьте методы для конвертации сумм между валютами.

public enum Currency {
    USD {
        @Override
        public double convert(double amount) {
            return amount / 100;
        }
    },
    EUR {
        @Override
        public double convert(double amount) {
            return amount / 120;
        }
    },
    GBP {
        @Override
        public double convert(double amount) {
            return amount / 150;
        }
    },
    JPY {
        @Override
        public double convert(double amount) {
            return amount / 200;
        }
    };

    public abstract double convert(double amount);
}
