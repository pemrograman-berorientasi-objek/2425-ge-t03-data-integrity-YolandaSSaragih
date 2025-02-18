package academic.model;

public class Course {
    private String code;
    private String name;
    private int credits;
    private String semester;

    public Course(String code, String name, int credits, String semester) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.semester = semester;
    }

    public String getCode() {
        return code; // Implemented method
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credits + "|" + semester;
    }
}