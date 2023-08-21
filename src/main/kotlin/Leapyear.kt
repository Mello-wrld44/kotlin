import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter a year")
    var year=reader.nextInt()

    if (year%4==0){
        println("The year is a leap year")
    }
    else{
        println("The year is not a leap year")
    }

}