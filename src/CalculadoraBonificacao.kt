class CalculadoraBonificacao {
    
    var total:Double = 0.0
    
    fun regitra(funcionario: Funcionario){
        total += funcionario.bonificacao()
    }
    
}