package yeh.pratice

fun main() {
//    println("Hello");
//    Person().hello();
    val h=Person();
    h.hello();
//    val 不可改變
//    var 可改變
//    var  age:Int =123;
    var age=123;
    var kg:Double=65.5;
    var name:String;
    name="小麻糬";
}

class Person{
    fun hello(){
        println("hello kotlin");
    }
}