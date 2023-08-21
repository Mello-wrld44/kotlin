import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter  first number")
    var fnumber=reader.nextInt()

    println("Enter second number")
    var snumber=reader.nextInt()

    println("Enter the operator(*,-,+,/):")
    var operator= readln()

    if (fnumber==null||operator==null||snumber==null){
        println("Invalid input please put a valid operator")
        return
    }
    val results=when(operator){
        "+"-> fnumber+snumber
        "+"-> fnumber+snumber
        "+"-> fnumber+snumber
        "+"-> fnumber+snumber
        else->"Invalid Operator"
    }
    println("Answer=$results")
}