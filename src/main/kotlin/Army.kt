fun main(args: Array<String>) {
    val sdsd: Sdsd = Sdsd("ВДВ", 50.0, 65.0)

    println("Вид войск: "+ sdsd.vid)
    println("Численность войск (тыс.): "+ sdsd.kolvo)
    println("Баллы (число): "+ sdsd.ball)
    println("Q = ${sdsd.q(10.0, 4.0)}")
    val ssss: Ssss = Ssss(6.0, 0.0)
    println("Qp = ${ssss.qp(2.0, 0.0)}")
}