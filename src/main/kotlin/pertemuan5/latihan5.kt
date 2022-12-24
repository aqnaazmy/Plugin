fun main(){

    val plus = 5 + 5
    val minus = 5 - 5
    val kali = 5 * 5
    val bagi = 5 / 5
    val mod = 10 % 5

    println(plus)
    println(minus)
    println(kali)
    println(bagi)
    println(mod)

    //Operator Assigment
    var a = 10
    var b = 20
    a+=b // a = a + b
    a-=b // a = a - b
    a*=b // a = a*b
    a/=b // a = a / b
    a%=b // a = a%b

    // Operator perbandingan

    val lebihDari = a > b
    val kurangDari = a < b
    val lebihDariSamadengan = 10 >= 10  // Apakah 10 lebih atau sama dengan 10 // true
    val kurangDariSamaDengan = 10 <= 10 // Apakah 10 kurang atau sama dengan 10 // true
    val samaDengan = 10 == 10 //true
    val tidakSamaDengan = 10 != 10 //true
    println(lebihDari)
    println(kurangDari)
    println(lebihDariSamadengan)
    println(kurangDariSamaDengan)
    println(samaDengan)
    println(tidakSamaDengan)


    // Operator logika
              // true     //true
    val and = 10 >= 10 && 12 > 11 // dua duanya harus true
    println(and) // true
            //false     // true
    val or = 10 > 10 || 10 < 11 // jika salah satu true mamka hasilnya akan true
    println(or) // true

    val negasi = !false // kebalikan
    println(negasi)

    var c = 10
    c ++ // c + 1
    c -- // c - 1

    val kondisi = "hujan"
    //Isi if harus type data Boolean
    if(100<90 && 100>200){
        println("bawa payung")
    }else{
        println("tidak bawa payung")
    }

    val kti = 71

    if (kti > 90 && kti <= 100 ){
        println("good job")
    }else if (kti > 80 && kti <= 89){
        println("good")
    }else if (kti > 70 && kti <= 79){
        println("not bad")
    }else{
        println("bloogggg")
    }


    val kalkulus = 'A'
    when (kalkulus){
        'A'-> {
            println("Ente laka lawan")
            println("Ente laka lawan")
            println("Ente laka lawan")
            println("Ente laka lawan")
            println("Ente laka lawan")
        }
        'B'-> println("Hebat ws")
        'C'-> println("Namane be urip")
    }

    val vri = 70
    if (vri % 2 == 0) {
        println("genap")
    } else {
       println("ganjil")
    }







}