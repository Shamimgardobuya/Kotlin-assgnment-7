fun main(){
    addNumb(47)
    drinks(43)
    panda(23)

    println( lovely(arrayOf("Esther","Respah","Nancy")))


}
fun addNumb(x:Int) {
    for (x in 1..100) {
        if (x % 2 == 0) {
            println("Not odd")
        }
        else {
            println(x)
        }
    }
}
fun lovely(name:Array<String>):Int{
    var nubg=0
  name.forEach { name ->
      if (name.length>5)
      nubg++



    }
    return nubg

}
fun drinks(age:Int) {//    var age = "give drink"
    when {
         age  < 6  -> println("Give milk")
         age  in 6..15 -> println("Give fanta orange")
         else -> println("Give coca cola")
    }
}
fun panda(number:Int) {
    for (number in 1..100) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        }
        else {
            println(number)


        }
    }
}

