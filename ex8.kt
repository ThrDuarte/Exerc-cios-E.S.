fun main(args: Array<String>) {
println("Informe seu salário (por hora):")
val salh = readLine()!!.toInt()
println("Digite a sua horária mensal:")
val car = readLine()!!.toInt()

 val sal = salh x car

println("O seu salário é de: $sal")
}