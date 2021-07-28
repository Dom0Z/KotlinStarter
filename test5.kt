
fun sayHello(Greetin:String, Greetings:List<String>){
    Greetings.forEach{ it->
        println("$Greetin $it")
    }
    
}

fun main() {
    val lst = mutableListOf("Example","Tall", "Short")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    lst.add("medium")
    lst.forEach{
        println(it)
    }
    map.forEach{key, value ->
        println(key)
        println(value)
    }
    map.forEach{
        println(it)
    }
    println(map[2])

    sayHello("Hello", lst)
}