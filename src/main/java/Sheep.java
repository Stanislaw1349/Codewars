//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
public class Sheep {
    public static String countingSheep(int num) {

        String res = "";
        for (int i = 0; i < num; i++ ){
            res += i + 1 + " sheep...";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}
