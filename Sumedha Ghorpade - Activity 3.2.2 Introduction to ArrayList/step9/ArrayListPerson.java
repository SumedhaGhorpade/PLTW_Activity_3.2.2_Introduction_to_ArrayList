package step9;

import java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> newList = new ArrayList<>();

    newList.add(new Person("Mike", 24, 3.5));
    newList.add(new Person("Sully", 24, 6.7));
    newList.add(new Person("Boo", 9, 2.5));

    for (Person p : newList)
    {
      System.out.println(p.getName());
      System.out.println(p.getAge());
      System.out.println(p.getHeight());
    }

    /* newList.add("My cousin"); */
    System.out.println(newList);

  }
}