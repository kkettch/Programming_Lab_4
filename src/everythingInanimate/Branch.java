package everythingInanimate;

import java.util.Objects;

public class Branch {
    public String name;
    public final int capacity;
    public Branch(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return capacity == branch.capacity && Objects.equals(name, branch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
