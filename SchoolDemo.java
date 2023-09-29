class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface Assignable {
    void assignHomework(String assignment);
}

// Teacher class inheriting from Person and implementing Assignable
class Teacher extends Person implements Assignable {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void assignHomework(String assignment) {
        System.out.println("Teacher " + getName() + " assigned homework: " + assignment);
    }
}

// Student class inheriting from Person and implementing Assignable
class Student extends Person implements Assignable {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void assignHomework(String assignment) {
        System.out.println("Student " + getName() + " received homework: " + assignment);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Joy",25);
        Student student = new Student("Harun", 18);

        teacher.displayInfo();
        teacher.assignHomework("Learn Java");

        System.out.println();

        student.displayInfo();
        student.assignHomework("Learn Python");
    }
}
