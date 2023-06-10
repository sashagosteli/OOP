package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SSIterator implements Iterator<Student> {
    private int counter;

    List<Student> streamStudents = new ArrayList<Student>();

    /**
     * @param studentStream
     */
    public SSIterator(StudentStream studentStream) {
        this.streamStudents = streamStudents;
        this.counter = 0;

    }

    @Override
    public boolean hasNext() {
        return counter < streamStudents.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return streamStudents.get(counter);
    }

}
