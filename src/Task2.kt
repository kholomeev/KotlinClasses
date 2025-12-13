import kotlin.math.sqrt
import kotlin.math.pow

fun task2() {
    try {
        print("Введите координату X первой точки: ")
        var x = readln().toDouble()
        print("Введите координату Y первой точки: ")
        var y = readln().toDouble()
        val dotOne = Point(x, y)

        println()

        print("Введите координату X второй точки: ")
        x = readln().toDouble()
        print("Введите координату Y второй точки: ")
        y = readln().toDouble()
        val dotTwo = Point(x, y)

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
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
    }
}