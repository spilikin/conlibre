package emu.softcard;

import java.util.Arrays;

public class ObjectPath {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectPath that = (ObjectPath) o;
        return Arrays.equals(pathElements, that.pathElements);
    }

    @Override
    public String toString() {
        return "ObjectPath{" +
                "pathElements=" + Arrays.toString(pathElements) +
                '}';
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pathElements);
    }

    private String[] pathElements;

    public ObjectPath(String... pathElements) {
        this.pathElements = pathElements;
    }

    public String toRelativePath() {
        return String.join("/", this.pathElements);
    }
}
