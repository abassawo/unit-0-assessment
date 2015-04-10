package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main(String args[]) {
        // Use main to test your methods
        printHelloWorld();
        printSumOf1Upto10UsingForLoop();
        printSumOf1Upto10000UsingForLoop();
        System.out.println(isOdd(5));
        System.out.println(repeatStringXTimes("falafel", 2));
        System.out.println(returnStringUntilQ("sabassQa"));
        System.out.println(bonusPrintOutSumOfFirstTenFibonacciNumbers());

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static Boolean returnPrimitiveBooleanTrue() {
        return null;
    }

    public static int returnPrimitiveInt1729() {
        int value = 1729;
        return value;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        double pi = 3.14;
        return pi;
    }

    public static char returnPrimitiveCharZ() {
        char letter = 'Z';
        return letter;
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for (int i = 10; i >= 0; i--) {
            sum += i;
        }
        System.out.println(sum);
        //System.out.println(1+2+3+4+5+6+7+8+9+10); -test.

    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i = 100000; i >= 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
        return (n % 2 == 1);  //is odd
    }

    public static boolean isMultipleOfThree(int n) {
        return (n % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        return (isOdd(n) && isMultipleOfThree(n));
    }


    public static String repeatStringXTimes(String input, int times) {
        for (int i = 1; i < times; i++) {
            if (times <= 0) {
                input = "";
            } else {
                input += " " +  input;
            }
        }
        return input;
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

    }


    public static String returnStringUntilQ(String input) {

        if (input.contains("q")) {
            input = input.substring(0, input.indexOf("q"));
        } else if (input.contains("Q")){
            input = input.substring(0, input.indexOf("Q"));
        }
        return input;
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person ada = new Person("Ada");
        return ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        Person alanTuring = new Person("Alan Turing", "London");
        return alanTuring;
    }

    public static boolean isFromLondon(Person person) {
        return (person.getCity() == "London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper(){
        Person alanTuring = declareAndReturnPersonNamedAlanTuringFromLondon();
        Person grace = new Person("Grace Hopper");
        HashMap<String, Person> indexNames = new HashMap<String, Person>();

        indexNames.put("Alan Turing", alanTuring);
        indexNames.put("Grace Hopper", grace);
        // The HashMap should have key-value pairs of:
        // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
        // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        return indexNames;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people = declareAndReturnHashmapOfAlanTuringAndGraceHopper();
        people.get("Alan Turing").setCity("Princeton");
        people.get("Grace Hopper").setCity("Arlington");
    }

    //Bonus Problems
    public static int bonusPrintOutSumOfFirstTenFibonacciNumbers() {
     ArrayList<Integer> fibNumbers = new ArrayList<Integer>();
        fibNumbers.add(1);
        fibNumbers.add(1);
        fibNumbers.add(2);
        fibNumbers.add(3);
        fibNumbers.add(5);
        fibNumbers.add(8);
        fibNumbers.add(13);
        fibNumbers.add(21);
        fibNumbers.add(34);
        fibNumbers.add(55);
        int sum = 0;
        for (int i = 0; i < fibNumbers.size(); i++) {
            sum = fibNumbers.get(i);
            sum += sum;
        }
        return sum;

    }

    public static int bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        int fibNum = 0;
        if (fibNum == 1) {
            return 0;
        } else if (fibNum == 2) {
            return 1;
        }
        return (bonusPrintOutSumOfFirstFortyFibonacciNumbers(fibNum - 1) + bonusPrintOutSumOfFirstFortyFibonacciNumbers(fibNum - 2));
    }

}


