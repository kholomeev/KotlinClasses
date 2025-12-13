import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("Расстояние между точками")

    try {
        print("Введите координату X первой точки: ")
        var x = readln().toDouble()
        print("Введите координату Y первой точки: ")
        var y = readln().toDouble()
        val dotOne = Point(x,y)

        println()

        print("Введите координату X второй точки: ")
        x = readln().toDouble()
        print("Введите координату Y второй точки: ")
        y = readln().toDouble()
        val dotTwo = Point(x,y)

        println()

        println("Точки: (${dotOne.x}, ${dotOne.y}); (${dotTwo.x}, ${dotTwo.y})")
        x = (dotTwo.x - dotOne.x).pow(2)
        y = (dotTwo.y - dotOne.y).pow(2)
        val distance = sqrt(x + y)
        println("Расстояние равно $distance")
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
    }
}