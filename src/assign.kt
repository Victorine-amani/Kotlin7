import java.util.*

fun odds(){
    for(num in 1..100)
    if (num%2!=0){
        println(num)
    }
}
fun name(names:Array<String>):Int{
    var namesize=0
    for (name in names)
        if(name.length>=5){
           namesize++

    };return namesize

}
fun machine(age:Int){
    when {
        age<6 -> {
            println("Glass of milk")
        }
        age in 7..15 -> {
            println("Bottle of fanta orange")
        }
        else -> {
            println("Bottle of coca cola")
        }
    }
}
fun each(){
    for (num in 1..100){
        if(num%3==0 && num%5==0){
            println("FizzBuzz")
        }else if(num%5==0){
            println("Buzz")
        }else if(num%3==0 ){
            println("Fizz")
        }else{
            println(num)
        }
    }
}



fun main(){
    odds()
    println(name(arrayOf("Victorine","Hunter","Favour","Joel","Hezborn")))
    machine(2)
    machine(13)
    machine(20)
    each()

}