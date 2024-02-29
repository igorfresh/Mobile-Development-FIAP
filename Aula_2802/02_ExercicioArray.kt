//Exercicio 2: Maior e Menor elemento

fun main () {

    val numbers = intArrayOf(8,3,12,6,20)
    var max = numbers[0] //variável para armazenar o maior elemento 
    var min = numbers[0] //variável para armazenar o menor elemento

    //Loop para encontrar o menor e o maior elemento

    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
        
    }

println("o menor elemento é: $min")
println("o menor elemento é: $max")



}