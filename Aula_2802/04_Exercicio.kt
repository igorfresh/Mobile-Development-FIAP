//Exercicio 4: Buscando elementos do array

fun main() {
    
    //Array de strings

    val names = arrayOf("Igor, Miguel", "Silva")
    val searchName = "Igor" //elemento a ser buscado
    var found = false //variável para verificar se o elemento foi encontrado ou não

    //Loop para verificar se o elemento esta presente

    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }

    if (found) {
        println("$searchName foi encontrado o array")
    } else {
        println("$searchName não foi encontrado o array")
    }
}