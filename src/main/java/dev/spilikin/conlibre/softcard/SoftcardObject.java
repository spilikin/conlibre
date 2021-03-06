package dev.spilikin.conlibre.softcard;

abstract public class SoftcardObject<T> {
    private String name;
    private T value = null;

    public SoftcardObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
