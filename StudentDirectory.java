// StudentDirectory.java
// Isaiah Clark
// 11/8/26 
// Class/application which represents a student directory

package edu.fscj.cop3330c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class StudentDirectory implements Iterable<Student> {

   private List<Student> students;

   // Constructor initializes the student list.
   public StudentDirectory() {
      this.students = new ArrayList<>();
   }

   // Adds a student to the directory.
   public void addStudent(Student student) {
      students.add(student);
   }

   // Searches for a student by name.
   public Optional<Student> findStudentByName(String name) {

      for (Student student : students) {

         if (student.getName().equalsIgnoreCase(name)) {
            return Optional.of(student);
         }
      }

      return Optional.empty();
   }

   // Returns an iterator for the student list.
   @Override
   public Iterator<Student> iterator() {
      return students.iterator();
   }

   public static void main(String[] args) {

      StudentDirectory directory = new StudentDirectory();

      // Add students to the directory.
      directory.addStudent(new Student("Alice", 20));
      directory.addStudent(new Student("Bob", 22));
      directory.addStudent(new Student("Charlie", 19));

      // Iterate through the students.
      System.out.println("Student List:");

      for (Student student : directory) {
         System.out.println(student);
      }

      // Search for an existing student.
      String searchName = "Bob";

      Optional<Student> studentOpt =
         directory.findStudentByName(searchName);

      // Handle the search result.
      if (studentOpt.isPresent()) {
         System.out.println("Found student: " + studentOpt.get());
      } else {
         System.out.println(
            "Student with name " + searchName + " not found."
         );
      }

      // Search for a student who does not exist.
      String nonExistingName = "David";

      Optional<Student> nonExistingStudentOpt =
         directory.findStudentByName(nonExistingName);

      // Handle the second search result.
      if (nonExistingStudentOpt.isPresent()) {
         System.out.println(
            "Found student: " + nonExistingStudentOpt.get()
         );
      } else {
         System.out.println(
            "Student with name " + nonExistingName + " not found."
         );
      }
   }
}
