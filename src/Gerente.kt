class Gerente  (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
){
    override fun bonificacao():Double = super.bonificacao() + salario
    
    fun autentica(senha:Int): Boolean = this.senha == senha
}