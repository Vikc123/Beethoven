package recovery.methods.generics;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printType() {
        if (value == null) {
            System.out.println("Значение null");
        } else {
            System.out.println("Тип объекта: " + value.getClass().getSimpleName());
        }
    }
}