//Desafio Soma de Dois Quadrados

fun somaDosQuadrados(a: Int, b: Int): Int {

    //Calcula o quadrado de 'a' e armazena o resultado na variavel 'quadradoA'
    val quadradoA = a * a

    //Retorna a soma dos quadrados de 'a' e 'b'

    val quadradoB = b * b

    //Retorna a soma dos quadrados de 'quadrada A' e 'quadradaN'
    return quadradoA + quadradoB

}

fun main() {

    val a = 3 // Valor de 'a'
    val b = 4 // Valor de 'b'
    val resultado = somaDosQuadrados(a, b) // CHamada da função 'somaDosQuadrados'
    println("A soma dos quadrados de ${a} e ${b} é igual ao ${resultado}") //Imprime o resultado
}