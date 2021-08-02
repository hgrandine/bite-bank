abstract class FuncionarioAdmin (
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
        ): Funcionario(
            cpf,
            nome,
            salario), Autenticavel {
    
    override fun autentica(senha:Int): Boolean = this.senha == senha
    
}