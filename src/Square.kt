class Square(name: String): Shape(name) {
    private var length: Double = 0.0
    private var height: Double = 0.0

    override fun setDimensions() {
        print("$name's length: ")
        var t: Double? = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value or negative value. Enter a positive double for $name's length: ")
            } else {
                length = t
            }
        }
        print("$name's height: ")
        t = null
        while (t == null || t < 0.0) {
            val input = readln()
            t = input.toDoubleOrNull()
            if (t == null || t < 0.0) {
                print("ERROR: Not a double value or negative value. Enter a positive double for $name's height: ")
            } else {
                height = t
            }
        }
    }

    override fun getArea() = length * height

    override fun printDimensions() {
        println("$name:\n\tDimensions: %.2f x %.2f\n\tArea: %.2f".format(length, height, getArea()))
    }
}