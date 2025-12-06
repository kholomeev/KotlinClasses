fun main() {
    val d1 = Point(1,1)
    val d2 = Point(-4,2)
    val d3 = Point(0,4)

    val tri = Triangle(d1, d2, d3)
    val dp = Point(0, 3)

    isTheDotInTriangle(tri, dp)
}

fun isTheDotInTriangle(triangle: Triangle, dPoint: Point) {
    // Вычисление векторов
    val zeroA = Vector(dPoint, triangle.dot1)  // (1, 1) - (0, 3) = (1, -2)
    zeroA.VectorCords()
    val zeroB = Vector(dPoint, triangle.dot2)  // (-4, 2) - (0, 3) = (-4, -1)
    zeroB.VectorCords()
    val zeroC = Vector(dPoint, triangle.dot3)  // (0, 4) - (0, 3) = (0, 1)
    zeroC.VectorCords()
    // Векторные произведения

    // 0A * OB = 1 * (-1) - (-4) * (-2) = -1 - 8 = -9
    // [  i   j ]
    // [  1  -2 ]
    // [ -4  -1 ]

    // 0B * 0C = (-4) * 1 + 0 * (-1) = -4
    // [  i   j ]
    // [ -4  -1 ]
    // [  0   1 ]

    // 0C * 0A = 0 * (-2) - 1 * 1 = 0 - 1 = -1
    // [  i   j ]
    // [  0   1 ]
    // [  1  -2 ]

    val vectMul1 = zeroA.begin * zeroA.end + zeroB.begin * zeroB.end
    val vectMul2 = zeroB.begin * zeroB.end + zeroC.begin * zeroC.end
    val vectMul3 = zeroC.begin * zeroC.end + zeroA.begin * zeroA.end

    // Проверка (если результаты всех произведений будут иметь одинаковые знаки (все больше/меньше нуля, то точка в треугольнике)
    if (vectMul1 > 0 && vectMul2 > 0 && vectMul3 > 0) {

    }
    else if (vectMul1 < 0 && vectMul2 < 0 && vectMul3 < 0) {

    } else if (vectMul1 == 0 || vectMul2 == 0 || vectMul3 == 0) {

    }
}