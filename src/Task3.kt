import java.lang.NumberFormatException

fun task3() {
    print("Введите количество точек: ")

    try {
        val pointCount = readln().trim().toInt()

        val listPoint: MutableList<Point> = mutableListOf()
        for (i in 1..pointCount) {
            print("Введите координату X точки $i: ")
            val x = readln().toDouble()
            print("Введите координату Y точки $i: ")
            val y = readln().toDouble()

            val dot = Point(x, y)
            listPoint.add(dot)
        }

        for (dot in listPoint) {
            println("Точка: ${dot.pointInfo()}")
        }
    }
    catch (e: NumberFormatException) {
        println("Было введено не ")
    }
}

// Выбор наибольшего и наименьшего расстояний (обязательно использовать класс Точка)
// Множество точек расположено на координатной плоскости.
// Количество точек задается в консоли при запуске программы и оно должно быть больше двух. Каждая точка задается своими координатами.
// Точки не совпадают друг с другом. Требуется найти минимальное и максимальное расстояние между точками.
