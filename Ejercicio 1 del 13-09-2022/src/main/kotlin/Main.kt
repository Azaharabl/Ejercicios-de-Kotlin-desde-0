

import java.util.logging.Logger

val LOG = Logger.getLogger("Log")

fun main() {

    val LOG = Logger.getLogger("Log")

    jugandoConLogs()

    println("entrada y salida de informacion!")
    
    getInt()
    
    calculadora()

    println("comprovando string no nula")
    
    funGetString()

    println("comprovando un DNI (9 numeros y 1 letra ninuscula)")

    confirmarDNI()

    println("comprovando un matricula (4numeros 3 letras )")

    confirmarMatricula()


}

fun confirmarMatricula() {

    if(funGetString().matches("[0-9]{4}[a-z]{3}".toRegex())) println(" es una matricula") else  println("no es una matricula")

    LOG.info("terminado fun matricula")
}

fun confirmarDNI() {

   var isDni = funGetString().matches("[0-9]{9}[a-z]{1}".toRegex())
   if(isDni) println(" es un dni") else  println("no es un dni")

    LOG.info("terminado fun DNI")

}

fun funGetString(): String {
    var s :String ?
    do {
        println("escrive a continuación")
        s = readLine()
    }while(s?.length==0)

    LOG.info("terminado fun getString")

    return s!!
}

fun calculadora() {
    println("multiplicamos dos numeros")
    var numeroUno = getInt()
    var numeroDos = getInt()
    LOG.info("multiplicando $numeroUno y $numeroDos")
    println("el resultado a la multiplicacion es: ${numeroUno*numeroDos}")
}

fun getInt():Int {


    var numero: Int?

    do {
        LOG.info("pidiendo numero")
        println("dime un numero")
        numero = readLine()?.toIntOrNull()

    } while (numero == null)

    LOG.info("numero obtenido es  $numero")

    return numero!!
}

fun jugandoConLogs(){

    println("Hello Azahara vamos a hacer logs ")

    for (i in 0..9) {
        LOG.warning("entrando en bucle  $i")
    }
    LOG.info("salimos del bucle")

}
