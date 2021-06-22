fun testaCriarConta() {
    var contaHugo = Conta("Hugo",1,)
    var contaAlex = Conta("Alex",2,)
    
    contaAlex.deposita(50.0)
    contaHugo.deposita(100.0)
    
    //contaAlex.saca(5.0)
    /*if(contaHugo.transfere(20.0, contaAlex)){
        println("sucesso na transfencia")
    }else{
        println("falha na transfencia")
    }
    */
    println("saldo final alex ${contaAlex.titular}, ${contaAlex.saldo}")
    println("saldo final hugo ${contaHugo.titular}, ${contaHugo.saldo}")
    
}