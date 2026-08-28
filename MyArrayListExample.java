import java.util.ArrayList;
import java.util.List;

public class MyArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        System.out.println(list.get(2));
        list.remove("B");
        System.out.println(list);
        list.set(2,"E");
        System.out.println(list);
        System.out.println("Size of the List:"+list.size());
        for(String s:list){
            System.out.println(s);
        }
    }

}
