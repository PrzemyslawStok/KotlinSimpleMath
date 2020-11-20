fun main(){
    val tablica = arrayOf(1,2,3,4,5,6)

    println("Rozmiar tablicy: ${tablica.size}")
    println("Indeksy tablicy: ${tablica.indices}")

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

    for(i in 1..10)
        wyswietlInfo()

    kolejnaFunckja()

    wizytowka("Przemysław")
    wizytowka("Piotr")
}

fun wyswietlInfo(){
    println("Przykładowe informacje...")
}

fun kolejnaFunckja(){
    println("Kolejne informacje...")
}

fun wizytowka(name: String){
    val surname = "Stokłosa"

    println("Imię: ${name}")
    println("Nazwisko: ${surname}")
}


