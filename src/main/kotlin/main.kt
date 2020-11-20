fun main(){
    val tablica: Array<Int> = arrayOf(1,2,3,4,5,6)

    tablicaInfo(tablica)
    wyswietlTablice(tablica)

    for(i in 0..tablica.size-1){
        println("tablica[$i]=${tablica[i]}")
    }

    for(i in tablica.indices){
        println("tablica[$i]=${tablica[i]}")
    }

    var sumaElementow = 0

    for(i in 0..tablica.size-1){
        sumaElementow = sumaElementow + tablica[i]
    }

    println("Suma elementów tablicy: $sumaElementow")

    val srednia = sumaElementow/tablica.size
    println("Średnia wynosi: ${srednia}")


    wizytowka("Przemysław","Stokłosa")
    wizytowka("Piotr","Stokłosa")
}

fun wizytowka(name: String, surname: String){

    println("Imię: ${name}")
    println("Nazwisko: ${surname}")
}

fun tablicaInfo(tablica: Array<Int>){
    println("Rozmiar tablicy: ${tablica.size}")
    println("Indeksy tablicy: ${tablica.indices}")
}

fun wyswietlTablice(tablica: Array<Int>){

}


