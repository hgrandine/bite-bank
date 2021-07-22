abstract class FuncionarioAdmin (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
        ): Funcionario(
            cpf,
            nome,
            salario) {
    
    fun autentica(senha:Int): Boolean = this.senha == senha
    
}