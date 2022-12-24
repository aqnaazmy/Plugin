package Pertemuan1
fun main(){
    //Tipe Data String
    val namaDepan : String = "Aqna" //permanen
    val namaBelakang = " Azmi"
    var name : String = "aqna" //Dapat diubah valuenya
    val umur : Int = 20
    val result = "Nama saya $namaDepan $namaBelakang umur saya $umur tahun "

    println(result)
    print("aaaa")
    print("aaa")

    //Tipe Data Int
    //Bliangan bulat
    val byte : Byte = 100
    val short : Short = 10000
    val Long = 100L

    //Bilangan pecahan
    val float = 15.555F
    val double = 15.55555555

    //Tipe Data char
    val char = 'A' //Biasa digunakan untuk case Nilai / Grade (Satu huruf saja)

    val biodata = """ 
        baris 1
        baris 2
        baris 3
    """.trimIndent() // Petik " tiga kali untuk kalimat lebih  dari satu baris
    println(biodata)

    //Tipe data Boolean
    val nilaiBenar = true
    val nilaiSalah = false

    println("Nama Saya " + namaDepan + namaBelakang +" Umur saya " + umur + " Tahun")

}