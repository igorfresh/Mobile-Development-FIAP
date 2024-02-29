fun main() {

    var quantCoxinha = 3
    var quantCerveja = 2
    var precoCerveja = 15.00
    var precoCoxinha = 5.00
    var precoTotalProdutos = quantCerveja * precoCerveja + quantCoxinha * precoCoxinha
    var taxa = 0.1 * precoTotalProdutos
    var precoTotalConta = precoTotalProdutos + taxa

    println("-----------------------------------")
    println("             Lanchonete            ")
    println("-----------------------------------")
    println("$quantCoxinha coxinhas      $precoCoxinha")
    println("$quantCerveja cervejas      $precoCerveja")
    println("Somatoria       $precoTotalProdutos")
    println("-----------------------------------")
    println("Conta Final     $precoTotalConta")
}