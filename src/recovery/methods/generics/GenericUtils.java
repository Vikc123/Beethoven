package recovery.methods.generics;

public class GenericUtils {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}