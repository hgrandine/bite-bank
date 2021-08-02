fun testaConta() {
    val contaCorrente = ContaCorrente(titular = "hugo", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "ze", numero = 1001)
    val contaSalario = ContaSalario(titular = "iva", numero = 1002)
    
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)
    
    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")
    println("saldo conta salario: ${contaSalario.saldo}")
    
    
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)
    
    println("saldo pós saque conta corrente: ${contaCorrente.saldo}")
    println("saldo pós saque conta poupança: ${contaPoupanca.saldo}")
    println("saldo pós saque conta salario: ${contaSalario.saldo}")
    
    
    contaCorrente.transfere(200.0, contaPoupanca)
    
    println("saldo pós transferencia conta corrente: ${contaCorrente.saldo}")
    println("saldo pós transferencia conta poupança: ${contaPoupanca.saldo}")
    
    contaPoupanca.transfere(500.0, contaCorrente)
    
    println("saldo pós transferencia conta corrente: ${contaCorrente.saldo}")
    println("saldo pós transferencia conta poupança: ${contaPoupanca.saldo}")
}
