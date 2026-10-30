package recovery;

import recovery.methods.generics.Box;
import recovery.methods.generics.GenericUtils;
import recovery.methods.generics.NumberUtils;
import recovery.methods.generics.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== BOX ===");

        Box<String> stringBox = new Box<>("Java");
        Box<Integer> integerBox = new Box<>(123);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());
        System.out.println(doubleBox.getValue());

        stringBox.setValue("Java Generics");
        System.out.println(stringBox.getValue());

        stringBox.printType();
        integerBox.printType();
        doubleBox.printType();

        // integerBox.setValue("Hello"); // Ошибка компиляции

        System.out.println("\n=== GENERIC METHODS ===");

        String[] names = {"Иван", "Анна"};
        Integer[] numbers = {10, 20, 30};
        Double[] values = {1.5, 2.5};

        GenericUtils.printArray(names);
        GenericUtils.printArray(numbers);
        GenericUtils.printArray(values);

        System.out.println("\n=== BOUNDED TYPES ===");

        System.out.println(NumberUtils.sum(10, 20));
        System.out.println(NumberUtils.sum(1.5, 2.5));
        System.out.println(NumberUtils.sum(1.5f, 2.5f));


        System.out.println("\n=== WILDCARDS ===");

        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);

        List<Number> numberList = new ArrayList<>();

        ListUtils.printList(strings);
        ListUtils.printList(integers);

        System.out.println(ListUtils.sumNumbers(integers));
        System.out.println(ListUtils.sumNumbers(doubles));

        ListUtils.addIntegers(numberList);
        ListUtils.addIntegers(integers);

        System.out.println("После добавления:");

        ListUtils.printList(numberList);
        ListUtils.printList(integers);
    }
}