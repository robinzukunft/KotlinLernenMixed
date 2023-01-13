package demo;

import java.util.Objects;

public class PersonJava {
    private int id;
    private String name;
    private String vorname;

    private int alter;

    public PersonJava(int id) {
        this.id = id;
    }

    public PersonJava(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonJava(int id, String name, String vorname) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
    }

    public PersonJava(int id, String name, String vorname, int alter) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonJava that = (PersonJava) o;
        return id == that.id && alter == that.alter && Objects.equals(name, that.name) && Objects.equals(vorname, that.vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, vorname, alter);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonJava{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", alter=").append(alter);
        sb.append('}');
        return sb.toString();
    }
}
