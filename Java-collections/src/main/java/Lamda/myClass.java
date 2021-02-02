package Lamda;

import java.util.Objects;

public class myClass  implements Comparable<myClass>{
    private String version;
    private String name;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public myClass(String version, String name) {
        this.version = version;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myClass myClass = (myClass) o;
        return Objects.equals(version, myClass.version) && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, name);
    }

    @Override
    public String toString() {
        return "myClass{" +
                "version='" + version + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(myClass o) {
        return name.compareToIgnoreCase(o.name);
    }
}
