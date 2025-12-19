import java.lang.NumberFormatException
import kotlin.math.pow

fun task4() {
    // Треугольник: (0, 2) (2, 0) (-1.5, -1.32)
    // Центр: (0, 0)
    // Радиус: 2
    // Окружность: x^2 + y^2 = r^2
    val triangle: Triangle
    val d1: Point
    val d2: Point
    val d3: Point

    var x: Double
    var y: Double

    try {
        print("Введите координату X точки (1/3): ")
        x = readln().toDouble()
        print("Введите координату Y точки (1/3): ")
        y = readln().toDouble()
        d1 = Point(x,y)

        println()

        print("Введите координату X точки (2/3): ")
        x = readln().toDouble()
        print("Введите координату Y точки (2/3): ")
        y = readln().toDouble()
        d2 = Point(x,y)

        println()

        print("Введите координату X точки (3/3): ")
        x = readln().toDouble()
        print("Введите координату Y точки (3/3): ")
        y = readln().toDouble()
        d3 = Point(x,y)

        println()
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
        return
    }

    triangle = Triangle(d1,d2,d3)
    triangle.triangleInfo()

    triangle.TriangleInCircle()
    println("Радиус описанной окружности: ${triangle.OutlineCircleRadius()}")
}