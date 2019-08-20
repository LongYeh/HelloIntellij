package yeh.pratice;

public class Hello {
    public static void main(String[] args) {

        new Person().Hello();
        int i=4;
        char c='L';
        byte b=127;
        float f=12.7f;
        double d=12.7;
        long l=4L;
        boolean B=true;
        String s="小麻糬";
//        alt+9
//        ctrl+d
//        alt+`

    }

    static class Person{
        void Hello(){
            System.out.println("Hello Java");
        }
    }
}
