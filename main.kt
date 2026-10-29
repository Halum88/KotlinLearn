
fun main() {
    val library = mutableListOf<Book>()

    val book1 = Book("", "", 0.0).apply {
        title = "Чистый код"
        author = "Роберт Мартин"
        rating = 5.0
    }
    library.add(book1)

    val book2 = Book("", "", 0.0).apply {
        title = "Совершеенный код"
        author = "Стив Макконнелл"
        rating = 4.8
    }
    library.add(book2)

    val book3 = Book("", "", 0.0).apply {
        title = "Kotlin в действии"
        author = "Дмитрий Жемеров"
        rating = 4.9
    }
    library.add(book3)

    val book4 = Book("", "", 0.0).apply {
        title = "Изучаем Python"
        author = "Эрик Мэтиз"
        rating = 4.7
    }
    library.add(book4)

    library.find { it.title == "Совершенный код" }?.let {
        library.remove(it)
        println("Книга удалена: ${it.title}")
    }

    println("\nРезультаты поиска:")
    val searchResult = library.filter {
        it.title.contains("код", ignoreCase = true)
    }

    for (book in searchResult) {
        println("${book.title} — ${book.author}")
    }

    val foundBook = library.find {
        it.title == "Kotlin в действии"
    }

    println("\nНайденная книга:")
    if (foundBook != null) {
        println("${foundBook.title} — ${foundBook.author}")
    } else {
        println("Книга не найдена")
    }

    println("\nКаталог библиотеки:")
    library.run {
        for (book in this) {
            println("Название: ${book.title}")
            println("Автор: ${book.author}")
            println("Рейтинг: ${book.rating}")
            println()
        }
    }

    val averageRating = with(library) {
        if (isNotEmpty()) {
            sumOf { it.rating } / size
        } else {
            0.0
        }
    }

    println("Средний рейтинг книг: $averageRating")
}
