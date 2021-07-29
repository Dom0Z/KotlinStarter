fun sayHello(Greetin:String, vararg Greetings:String){
    Greetings.forEach{ it->
        println("$Greetin $it")
    }
}

    fun main() {
        val arr = arrayOf("Example","Tall", "Short")
        // my solution 
        for(i in arr){
            sayHello("Hello", i)
        }
        // smart solution Hahahahah
        sayHello("henlo", *arr)

        
    }