package com.github.unicornFrenc.CV.lambdas;


public class Lambdas {

    private static double value3 = 3.0, value4 = 3.0;  // на уровне класса
    // можно использовать и изменять
    // на уровне метода можно использовать, но нельзя изменять

    public static void main(String[] args) {


        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };

        System.out.println(operation.getResult(2.0, 2.0));

//нетерминальная лямбда
        Operation lambda = (double value1, double value2) -> value1 + value2; //типы можно не указывать
        System.out.println(lambda.getResult(3.0, 3.0));


        Printer printer = string -> System.out.println(string);

        Printer printer2 = System.out::println;
        printer.print("Hello!");


        Factorial factorial = value -> {
            int result = 1;

            for (int i = 1; i <= value; ++i) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.getResult(5));

        OperationWithoutParametrs operationWithoutParametrs =
                () -> {

            value3 = 100.0;
            return value3 + value4;};

        System.out.println(operationWithoutParametrs.getResult());
        System.out.println(value3);
        System.out.println(value4);
    }
}