import kotlin.math.sqrt
import kotlin.math.pow

fun task2() {
    val dotOne: Point
    val dotTwo: Point
    var x: Double
    var y: Double

    try {
        print("Введите координату X первой точки: ")
        x = readln().toDouble()
        print("Введите координату Y первой точки: ")
        y = readln().toDouble()
        dotOne = Point(x, y)

        println()

        print("Введите координату X второй точки: ")
        x = readln().toDouble()
        print("Введите координату Y второй точки: ")
        y = readln().toDouble()
        dotTwo = Point(x, y)
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
        return
    }

    println()

    println("""
        |Точка A: (${dotOne.x}, ${dotOne.y});
        |Точка B: (${dotTwo.x}, ${dotTwo.y});
    """.trimMargin())

    if (dotOne.x == dotOne.y && dotTwo.x == dotTwo.y)
        println("Точки совпадают")
    else {
        x = (dotTwo.x - dotOne.x).pow(2)
        y = (dotTwo.y - dotOne.y).pow(2)
        val distance = sqrt(x + y)
        println("Расстояние равно $distance")
    }

}