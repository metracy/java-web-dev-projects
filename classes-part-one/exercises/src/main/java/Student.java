public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        Student student = new Student("Matt T", 12345, 1, 4.0);
}

public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
}