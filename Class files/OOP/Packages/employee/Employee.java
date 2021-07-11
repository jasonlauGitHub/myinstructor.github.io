// Employee (superclass)
// Package 1

package employee;

public class Employee {
  protected String course;

  protected void setCourse(String course) {
    this.course = course;
  }

  protected void printCourse() {
    System.out.println("Your current course is " + this.course);
  }
}
