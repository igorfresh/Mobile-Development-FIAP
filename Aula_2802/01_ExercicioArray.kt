// Exercicio 1: soma dos elementos

fun main() {

    //Array de inteiros
    val numbers = intArrayOf(5,10,15,20,25) //imutável
    var sum = 0 // variável para armazenar

    //Loop para somar os elementos da array
    for (number in numbers) {
        sum += number
    }

    //imprimindo o resultado
    println("A soma dos elementos é a variável $sum")
}