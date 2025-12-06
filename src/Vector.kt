class Vector(begin: Point, end: Point, coordX: Int = 0, coordY: Int = 0) {
    var begin = begin
    var end = end

    fun VectorCordsX() = end.x - begin.x
    fun VectorCordsY() = end.y - begin.y
}