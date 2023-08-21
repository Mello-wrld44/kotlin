class Employee(var jobdescription:String,var Salary:Double,var yearsofexperience:Int){

}
fun main(){
    var a=Employee("Manager",350000.00,12 )
    println(a.jobdescription)

    var b=Employee("Secretary",250000.00,8)
    println(b.jobdescription)

}