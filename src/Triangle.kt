class Triangle(var dot1: Point, var dot2: Point, var dot3: Point) {
    fun triangleInfo() {
        println()
        println("Треугольник:")
        println("Точка 1: ${dot1.x}, ${dot1.y}")
        println("Точка 2: ${dot2.x}, ${dot2.y}")
        println("Точка 3: ${dot3.x}, ${dot3.y}")
        println()
    }
}