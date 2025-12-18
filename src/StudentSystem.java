class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name =name ;
        this.age = age;
        this.marks = marks;
    }
}

public class StudentSystem {
    public static void main(String[] args) {


        Student s1 = new Student("Rahul", 20, 85);
        Student s2 = new Student("Anita", 19, 78);
        Student s3 = new Student("Suresh", 21, 90);


        int totalMarks = s1.marks + s2.marks + s3.marks;
        double average = totalMarks / 3.0;


        System.out.println("---- Student Information ----");
        System.out.println("Name\tAge\tMarks");
        System.out.println(s1.name + "\t" + s1.age + "\t" + s1.marks);
        System.out.println(s2.name + "\t" + s2.age + "\t" + s2.marks);
        System.out.println(s3.name + "\t" + s3.age + "\t" + s3.marks);

        System.out.println("-----------------------------");
        System.out.println("Average Marks: " + average);
    }
}