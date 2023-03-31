package Exercises.KotlinExercises.ex2

fun main() {

    // testing inheritance

    val fiatPunto = Car("FIAT", "Punto")
    fiatPunto.turnOn()
    fiatPunto.move()

    val lamboMiura = Supercar("Lamborghini", "Miura")

    lamboMiura.turnOn()
    lamboMiura.move()

    val teslaRoadster = ElectricCar("Tesla", "Roadster")

    teslaRoadster.turnOn()
    teslaRoadster.move()

    println("")

//testing interfaces

    val reyMyst = WrestlerFace("Rey Mysterio", 168, 79)

    reyMyst.info()
    reyMyst.description()

    val eddyGuer = WrestlerHeel("Eddy Guerrero", 173, 100)
    eddyGuer.info()
    eddyGuer.description()

}

//Override with inheritance

open class Car(val make: String, val model: String) {
    open fun turnOn(){
        println("The $make $model is on")
    }
    open fun move(){
        println("The $make $model is moving")
    }

}

class Supercar(make: String, model: String) : Car(make = make, model = model) {

    override fun move(){
        println("The $make $model is moving VERY fast")
    }
}

class ElectricCar (make: String, model: String): Car(make = make, model = model){

    override fun turnOn(){
        println("The $make $model is on, but you can't hear it")
    }
}

//override with interfaces

interface Wrestler {
    val name: String
    val height: Int
    val weight: Int
    fun info(){
        println("Coming in the ring, with ${weight}Kg of weight and standing at ${height}cm tall... $name!")
    }
    fun description() {
        println("$name is a wrestler")
    }
}

class WrestlerFace(override val name: String, override val height: Int, override val weight: Int) : Wrestler{
    override fun description() {
        println("$name is an honest wrestler that fights without cheating")
    }
}

class WrestlerHeel(override val name: String, override val height: Int, override val weight: Int) : Wrestler{
    override fun description() {
        println("$name is a dirty wrestler that cheats to win")
    }
}