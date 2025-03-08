package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

class StudentList implements StudentCollection {
    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator(students);
    }
}