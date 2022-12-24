package pertemuan4
fun main(){
    var tukar = mutableListOf("kotlin", "Java", "PHP", "Python")
    tukar[0] = tukar[2].also { tukar[2] = tukar[0]}
    println(tukar)
}