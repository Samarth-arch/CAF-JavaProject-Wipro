import java.util.Random;

interface Student {
    void setStudentDetails(String name, int rollNo);
}

class GiveAssessment {
    private String assessmentDetails;

    public void setAssessmentDetails(String details) {
        this.assessmentDetails = details;
    }

    public String getAssessmentDetails() {
        return this.assessmentDetails;
    }

    public int getMarks() {
        Random random = new Random();
        // 0 to 100 include hoga random function me
        return random.nextInt(101);
    }
}

class Teacher extends GiveAssessment implements Student {
    private String studentName;
    private int studentRollNo;
    private int marks;
    private String zone;

    public void setStudentDetails(String name, int rollNo) {
        this.studentName = name;
        this.studentRollNo = rollNo;
    }

    public void assignZone() {
        this.marks = getMarks();
        if (marks > 70) {
            this.zone = "green";
        } else if (marks >= 50) {
            this.zone = "yellow";
        } else {
            this.zone = "red";
        }
    }

    public void printDetails() {
        System.out.println("student name: " + studentName);
        System.out.println("student roll No: " + studentRollNo);
        System.out.println("assessment details: " + getAssessmentDetails());
        System.out.println("marks: " + marks);
        System.out.println("assigned znoe: " + zone);
    }
}

public class Project {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setStudentDetails("Smrth Sahu", 55);
        teacher.setAssessmentDetails("Mock Assessment");
        teacher.assignZone();
        teacher.printDetails();
    }
}
