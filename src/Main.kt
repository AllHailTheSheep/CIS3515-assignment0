fun main() {
    val shapes: List<Shape> = listOf(
        Square("Square1"),
        Square("Square2"),
        Circle("Circle1"),
        Circle("Circle2"),
        Triangle("Triangle1"),
        Triangle("Triangle2"),
        EquilateralTriangle("EquilateralTriangle1"),
        EquilateralTriangle("EquilateralTriangle2")
    )
    for (shape in shapes) {
        shape.setDimensions()
        shape.printDimensions()
    }
}