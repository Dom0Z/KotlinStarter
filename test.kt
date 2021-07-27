val name: String = "Dwomo"
val nullish: String? = null
var x = 0
fun main() {
    println(name)
    println(x)
    for(i in 1..5){
        when(x){
            0->println("Hi")
            1->println("STFU")
            2->println("Leave me be")
            else-> println("walks away further")
        }
        x++

    }
} 