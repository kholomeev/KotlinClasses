import kotlin.math.sqrt

class Triangle(var dot1: Point, var dot2: Point, var dot3: Point) {
    fun triangleInfo() {
        println()
        println("Треугольник:")
        println("Точка 1: ${dot1.x}, ${dot1.y}")
        println("Точка 2: ${dot2.x}, ${dot2.y}")
        println("Точка 3: ${dot3.x}, ${dot3.y}")
        println()
    }
    
    fun TriangleInCircle() {
        val a = (dot1.x*dot1.x + dot1.y*dot1.y)
        val b = (dot2.x*dot2.x + dot2.y*dot2.y)
        val c = (dot3.x*dot3.x + dot3.y*dot3.y)

        val Cx = (a * (dot2.y - dot3.y) + b * (dot3.y - dot1.y) + c * (dot1.y - dot2.y)) / (2 * (dot1.x * (dot2.y - dot3.y) + dot2.x * (dot3.y - dot1.y) + dot3.x * (dot1.y - dot2.y)))
        val Cy = (a * (dot3.x - dot2.x) + b * (dot1.x - dot3.x) + c * (dot2.x - dot1.x)) / (2 * (dot1.x * (dot2.y - dot3.y) + dot2.x * (dot3.y - dot1.y) + dot3.x * (dot1.y - dot2.y)))

        println("Центр описанной окружности в треугольник: (${Cx}, ${Cy})")
    }

    fun CircleInTriangle() {
        val a = sqrt((dot3.x - dot2.x)*(dot3.x - dot2.x) + (dot3.y - dot2.y)*(dot3.y - dot2.y))
        val b = sqrt((dot3.x - dot1.x)*(dot3.x - dot1.x) + (dot3.y - dot1.y)*(dot3.y - dot1.y))
        val c = sqrt((dot2.x - dot1.x)*(dot2.x - dot1.x) + (dot2.y - dot1.y)*(dot2.y - dot1.y))

        val Cx = (a * dot1.x + b * dot2.x + c * dot3.x) / (a + b + c)
        val Cy = (a * dot1.y + b * dot2.y + c * dot3.y) / (a + b + c)

        println("Центр вписанной окружности в треугольник: (${Cx}, ${Cy})")
    }
}