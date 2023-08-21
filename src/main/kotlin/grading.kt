import java.util.Scanner

fun main(){
    var reader=Scanner(System.`in`)

    println("Enter grade: ")
    var grade=reader.nextInt()

    if (grade>80 && grade<=100){
        println("grade scored is A")
    }
    else if (grade>=70 && grade<=80){
        println("grade scored is B")
    }
    else if (grade>=60 && grade<=70){
        println("grade scored is C")
    }
    else{
        println("Fail")
    }

}