package Exercises.KotlinExercises.ex5

fun main(){
    val valueList = listOf(10, 564, 23, 20, 9000, 34, 69, 90, 420, 777)
    valueList.filterSmaller(400).printValues()
}

fun List<Int>.filterSmaller(numFilt: Int): List<Int> {
    return this.filter{it < numFilt}
}

fun List<Int>.printValues(){
    forEach{println(it)}
}