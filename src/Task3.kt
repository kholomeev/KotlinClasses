import java.lang.NumberFormatException
import kotlin.math.pow
import kotlin.math.sqrt

fun task3() {
    println("Количество точек должно быть более, чем 2.")
    print("Введите количество точек: ")

    val pointCount: Int

    try {
        pointCount = readln().trim().toInt()
        if (pointCount <= 2) {
            println("Количество точек должно быть более, чем 2.")
            return
        }
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
        return
    }

    val listPoint: MutableList<Point> = mutableListOf()
    val listDistance: MutableList<Double> = mutableListOf()

    for (i in 1..pointCount) {
        try {
            print("Введите координату X точки $i: ")
            val x = readln().toDouble()
            print("Введите координату Y точки $i: ")
            val y = readln().toDouble()

            val dot = Point(x, y)
            listPoint.add(dot)

            println()
        } catch (e: NumberFormatException) {
            println("Обнаружено значение, не являющееся числом.")
            println(e.message)
            return
        }
    }
    println()

    for (i in 1 until pointCount) {
        val x = (listPoint[i].x - listPoint[0].x).pow(2)
        val y = (listPoint[i].y - listPoint[0].y).pow(2)
        val distance = sqrt(x + y)
        listDistance.add(distance)
        println("Расстояние между ${listPoint[0].pointInfo()} и ${listPoint[i].pointInfo()} равно $distance")
    }
    println()

    println("Минимальное расстояние между точками: ${listDistance.min()}")
    println("Максимальное расстояние между точками: ${listDistance.max()}")
}
