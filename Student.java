public class Student {
    private String name;
    private int age;
    private double gpa;

    // constructor sets all three fields
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // getters only (the question doesn't ask for setters)
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
}