package collection_Framework;

import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {
    public static void main(String[] args) {
        List l=new ArrayList();//best way to use same refernve can be used for the linkedList (Memory usage)
       
        ArrayList al=new ArrayList<>();
        al.add(23); //auto boxing int to Integer
           al.add(25);
           al.add(45);
           System.out.println(al.toString());
           al.addFirst(3);
           System.out.println(al.toString());


           //generic decaltration  we are forcing to get it only the string 
           ArrayList<String> al2=new ArrayList<>();
           al2.add("Nikhil");
           al2.add("spring");

           System.out.println();

           System.out.println("searching for the particular given object ::");
           System.out.println("does ciontain the Nikhil::"+al2.contains("Nikhil"));
         
    }
}
