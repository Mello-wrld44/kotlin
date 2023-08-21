class Animal(var colour:String,var size:Int){


    fun eat(){
        println("It is eating")
    }
    fun sleep(name:String){
        println("The animal is $name")
    }
    fun woof(){
        println("Woofing")
    }
}
fun main(){
    var a=Animal("White",34)
    var f=Animal("Brown",56)
    f.sleep("Fish")

    var l=Animal("White",45)
    l.sleep("Leopard")
}