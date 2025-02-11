@file:JvmName("JDoodle")
fun main(args: Array<String>) {
  println("Digite um valor:")
  val numero1 = readLine()!!.toDouble() 
  println("Digite outro valor:")
  val numero2 = readLine()!!.toInt() 
  val total = numero1 + numero2
  println("O total da soma é igual a $total")
}