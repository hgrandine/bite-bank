fun testeCriaContaWhile() {
    var i = 1
    while (i <= 5) {
        val titular = "Hugo $i"
        val numero = 1000 + i
        var saldo = 10.0 + i
        
        
        println("Titular $titular")
        println("Numero da conta $numero")
        println("Saldo da conta $saldo")
        i++
    }
}
