package Com.Text;

public class Answer {
    private int id;
    private String name;
    private String by;

    public Answer() {}
    public Answer(int id, String name, String by) {
        super();
        this.id = id;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", by='" + by + '\'' +
                '}';
    }
    public void print() {
        System.out.println("answer name is " + name);
    }
}
