// Заданиу 
//Написать консольную игру “угадай число”. Рандомно генерируем число от 0 до 10. Пользователю дается 3 попытки угадать его. При каждой попытке компьютер должен сообщить, больше или меньше загаданное число. 
//После победы /проигрыша выводится запрос: “Повторить игру еще раз? 1 - да/0 - нет” (1 - повторить, 0 - нет)
//* Сделать несколько уровней сложности игры, например, диапазон значений от 0 до 100 и попыток 5-7 или кастомные настройки от пользователя (запрашиваем у него желаемый диапазон и количество попыток)


import java.util.Scanner
import kotlin.random.Random



fun main() {
    val scanner = Scanner(System.`in`)
    var playAgain = 1

    while (playAgain == 1) {
        println("Выберите уровень сложности:")
        println("1 - Легкий (число от 0 до 10, 3 попытки)")
        println("2 - Сложный (число от 0 до 100, 5 попыток)")
        print("Ваш выбор: ")

        val level = scanner.nextInt()

        val maxNumber: Int
        val attempts: Int

        if (level == 1) {
            maxNumber = 10
            attempts = 3
        } else {
            maxNumber = 100
            attempts = 5
        }

        val secretNumber = Random.nextInt(0, maxNumber + 1)
        var guessed = false

        println("Я загадал число от 0 до $maxNumber!")

        for (i in 1..attempts) {
            print("Попытка $i из $attempts. Введите число: ")
            val userNumber = scanner.nextInt()

            if (userNumber == secretNumber) {
                println("Поздравляю! Ты угадал число!")
                guessed = true
                break
            } else if (userNumber < secretNumber) {
                println("Загаданное число больше")
            } else {
                println("Загаданное число меньше")
            }
        }

        if (!guessed) {
            println("Ты проиграл! Загаданное число: $secretNumber")
        }

        println("Повторить игру еще раз? 1 - да / 0 - нет")
        playAgain = scanner.nextInt()
    }

    println("Спасибо за игру!")
}