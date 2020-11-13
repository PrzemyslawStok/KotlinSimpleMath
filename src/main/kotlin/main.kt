fun main(){
    val tablica = arrayOf(1,2)

    for(i in 0..tablica.size-1){
        println("tablica[$i]=${tablica[i]}")
    }

    var sumaElementow = 0

    for(i in 0..tablica.size-1){
        sumaElementow = sumaElementow + tablica[i]
    }

    println("Suma elementów tablicy: $sumaElementow")

    val srednia = sumaElementow.toDouble()/tablica.size
    println("Średnia wynosi: ${srednia}")

}
