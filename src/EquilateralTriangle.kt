import kotlin.math.sqrt
import kotlin.math.pow

class EquilateralTriangle(name: String): Shape(name) {
    private var side: Double = 0.0

    override fun getArea(): Double {
        // sqrt(s(s-a)(s-b)(s-c))
        // s = 1/2 perimeter
        val s: Double = (side * 3)/2
        val ret: Double = sqrt(s * (s - side).pow(3))
        return ret
    }

    override fun setDimensions() {
        print("$name's side: ")
        var t: Double? = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value, or a negative value was supplied. Enter a positive double for $name's side: ")
            } else {
                side = t
            }
        }
    }

    override fun printDimensions() {
        println("$name:\n\tSide: %.2f\n\tArea: %.2f".format(side, getArea()))
    }
}