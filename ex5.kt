@file:JvmName("JDoodle")
fun main(args: Array<String>) {

  println("Digite os metros:")
  val metros = readLine()!!.toDouble() 
  val cm = metros/100
  
  println("o total é de $cm cm.")
}