package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import StudentDomen.Student;

public class StudentStream extends StudentGroup implements Iterable<Student> {
    private int streamID;
    List<Student> stream = new ArrayList<Student>();

    public StudentStream(List<Student> group, int idGroup, int streamID) {
        super(group, idGroup);
        this.streamID = streamID;
    }

    public int getStreamID() {
        return streamID;
    }

    public void setStreamID(int streamID) {
        this.streamID = streamID;
    }

    public List<Student> getStream() {
        return stream;
    }

    public void setStream(List<Student> stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return ">>> Поток : " + streamID + ", id Группы : " + super.getIdGroup() +
                " >>>Список студентов в потоке номер " + streamID +
                " : " + super.group + '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new SSIterator(this);
    }
}
