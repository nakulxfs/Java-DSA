public class Student {
     String name;
     String rollNum;
     String house;
     int age;
     

     public Student(String name, String rollNum, int age, String house) {
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
        this.house = house;
     }
      
     @Override
     public String toString() {
        return String.format("Student Details: %nname: %s %nRollNum: %s %nAge: %d %nHouse: %s", name, rollNum, age, house);
     }

     public static void main(String[] args) {
        Student stu  = new Student("Nakul", "A01", 20, "hope");
        System.out.println(stu); 
     }
}