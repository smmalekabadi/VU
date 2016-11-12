/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

import java.util.ArrayList;
import course.Course;
import users.Student;
import users.Teacher;

/**
 *
 * @author morteza
 */
public final class Save {

    private static ArrayList<Course> allCourse = new ArrayList<Course>();
    private static ArrayList<Student> allStudent = new ArrayList<Student>();
    private static ArrayList<Teacher> allTeacher = new ArrayList<Teacher>();

//-------------------------------------------------------------------------------
    /**
     * @return the allCourse
     */
    public static ArrayList<Course> getAllCourse() {
        return allCourse;
    }

    public static void addOnecourse(Course course) {
        allCourse.add(course);
    }

    public static void removeOnecourse(Course course) {
        allCourse.remove(course);
    }

    /**
     * @param allCourse the allCourse to set
     */
    public static void setAllCourse(ArrayList<Course> allCourse) {
        Save.allCourse = allCourse;
    }

    /**
     * @return the allStudent
     */
    public static ArrayList<Student> getAllStudent() {
        return allStudent;
    }

    /**
     * @param aAllStudent the allStudent to set
     */
    public static void setAllStudent(ArrayList<Student> aAllStudent) {
        allStudent = aAllStudent;
    }

    public static void addOneStudent(Student student) {
        allStudent.add(student);
    }

    public static void removeOneStudent(Student student) {
        allStudent.remove(student);
    }

    /**
     * @return the allTeacher
     */
    public static ArrayList<Teacher> getAllTeacher() {
        return allTeacher;
    }

    /**
     * @param aAllTeacher the allTeacher to set
     */
    public static void setAllTeacher(ArrayList<Teacher> aAllTeacher) {
        allTeacher = aAllTeacher;
    }

    public static void addOneTeacher(Teacher teacher) {
        allTeacher.add(teacher);
    }

    public static void removeOneTeacher(Teacher teacher) {
        allCourse.remove(teacher);
    }

}
