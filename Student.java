import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(85);
        list.add(92);
        list.add(78);
        list.add(90);
        list.add(65);
        list.add(88);
        list.add(66);
        System.out.println(list);
        int min= Collections.min(list);
        int max=Collections.max(list);
        System.out.println("Highest Marks:"+max);
        System.out.println("Lowest Marks:"+min);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        double average = (double) sum / list.size();


        System.out.println("Average: " + average);
        list.removeIf(num -> num >80);

        System.out.println("After removing numbers >80: " + list);
        int numberToCheck = 90;

        if (list.contains(numberToCheck)) {
            System.out.println(numberToCheck + " is present in the list.");
        } else {
            System.out.println(numberToCheck + " is NOT present in the list.");
        }

    }
}
