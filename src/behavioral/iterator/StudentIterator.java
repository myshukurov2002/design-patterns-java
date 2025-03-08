package behavioral.iterator;

import java.util.List;

class StudentIterator implements Iterator {
    private List<String> students;
    private int index;

    public StudentIterator(List<String> students) {
        this.students = students;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return students.get(index++);
        }
        return null;
    }
}