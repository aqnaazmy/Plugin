fun main(){
    //RANGE (Jarak)
    val range = 0..10
    val range1 = 1 until 10
    val range2 = 10 downTo 0
    val range3 = 10 downTo 0
    val range4 = 0 until 10 step 2

    println(range.toList())
    println(range1.toList())
    println(range2.toList())
    println(range3.toList())
    println(range4.toList())

    //For Loop

    for (i in range ) {
        if (i % 2 == 0){ // Menampilkan Bilangan genap
            println(i)
        }
    }

    //String for array

    val nama = arrayOf("muhammad", "aqna", "azmi")
    for (i in nama){
        if (i.equals("aqna")){
            println(i)
        } //Memanggil index array spesifik
        if (i == "aqna"){
            println(i)}
    }

    // While do Loop

    var counter = 5
    while (counter > 0) {
        if (counter%2==1){
        println("Hello $counter")
        }
        counter--
    }

    // Do While
    var count = 0
     do {
        println("Hello Word $count")
        count++
    }while (count<10)

    // Break
    val array = arrayOf(1,2,3,4,null,7)
    for (i in array){
        if (i==7){
            break           //Ketika sampai  di angka null maka akan di skip
        }
            println(i)
    }

    //Continue 0 1 2 3
    for (i in range){
        if (i%2==1){   //Ketika value null maka akan skipp dan tidak di tampilkan
            continue
        }
        println(i)
    }





}