open class Conta(
        val titular:String,
        val numero: Int
) {
    var saldo = 0.0
        private set
    
    fun deposita(valor:Double){
        println("depositando na conta do ${titular}")
        if(valor > 0 ) this.saldo += valor
        println("saldo de ${saldo}")
    }
    
    open fun saca(valor:Double){
        println("sacando na conta do ${titular}")
        if(this.saldo >= valor){
            saldo -= valor
        }
        println("valor na conta do ${saldo}")
    }
    
    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            this.saca(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }
}