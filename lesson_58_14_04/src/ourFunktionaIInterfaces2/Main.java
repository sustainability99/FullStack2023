package ourFunktionaIInterfaces2;

import ourFunktionaIInterfaces2.SomeTest;

import static ourFunktionaIInterfaces2.TestMethodReference.sum;

public class Main {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (a, b) -> (a%b) == 0;
        // hier haben wir T in ein Integer umgewandelt. Siehe ourFunktionaIInterfaces2.SomeTest Interface
        System.out.println(isFactor.test(10,2));// true

        SomeTest<Double> isFactorD = (a,b) -> (a%b) == 0;
        System.out.println(isFactorD.test(200.0,4.0));

        SomeTest<String> isPart = (s1, s2) -> s1.indexOf(s2) != -1; //auch als **s1.contains(s2)** möglich
        System.out.println(isPart.test("abcs", "bc"));

        int[] ints = {1, 50, 81, 10, 3, 9};
        Checkable moreThan10 = n -> n > 10;
        moreThan10 = n -> n < 5;
        System.out.println("sum of elements more than ten = "+sum(ints,moreThan10));


        PersonCreator personCreator = Person ::new;
        Person person = personCreator.create("Jack");
        System.out.println(person.name);

    }
}
