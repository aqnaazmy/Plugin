package pertemuan3

import sun.security.ec.point.ProjectivePoint.Mutable

fun main(){

    var namaKelompok = arrayOf("aqna",19,true,"menk")//Array Bebas Any bisa menampung semua jenis type data
    var kumpulanString = arrayOf<String>("aaa","asasas","kucing")//Spesifik
    val arrayOfnull : Array<String?> = arrayOfNulls<String>(10)
    arrayOfnull.set(0,"Faizal")
    arrayOfnull[1]="M.aqna azmi"
    arrayOfnull[2]= null
    println(arrayOfnull.toList())
    println(arrayOfnull.size)
    println(arrayOfnull[1])

    val arrayKU = Array(99){it+1}// +1 Agar tidak dimulai dari 0

    var firstName : String? = "aqna"
    firstName = null
    println(firstName)

    val b : String? = null  //String akan terisi "null"
    println(null)




    println(namaKelompok.size)//Memnghitung jumlah value
    println(namaKelompok[0])//Menamnggin value index
    print(namaKelompok.get(1))//Memanggil value index cara ke-2
    println(arrayKU.toList())
    kumpulanString.set(0,"aqna")
    kumpulanString[1]= "aqna"
    println(kumpulanString[1])
    println(kumpulanString[0])


    // Imutable List tidak dapat dirubah
    val myBucketList = listOf("hiking","treaveling","go to pertamina")

    //Mutable List dapat dirubah
    val planningList = mutableListOf("Sleep","eat","hiking")

    planningList.add("watch movie")//meneambahkan value list
    planningList.add("Playing game")//menambahkan value list
    planningList[0]= "turu"//merubah isi value
    planningList.add(1,"watch anime")//menambahkkan value di index yg ditentukan
    // add hanya bisa diisi int-string
    planningList.remove("tursu")//menghapus value sesuai value
    planningList.removeAt(1)//Menghapus value sesuai index
    println(planningList)
    println(planningList[0])//memanggil value secara spesifik

    var a = mutableListOf<String>("aa","bb","cc","dd")
    println(a.removeLast())
    println(a)



    var contoh : Array<Int?> = arrayOfNulls<Int>(10)

    contoh.set(0,2004)


    contoh[1] = 2003
    println(contoh.first())
    println(contoh.last())

    var contoh2 : MutableList<Int?> = mutableListOf(1,2,3,4,null,null)
    contoh2.add(9)
    println(contoh2.first())
    println(contoh2.last())





}