fun task1() {
    try {
        print("Введите координату X точки 1: ")
        var x = readln().toDouble()
        print("Введите координату Y точки 1: ")
        var y = readln().toDouble()
        val d1 = Point(x, y)

        println()

        print("Введите координату X точки 2: ")
        x = readln().toDouble()
        print("Введите координату Y точки 2: ")
        y = readln().toDouble()
        val d2 = Point(x, y)

        println()

        print("Введите координату X точки 3: ")
        x = readln().toDouble()
        print("Введите координату Y точки 3: ")
        y = readln().toDouble()
        val d3 = Point(x, y)

        val tri = Triangle(d1, d2, d3)
        tri.triangleInfo()

        print("Введите координату X данной точки: ")
        x = readln().toDouble()
        print("Введите координату Y данной точки: ")
        y = readln().toDouble()
        val dp = Point(x, y)

        println()

        println("Проверка нахождения точки в треугольнике...")
        isTheDotInTriangle(tri, dp)
    }
    catch (e: NumberFormatException) {
        println("Обнаружено значение, не являющееся числом.")
        println(e.message)
    }

}

fun isTheDotInTriangle(triangle: Triangle, dPoint: Point) {
    // Вычисление векторов
    /// (1, 1) - (0, 3) = (1, -2)
    val OA_x = triangle.dot1.x - dPoint.x
    val OA_y = triangle.dot1.y - dPoint.y
    /// (-4, 2) - (0, 3) = (-4, -1)
    val OB_x = triangle.dot2.x - dPoint.x
    val OB_y = triangle.dot2.y - dPoint.y
    /// (0, 4) - (0, 3) = (0, 1)
    val OC_x = triangle.dot3.x - dPoint.x
    val OC_y = triangle.dot3.y - dPoint.y

    // Векторные произведения
    /// 0A * OB = 1 * (-1) - (-4) * (-2) = -1 - 8 = -9
    /// [  i   j ]
    /// [  1  -2 ]
    /// [ -4  -1 ]
    val vectMul1 = OA_x * OB_y - OB_x * OA_y

    /// 0B * 0C = (-4) * 1 + 0 * (-1) = -4
    /// [  i   j ]
    /// [ -4  -1 ]
    /// [  0   1 ]
    val vectMul2 = OB_x * OC_y - OC_x * OB_y

    /// 0C * 0A = 0 * (-2) - 1 * 1 = 0 - 1 = -1
    /// [  i   j ]
    /// [  0   1 ]
    /// [  1  -2 ]
    val vectMul3 = OC_x * OA_y - OA_x * OC_y

    // Проверка (если результаты всех произведений будут иметь одинаковые знаки (все больше/меньше нуля, то точка в треугольнике)
    if (vectMul1 > 0 && vectMul2 > 0 && vectMul3 > 0) {
        println("Точка находится внутри треугольника")
    }
    else if (vectMul1 < 0 && vectMul2 < 0 && vectMul3 < 0) {
        println("Точка находится внутри треугольника")
    }
    else if (vectMul1 == 0.0 || vectMul2 == 0.0 || vectMul3 == 0.0) {
        println("Точка находится на одной из сторон треугольника")
    }
    else {
        println("Точка находится вне треугольника")
    }
}