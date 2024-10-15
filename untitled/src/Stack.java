import java.lang.System;
public class Stack {

    private int[] elements;
    private int size;

    public static final default_capacity=16;

    Stack(){
        this(default_capacity);
        System.out.println("size: " + size);

    }

    Stack(int size) {
        elements = new int [size];
    }

    public void push (int value) {

        if (size>=elements.length) {
            int [] temp = new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }

        elements[size++] = value;

    }

}
