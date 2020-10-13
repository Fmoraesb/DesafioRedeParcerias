fun main() {
    println("Digite o seu primeiro nome: ")
    val nome : String?= readLine()
   if (nome.isNullOrBlank() || nome.contains("\"" + "\"")) {
            println("Olá, Mundo!")
        }else {
            val nomeCapitalizado = capitalizarPalavra(nome)
            println("Olá, $nomeCapitalizado")
        }
    }

fun capitalizarPalavra(nome: String): String {
    val nomeAlterado = nome.toLowerCase().split(" ").toMutableList()
    var saida = " "
    for (letra in nomeAlterado) {
        saida += letra.capitalize() + " "
    }
    return saida.trim()
}

