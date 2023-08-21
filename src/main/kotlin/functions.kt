fun main(){
    println("Hello Kotlin")

    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var number=Math.round(34.56)
    println(number)

    var num=Math.ceil(45.2)
    println(num)

    sum()
    product(45,3)
    divide(40,2)
    details("Dan",18)
}
 //User-defined Function
 fun sum(){
     var num1=3
     var num2=4
     println(num1+num2)
 }
//Parameterized functions
fun product(x:Int, y:Int){
 println(x*y)

}
fun divide(first:Int, second:Int){
    println(first/second)
}
fun details(name:String, age:Int){
    println("My name is $name. I am $age years old")
}
