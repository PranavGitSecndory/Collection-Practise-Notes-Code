import java.util.LinkedHashSet;

public class DemoSet {
    public static void main(String[] args) {
        
     LinkedHashSet<String>  lhs=new LinkedHashSet<>();
     lhs.add("1");
     lhs.add("2");
     lhs.add("3");

     LinkedHashSet<String> lhs2=new LinkedHashSet<>();
     lhs2.add("guava");
     lhs2.add("Apple");
     lhs2.add("banana");
     lhs2.add("orange");
     lhs2.add("cherry");
     lhs2.add("cherry");
     System.out.println("printing the hashset ");
     System.out.println(lhs2.toString());



    }
}
