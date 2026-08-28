import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>();
        name.put(101, "A-90");
        name.put(102, "B-80");
        name.put(103, "C-70");
        name.put(104, "D-80");
        name.put(105, "E-80");

        System.out.println("All Students: " + name);

        int studentNo = 102;
        System.out.println("Student " + studentNo + ": " + name.get(studentNo));

        if (name.containsKey(103)) {
            System.out.println("Student 103 exists with value: " + name.get(103));
        }

        name.remove(104);
        System.out.println("After removing student 104: " + name);

        System.out.println("\nIterating through students:");
        for (Map.Entry<Integer, String> entry : name.entrySet()) {
            System.out.println("Student No: " + entry.getKey() + " -> " + entry.getValue());
        }

        name.put(105, "E-85");
        System.out.println("Updated student 105: " + name.get(105));
    }
}
