class Square(name: String): Shape(name) {
    private var length: Double = 0.0
    private var height: Double = 0.0
    fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }
    override fun getArea() = length * height
    override fun printDimensions() {
        println("Dimensions: $length x $height\nArea: ${getArea()}")
    }
}