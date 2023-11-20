package org.hw03;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
 * divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calculator {
    static <F extends Number, S extends Number> Number sum(F first, S second) {
        return first.doubleValue() + second.doubleValue();
    }

    static <F extends Number, S extends Number> Number multiply(F first, S second) {
        return first.doubleValue() * second.doubleValue();
    }

    static <F extends Number, S extends Number> Number divide(F first, S second) {
        return first.doubleValue() / second.doubleValue();
    }

    static <F extends Number, S extends Number> Number subtract(F first, S second) {
        return first.doubleValue() - second.doubleValue();
    }
}
