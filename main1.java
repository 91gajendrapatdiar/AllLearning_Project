import java.util.*;
public class main1{
    public static void main(String[] args) {
    ArrayList al= new ArrayList();
    al.add("Gajendra Patidar");
    al.add(21);
    al.add(false);
    al.add("java Developer");
    al.add(18);
    System.out.println(al);
    System.out.println(al.size());
    System.out.println(al.isEmpty());
    ArrayList all= new ArrayList();
    all.add("Myank goyal");
    all.add("Darshit");
    System.out.println(all);
    System.out.println(all.get(1));
    System.out.println(al.get(3));



//Linkedlist<Integer> alll = new ArrayList<>();
//bl.(1);
    


//  printing the vlaue of the arraylist using the for loop 
  for(int i= 0 ; i<=al.size();i++){
System.out.println(al.get(i));
  }


    }
}