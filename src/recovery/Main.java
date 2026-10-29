package recovery;

import recovery.methods.declaration_and_invocation;

public class Main {
    public static void main(String[] args) {
        declaration_and_invocation p = new declaration_and_invocation();
        int r = p.calculateArea(2,2);
        p.printArea(r);
    }
}