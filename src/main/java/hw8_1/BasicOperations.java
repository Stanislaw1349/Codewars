package hw8_1;
//https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        if (op.equals('+')) {
            return v1 + v2;

        } else if (op.equals('-')) {
            return v1 - v2;

        } else if (op.equals('*')) {
            return v1 * v2;

        } else {

        } return v1 / v2;
    }
}
