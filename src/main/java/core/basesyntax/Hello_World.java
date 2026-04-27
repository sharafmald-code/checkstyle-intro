package core.basesyntax;

import java.time.LocalDate;

/**
 * The Hello_World class demonstrates common checkstyle violations fixes.
 */
public class Hello_World {
    private String stringA;
    private int variable;
    private int age;
    private int size;

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
                + "This class looks weird! Your task is to fix the checkstyle in this file."
                + " Your goal is to run 'mvn clean package' and receive 'BUILD SUCCESS' message");
        System.out.println(hello);
    }

    private void initializeVariables() {
        stringA = "Hello mates!";
        System.out.println(stringA);
        variable = LocalDate.now().getYear();
        System.out.println("It is " + variable + "year");
        age = 25;
        System.out.println("I'm " + age);
        size = 42;
        System.out.println("The size is " + size);
    }
}
