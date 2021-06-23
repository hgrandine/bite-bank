class Analista  (
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome,
    cpf,
    salario
){
    override fun bonificacao():Double = super.bonificacao() + salario * 0.1
}