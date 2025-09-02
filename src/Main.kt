fun main() {
    val shapes: List<Shape> = listOf(
        Square("Square1"),
        Square("Square2"),
        Circle("Circle1"),
        Circle("Circle2")
    )
    for (shape in shapes) {
        shape.setDimensions()
        shape.printDimensions()
    }
}