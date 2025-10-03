//package collection_Framework;

import java.util.ArrayList;

public class PractList1 {
    public static void main(String[] args) {
         ArrayList<StudentData> sd=new ArrayList<>();
         sd.add(new StudentData(1, "pranav", 78, 500));
         sd.add(new StudentData(2, "nikhil", 98, 400));
         sd.add(new StudentData(3, "suraj", 70, 700));
         sd.add(new StudentData(4, "abhi", 45, 900));

         System.out.println(sd) ;

         for (StudentData studentData : sd) {
            studentData.showData();
         }
           }
}

class StudentData{
    int std_id;
    String std_name;
    int mks_csc;
    int mks_mm;

  public StudentData(int std_id,String std_name,int mks_csc,int mks_mm)
  {
   
    this.mks_csc=mks_csc;
    this.std_id=std_id;
    this.std_name=std_name;
    this.mks_mm=mks_mm;
  }

  void showData(){

    System.out.println("student ID::"+std_id+" Studnt name::"+std_name+" marks::"+mks_csc);
  }

public String toString(){
    return  "StudentData [std_id="+std_id+"std_name]";
}


}
