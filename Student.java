class Student{  
  int rollno;
  String name;
  Student(int r,String n){
     rollno=r;
     name=n;
  }
 public static void main(String[] args)
 {
 Student s1=new Student(1,"akhil");
 Student s2=new Student(2,"munawar");
 System.out.println(s1.rollno+" "+s1.name);
 System.out.println(s2.rollno+" "+s2.name);
 }
 }
  
