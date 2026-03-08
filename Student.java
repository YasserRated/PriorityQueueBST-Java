class Student {
    String name;
    int id;
    int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }
}