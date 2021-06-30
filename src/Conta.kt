abstract class Conta(
        val titular:String,
        val numero: Int
) {
    var saldo = 0.0
        protected set
    
    fun deposita(valor:Double){
        println("depositando na conta do ${titular}")
        if(valor > 0 ) this.saldo += valor
        println("saldo de ${saldo}")
    }
    
    abstract fun saca(valor:Double)
    
    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            this.saca(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }
}