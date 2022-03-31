//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++){
            if (min > args[i]){
                min = args[i];
            }
        }
        return min;
    }
}
