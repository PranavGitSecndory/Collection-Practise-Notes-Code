package SetPract;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
class EmployeeData{
    int id;
    String name;

    public EmployeeData(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "\n ID:: "+id+"\n Name::"+name;
    }

    // //  Override hashCode() and equals() properly
    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, name);
    // }

    //   @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true; // same object
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     EmployeeData that = (EmployeeData) obj;
    //     return id == that.id && Objects.equals(name, that.name);
    // }
}

public class SetDemo1 {
    public static void main(String[] args) {
        System.out.println("performing the hash in custom class");
        EmployeeData Edref=new EmployeeData(0,"sam");
        Set<EmployeeData> ed=new HashSet<>();
        ed.add(new EmployeeData(1,"nik"));
        ed.add(new EmployeeData(2, "kiran"));
        ed.add(new EmployeeData(3, "sham"));
        ed.add(new EmployeeData(4, "niraj"));//same object is created new below 
        ed.add(new EmployeeData(4, "niraj"));//this also print becuse it shows that its differnet 
       
        System.out.println(ed.toString());

        System.out.println("Now manually wanted to print the same content object and ovveride");
        ed.add(new EmployeeData(5, "shaktisingh"));//same object is created new below 
        ed.add(new EmployeeData(5, "shaktisingh"));//now this should not be print because same content 
       
         System.out.println(ed);
         
        


    }
}
