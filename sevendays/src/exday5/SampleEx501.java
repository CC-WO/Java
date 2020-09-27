package exday5;

import java.util.ArrayList;

public class SampleEx501 {
  public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<Student>();
    // ArrayList al = new ArrayList<>();

    al.add(new Student("一郎",1,1));
    al.add(new Student("花子",1,2));
    al.add(new Student("たかし",2,3));
    al.add(new Student("紀子",2,4));
    al.add(new Student("直美",3,5));

    al.remove(3);

    for (int i = 0; i < al.size(); i++) {
      Student s = (Student)al.get(i);
      System.out.println("番号：" + s.getNumber() + " 名前：" + s.getName() + " 学年：" + s.getGrade());
    }
  }
}
