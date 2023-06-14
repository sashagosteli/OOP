
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    List<Student<T, V>> group;
    private V idGroup;

    public StudentGroup(List<Student> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < group.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(counter++);
            }
        };

        // return new SGIterator(group);
    }

}