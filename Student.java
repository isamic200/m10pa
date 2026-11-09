// Student.java
// Isaiah Clark
// 11/8/26 
// Class/application which represents a student directory

package edu.fscj.cop3330c;

public class Student {

   private String name;
   private int age;

   // Constructor initializes student information.
   public Student(String name, int age) {
      this.name = name;
      this.age = age;
   }

   // Returns the student's name.
   public String getName() {
      return name;
   }

   // Returns the student's age.
   public int getAge() {
      return age;
   }

   // Returns student information as a String.
   @Override
   public String toString() {
      return name + ", Age: " + age;
   }
}
