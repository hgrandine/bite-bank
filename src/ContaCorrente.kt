class ContaCorrente(
    titular: String,
    numero: Int
):ContaTransferivel(titular, numero){
    override fun saca(valor:Double){
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            saldo -= valorComTaxa
        }
    }
}