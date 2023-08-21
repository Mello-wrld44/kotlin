import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter an alphabet")
    var letter=reader.next().single()

    if (letter=='a' || letter=='e' || letter=='i'|| letter=='o' || letter=='o'|| letter=='u'){
        println("It is a vowel")
    }
    else{
        println("It is a consonant")
    }

}