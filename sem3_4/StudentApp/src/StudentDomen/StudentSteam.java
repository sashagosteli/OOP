package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam extends StudentGroup {
    private int streamID;
    List<Student> stream;

    public StudentSteam(List<Student> group, int idGroup, int streamID) {
        super(group, idGroup);
        this.streamID = streamID;
    }

    public void ListStudentStream() {

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

    // @Override
    // public Iterator<StudentGroup> iterator() {
    // return new SSIterator(this);

    // }
}
