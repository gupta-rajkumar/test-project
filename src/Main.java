import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,AbsractDataSender<?>> sender = new HashMap<>();
        sender.put(1,new DataSender1());
        sender.put(2,new DataSender2());
        System.out.println(sender.get(1).returnType()); //sample model 1
        System.out.println(sender.get(2).returnType()); //sample model 2
    }
}