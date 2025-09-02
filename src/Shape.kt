abstract class Shape (val name: String): Dimensionable {
    // moved name declaration to constructor for simplicity
    // this will force subclasses to implement, so an error is raised if some forgetful programmer forgets to implement
    abstract fun getArea(): Double
    abstract fun setDimensions()
}