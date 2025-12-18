import java.lang.NumberFormatException

fun task5() {
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

    triangle.CircleInTriangle()
}

// Окружность в треугольнике (обязательно использование класса Точка и класса Треугольник. Класс Окружность и другие классы - по желанию)
// Треугольник расположен на координатной плоскости и описан координатами своих вершин.
// Написать программу вычисляющую координаты центра вписанной в треугольник окружности и ее радиус.