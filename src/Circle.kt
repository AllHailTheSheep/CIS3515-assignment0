import kotlin.math.PI
import kotlin.math.pow
class Circle(name: String): Shape(name) {
    private var radius: Double = 0.0

    override fun setDimensions() {
        print("$name's radius: ")
        var t: Double? = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value or negative value. Enter a positive double for $name's radius: ")
            } else {
                radius = t
            }
        }
    }

    override fun getArea() = PI * radius.pow(2)

    override fun printDimensions() {
        println("$name:\n\tRadius: %.2f\n\tArea: %.2f".format(radius, getArea()))
    }
}