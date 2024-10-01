package section3_apis.part2_collections;

//import jdk.internal.access.JavaSecurityAccess;

import java.util.*;

/**
 * YOUR CHALLENGE:
 * This class only contains a so-called public API. There is no underlying code that supports the API.
 * It is your task to implement this logic. Using the right collection type(s).
 */
public class StudentAdmin {

    private HashMap<Integer, Student> students = new HashMap<>();
    private HashMap<String, Course> courses = new HashMap<>();


    /**
     * Returns the students that are present in the database.
     * If the searchString is * (a wildcard), all students will be returned. Else,
     * a simple case insensitive substring match to both first name and family name will be performed.
     * @param searchString the substring string to look for
     * @return students
     */
    public List<Student> getStudents(String searchString) {
        System.out.println("students = " + students);
        System.out.println("courses = " + courses);
        if (searchString.equals("*")) {
            List<Student> allStudents = new ArrayList<>(this.students.values());
            return Collections.unmodifiableList(allStudents);
        } else {
            searchString = searchString.toLowerCase();
            List<Student> foundStudents = new ArrayList<>();
            for (Student student : this.students.values()) {
                if (student.getFirstName().toLowerCase().contains(searchString) |
                        student.getLastName().toLowerCase().contains(searchString)) {
                    foundStudents.add(student);

                }
            }
            return foundStudents;
        }
    }

    /**
     * Returns the grade of a student for the given course
     * @param student the student
     * @param course the course
     * @return grade
     */
    public double getGrade(Student student, Course course) {
        return courses.get(course.getCourseId()).getGrade(student);
    }

    /**
     * returns all grades for a student, as [key=CourseID]:[value=Grade] Map
     * @param student the student to fetch grades for
     * @return grades
     */
    public Map<String, Double> getGradesForStudent(Student student) {
        Map<String, Double> allGradesForStudent = new HashMap<>();
        for (Course course : this.courses.values()) {
            if (course.hasGrade(student)) {
                allGradesForStudent.put(course.getCourseId(), course.getGrade(student));
            }
        }
        return allGradesForStudent;
    }

    /**
     * Returns all grades for a course, as [key=Student]:[value=Grade] Map
     * @param course the course
     * @return grades
     */
    public Map<Student, Double> getGradesForCourse(Course course) {
        return null;
    }


    public void addCourse(String courseId) {
        Course course = new Course(courseId);
        this.courses.put(courseId, course);

    }
    public void addStudent(Student student) {
        if (!(this.students.containsKey(student.getStudentId()))) {
            this.students.put(student.getStudentId(), student);
        }
    }
    
    
    public void addGrade(String courseId, int studentId, double courseGrade) {
        if (!(this.courses.containsKey(courseId))) {
            this.addCourse(courseId);
        }
        Course course = this.courses.get(courseId);
        course.addGrade(studentId, courseGrade);
    }
}
