package comparable;

public class ToDo implements Comparable<ToDo> {
    private String name;
    private boolean completed;

    public ToDo(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public void complete() {
        this.completed = true;
    }

    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(ToDo o) {
        if (this.completed || o.completed) {
            if (!this.completed || !o.completed) {
                return Boolean.compare(o.completed, this.completed);
            }
            return this.name.compareTo(o.name);
        }
        return this.name.compareTo(o.name);
    }
}
