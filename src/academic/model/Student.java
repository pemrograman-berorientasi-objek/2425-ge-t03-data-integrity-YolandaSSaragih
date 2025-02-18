package academic.model;

public class Student {
    private String id;
    private String name;
    private String angkatan;
    private String prodi;

    public Student(String id, String name, String angkatan, String prodi) {
        this.id = id;
        this.name = name;
        this.angkatan = angkatan;
        this.prodi = prodi;
    }

    public String getId() {
        return id; // Implemented method
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + angkatan + "|" + prodi;
    }
}