abstract class ContaTransferivel(
        titular:String,
        numero: Int
):Conta(
    titular = titular,
    numero = numero
) {
    
    fun transfere(valor: Double, destino: ContaTransferivel): Boolean{
        if(saldo >= valor){
            this.saca(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }
}