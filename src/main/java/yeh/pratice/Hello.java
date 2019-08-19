package yeh.pratice;

public class Hello {
    public static void main(String[] args) {

        new Person().Hello();

    }

    static class Person{
        void Hello(){
            System.out.println("Hello Java");
        }
    }
}
