package cz.uhk.ppro.rest2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Greeting {

    private final long id;
    private final String content;
    @JsonIgnore
    private Student student = new Student("dummy", "dummy");

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}