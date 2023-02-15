open class Sdsd (val vid: String, val kolvo: Double, val ball: Double) {
    fun q(kolvo: Double, balls: Double): Double {
        var q = (0.3 * kolvo) / (0.7 * balls)
        return q
    }
}