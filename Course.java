public class Course {
    static int maxCapacity = 100;
    int enrollments;
    String courseName;

    String[] enrolledStudents;

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    Course() {
        this("Default Course");
    }

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    public void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is full");
        }
    }

    public void enrollStudent() {
        enrollStudent("Unknown Student");
    }

    public void unenrollStudent(String studentName) {
        System.out.println("Student removed: " + studentName);
        if (enrollments > 0) {
            enrollments--;
        }
    }

    public void unenrollStudent() {
        unenrollStudent("Unknown Student");
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Development");
        Course course2 = new Course("Python Programming");
        Course course3 = new Course("Web Development");

        course1.enrollStudent("Alice");
        course2.enrollStudent("Bob");
        course3.enrollStudent("Charlie");

        course1.unenrollStudent("Alice");
        course2.unenrollStudent("Bob");

        System.out.println("Course 1 enrollments: " + course1.enrollments);
    }
}

