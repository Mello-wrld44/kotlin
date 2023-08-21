open class shape{

    fun area(){
        var area =45
    }
    fun circumference(){
        println(456)
    }
    fun length(){
        var length=54

    }

}

class rectangle:shape(){
    var length=54
    var breadth=65

    fun getlength(){
       println(length)
    }
    fun getbreadth(){
      println(breadth)
    }
}

class circle:shape(){
        var radius=65

    fun getradius(){
        println(radius)
    }
}
fun main(){
    var R=rectangle()
    R.length()

}