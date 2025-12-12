import java.lang.Math.pow
import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("Расстояние между точками")

    try {
        print("Введите координату X первой точки: ")
        var x = readln().toInt()
        print("Введите координату Y первой точки: ")
        var y = readln().toInt()
        val dotOne = Point(x,y)

        println()

        print("Введите координату X второй точки: ")
        x = readln().toInt()
        print("Введите координату Y второй точки: ")
        y = readln().toInt()
        val dotTwo = Point(x,y)

        println()

        println("Точки: (${dotOne.x},${dotOne.y}) (${dotTwo.x},${dotTwo.y})")
        //val distance = sqrt((dotTwo.x - dotOne.x).pow(2) + (dotTwo.y - dotOne.y).pow(2))
        //println("Расстояние равно $distance")
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
    }
}