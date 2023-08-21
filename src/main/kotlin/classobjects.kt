class Person{
    //  Attributes/Property/Variable
    var name="Dan"
    var skintone="Darkskin"
    var age=32

    //Method/Function
    fun eat(){
        println("Eating")
    }
    fun walk() {
        println("Walking")
    }

}
fun main(){
    var teacher=Person()
    println(teacher.age)

    teacher.walk()

    //object2
    var accountant=Person()
    println(accountant.age)
}


