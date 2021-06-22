fun testeCriaContaFor() {
    
    for (i in 1..5) {
        val titular = "Hugo $i"
        val numero = 1000 + i
        var saldo = 10.0 + i
        
        
        println("Titular $titular")
        println("Numero da conta $numero")
        println("Saldo da conta $saldo")
    }
    
    for (i in 5 downTo 1) {
        val titular = "Hugo $i"
        val numero = 1000 + i
        var saldo = 10.0 + i
        
        
        println("Titular $titular")
        println("Numero da conta $numero")
        println("Saldo da conta $saldo")
    }
    
    for (i in 5..1 step 2) {
        val titular = "Hugo $i"
        val numero = 1000 + i
        var saldo = 10.0 + i
        
        
        println("Titular $titular")
        println("Numero da conta $numero")
        println("Saldo da conta $saldo")
    }
}
