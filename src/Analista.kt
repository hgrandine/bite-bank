class Analista  (
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome,
    cpf,
    salario
){
    override fun bonificacao():Double = salario * 0.1
}