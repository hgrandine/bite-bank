fun main() {
    println("Bem vindo ao Bytebank")
    
    val funcionario = Funcionario(
        "Hugo",
        "11111111",
        1000.0
    )
    
    val gerente = Gerente(
        "Fred",
        "11111111",
        1000.0,
        5555
    )
    
    val diretor = Diretor(
        "Cris",
        "11111111",
        1000.0,
        5555,
        200.0
    )
    
    println("Nome: ${funcionario.nome}, " +
            "cpf ${funcionario.cpf}, " +
            "salario ${funcionario.salario}, " +
            "bonificação ${funcionario.bonificacao()}" )
    
    println("Nome: ${gerente.nome}, " +
            "cpf ${gerente.cpf}, " +
            "salario ${gerente.salario}, " +
            "bonificação ${gerente.bonificacao()}" )
    
    println("Nome: ${diretor.nome}, " +
            "cpf ${diretor.cpf}, " +
            "salario ${diretor.salario}, " +
            "bonificação ${diretor.bonificacao()}" )
}