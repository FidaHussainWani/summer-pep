

public class AssertionDemo {

    public static void main(String[] args) {

        int marks = 75;

        assert marks >= 35 : "Student Failed";

        System.out.println("Student Passed");
    }
}