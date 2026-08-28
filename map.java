import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args){
        Map<Integer,String>name=new HashMap<>();
        name.put(1,"A");
        name.put(2,"B");
        System.out.println(name.get(1));
        System.out.println("Check the value:"+name.containsValue("A"));
        System.out.println("Check the Key:"+name.containsKey(1));
        name.remove(1);
        System.out.println(name.size());
    }
}
