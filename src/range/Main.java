package range;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Range range = new NumberRange(3,10);
        Range range1 = new AlphabetRange('m','z');
        ArrayList<Integer> list = range.getAll();
        ArrayList<Character> list1 = range1.getAll();
        for (Integer item: list) {
            System.out.println(item);
        }
        for (Character item: list1) {
            System.out.println(item);
        }

        System.out.println(list1.contains('a'));
    }
}
