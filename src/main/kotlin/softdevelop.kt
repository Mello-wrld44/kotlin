open class  employee{
    fun name(){
        println("Ollery")
    }
    fun age(){
        println(32)
    }
    fun salary(){
        println(350000)
    }

}

class Webdeveloper:employee(){
    fun website(){
        println("Ecommerce")
    }
}
class Androiddeveloper:employee(){
    fun android(){
        println("Android")
    }

}
class IOSDeveloper:employee(){
    fun ios(){
        println("just print")
    }
}
fun main(){
    var w=Webdeveloper()
    w.salary()

    var a=Androiddeveloper()
    a.salary()

    var i=IOSDeveloper()
    i.salary()
}



