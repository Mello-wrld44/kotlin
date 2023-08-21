import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter length a: ")
    var a=reader.nextDouble()

    println("Enter length b: ")
    var b=reader.nextDouble()

    println("Enter width: ")
    var width=reader.nextDouble()

    var area=(a+b/2)*width
    println("The area of the trapezium is $area")

}