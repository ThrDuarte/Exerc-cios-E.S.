fun main(args: Array<String>) {
println("Informe a temperatura em graus Celsius:")
val C = readLine()!!.toInt()

 val temp = (C × 9/5) + 32

println("a temperatura em graus Fahrenheit é de: $temp")
}