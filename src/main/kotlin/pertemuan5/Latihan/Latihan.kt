//1.Buatlah program untuk mendeteksi tahun kabisat
//input : 2020
//output : Tahun 2020 merupakan tahun kabisat
//
//2.Buatlah program yang bisa mendeteksi kata duplikasi,
//input : layang-layang
//output : kata layang-layang merupakan kata duplikasi
//
//3.Rumus menghitung rata-rata :( tugas + uts + uas ) / 3
//Jika nilai lebih dari atau sama dengan 75, maka “Lulus”, selain itu tidak lulus
//Rumus menentukan nilai Grade huruf :
//
//A -> Nilai >= 75
//B -> 65 sampai 75
//C  -> 55 sampai 64
//D -> 45 sampai 54
//E -> 44 kebawah
//
//output :
//total nilai : 0 - 100
//grade nilai : A/B/C/D/E
//kategori : lulus / tidak lulus
//
//tolong handle kondisi apabila user memasukkan angka lebih dari 100 dan angka mines
package pertemuan5.Latihan

fun main(){

    val year = 3035
    var leap = false

if ( year % 4 == 0) {
    if (year % 100 == 0) {
        // year is divisible by 400, hence the year is a leap year
        leap = year % 400 == 0
    } else
        leap = true
} else
leap = false

println( if (leap) "Tahun $year merupakan tahun kabisat." else "Tahun $year bukanlah tahun kabisat.")




// nomer 2
    val text = "layang-layang"
    if(text.contains("-")){
        if(text == text.split("-").reversed().joinToString("-")){
            println("Kata $text termasuk kata duplikasi")
        }else{
            println("Kata $text tersebut bukan kata duplikasi")
        }
    }else{
        println("Kata $text tersebut bukan kata duplikasi")
    }





//nomer 3

    val tugas = -100
    val uts = 40
    val uas = -20
    val rataRata = (tugas+uts+uas)/3


    if (rataRata < 0 || rataRata > 100){
        println("Nilai yang anda masukan salah.")
    }else if (rataRata >= 75 ){
        println("Total nilai : $rataRata")
        println("Grade nilai: A")
        println("Lulus")
    }else if (rataRata in 65..74){
        println("Total nilai : $rataRata")
        println("Grade nilai: B")
        println("Tidak lulus")
    }else if (rataRata >= 55 && rataRata < 65){
        println("Total nilai : $rataRata")
        println("Grade nilai: C")
        println("Tidak lulus")
    }else if (rataRata >= 45 && rataRata < 55){
        println("Total nilai : $rataRata")
        println("Grade nilai: D")
        println("Tidak lulus")
    }else if (rataRata < 45 ){
        println("Total nilai : $rataRata")
        println("Grade nilai: E")
        println("Tidak lulus")
    }



}
