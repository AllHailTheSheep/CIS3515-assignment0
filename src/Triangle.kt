import kotlin.math.sqrt

class Triangle(name: String): Shape(name) {
    private var side_a: Double = 0.0
    private var side_b: Double = 0.0
    private var side_c: Double = 0.0

    override fun getArea(): Double {
        // sqrt(s(s-a)(s-b)(s-c))
        // s = 1/2 perimeter
        val s: Double = (side_a + side_b + side_c)/2
        val ret: Double = sqrt(s * (s - side_a) * (s - side_b) * (s - side_c))
        return ret
    }

    override fun setDimensions() {
        print("$name's side A: ")
        var t: Double? = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value, or a negative value was supplied. Enter a positive double for $name's side A: ")
            } else {
                side_a = t
            }
        }

        print("$name's side B: ")
        t = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value, or a negative value was supplied. Enter a positive double for $name's side B: ")
            } else {
                side_b = t
            }
        }

        print("$name's side C: ")
        t = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("Error: Not a double value, or a negative value was supplied. Enter a positive double for $name's side C: ")
            } else {
                side_c = t
            }
        }

        // not all triangles are possible, so double check it and reset values if needed.
        if (side_a + side_b <= side_c || side_a + side_c <= side_b || side_b + side_c <= side_a){
            println("ERROR: Triangle is not valid! Sum of any two sides must be greater than the third side!")
            setDimensions()
        }
    }


    override fun printDimensions() {
        println("$name:\n\tSide A: %.2f\n\tSide B: %.2f\n\tSide C: %.2f\n\tArea: %.2f".format(side_a, side_b, side_c, getArea()))
    }

}