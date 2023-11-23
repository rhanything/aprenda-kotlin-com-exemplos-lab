enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO}

data class Usuario(val nome: String, var nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        
    }
    
    override fun toString():String{
        return "$nome, $conteudos, $inscritos"
    }
}

fun main() {
    val lxd5k=Usuario("LxD5k", Nivel.BASICO)
    val kotlin=ConteudoEducacional("kotlin", 120)
    val java=ConteudoEducacional("java", 12000)
    val androidStudio=ConteudoEducacional("androidStudio")
    val formacao=Formacao("devMobaile", listOf(kotlin, java, androidStudio))
    formacao.matricular(lxd5k)
    formacao.matricular(lxd5k)
    println(formacao)
    
}