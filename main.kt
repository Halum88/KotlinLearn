
data class Box<A, B, C>(
    val first: A,
    val second: B,
    val third: C
)

fun main() {
    val box1 = Box("Книга", 12, 2.5f)
    val box2 = Box("Телефон", 20, 3.5f)
    val box3 = Box("Ноутбук", 35, 4.0f)

    val sum = box1.second + box1.third + box2.second + box2.third + box3.second + box3.third

    println("Сумма всех чисел: $sum")
}