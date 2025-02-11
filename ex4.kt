@file:JvmName("JDoodle")
fun main(args: Array<String>) {

  println("Digite a nota do bimestre1:")
  val numero1 = readLine()!!.toDouble() 
  println("Digite a nota do bimestre2:")
  val numero2 = readLine()!!.toInt() 
    println("Digite a nota do bimestre3:")
  val numero3 = readLine()!!.toInt() 
    println("Digite a nota do bimestre4:")
  val numero4 = readLine()!!.toInt() 
  
  val media = (numero1 + numero2 + numero3 + numero4)/4
  
  println("O total da soma é igual a $media")
}