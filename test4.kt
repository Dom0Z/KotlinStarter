fun sayHello(Greetin:String, x:Int){
    
    println("hello $Greetin " + x)
}


fun main() {
    val Arr = arrayOf("Example","Tall", "Short")
    println(Arr.size)
    // kinda missing having an index :(
    for (Arr in Arr){
        println(Arr)
    }
    Arr.forEach{ test -> 
        println(test)
    }
    // Yay Index!!! 
    Arr.forEachIndexed{ i, it ->
        println("$it is at index $i")
    }

}