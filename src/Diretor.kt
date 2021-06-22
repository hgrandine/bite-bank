class Diretor  (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
){
    override fun bonificacao():Double = super.bonificacao() + salario + plr
    
    fun autentica(senha:Int): Boolean = this.senha == senha
}