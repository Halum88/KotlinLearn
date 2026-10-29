// Задание 1. Создать переменные всех пройденных типов данных и инициализировать их значения.

fun main() {
    val a: Byte = 10
    val b: Short = 100
    val c: Int = 1000
    val d: Long = 10000L

    val e: Float = 3.14F
    val f: Double = 3.14159

    val g: Char = 'A'
    val h: String = "Hello"
    val i: Boolean = true

    val j: Number = 10
    val k: Any = "Hello"

}


// Задание 2. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

fun main() {
    sayHello("Полина")
}

fun sayHello(name: String) {
    println("Привет, $name!")
}


// Задание 3.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

fun main() {
    println(isNegative(-5))
    println(isNegative(10))
}

fun isNegative(number: Int): Boolean {
    return number < 0
}


// Задание 4. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.

fun main() {
    checkNumber(-5)
    checkNumber(10)
    checkNumber(0)
}

fun checkNumber(number: Int) {
    if (number > 0) {
        println("Число положительное")
    } else if (number < 0) {
        println("Число отрицательное")
    } else {
        println("Число равно нулю")
    }
}


// Задание 5. Написать метод, который выводит последовательность чисел от 1000 до 0, кратных 3
fun main() {
    printNumbers()
}

fun printNumbers() {
    for (i in 1000 downTo 0) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}