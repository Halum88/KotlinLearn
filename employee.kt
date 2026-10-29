
class Employee(
    val surname: String,
    val name: String,
    val patronymic: String,
    val position: String,
    val email: String,
    val phone: String,
    val salary: Int,
    val age: Int
) {

    constructor(
        surname: String,
        name: String,
        patronymic: String,
        position: String,
        email: String,
        phone: String,
        age: Int
    ) : this(surname, name, patronymic, position, email, phone, 0, age)


    fun printInfo() {
        println("ФИО: $surname $name $patronymic")
        println("Дол жность: $position")
        println("Email: $email")
        println("Телефон: $phone")
        println("Зарплата: $salary руб.")
        println("Возраст: $age лет")
        println()
    }
}