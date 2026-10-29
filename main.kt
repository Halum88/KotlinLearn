
fun main() {
    val employees = arrayOf(
        Employee("Петров", "Алексей", "Иванович", "Менеджер",
            "petrov@example.ru", "+7 (999) 123-45-67", 60000, 45),

        Employee("Иванова", "Мария", "Сергеевна", "Бухгалтер",
            "ivanova@example.ru", "+7 (999) 111-22-33", 55000, 38),

        Employee("Сидоров", "Иван", "Петрович", "Программист",
            "sidorov@example.ru", "+7 (999) 222-33-44", 100000, 42),

        Employee("Смирнова", "Анн", "Олеговна", "Дизайнер",
            "smirnova@example.ru", "+7 (999) 333-44-55", 29),

        Employee("Козлов", "Дмитрий", "Андреевич", "Стажер",
            "kozlov@example.ru", "+7 (999) 444-55-66", 22)
    )

    for (employee in employees) {
        if (employee.age > 40) {
            employee.printInfo()
        }
    }
}