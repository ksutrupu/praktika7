fun main(args: Array<String>){
    val exam: Fdgh = Fdgh("Математика", 10.0, 4.0)

    println("Дисциплина: "+ exam.discipline)
    println("Количество студентов: "+ exam.students)
    println("Время экзамена: "+ exam.time)
    println("Q = ${exam.q(10.0, 4.0)}")
    val meow: Meow = Meow(2.0, 0.0)
    println("Qp = ${meow.qp(2.0, 0.0)}")
}
