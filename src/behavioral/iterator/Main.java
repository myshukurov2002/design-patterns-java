package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent("Ali");
        studentList.addStudent("Madina");
        studentList.addStudent("Jasur");

        Iterator iterator = studentList.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Talaba: " + iterator.next());
        }
    }
}
