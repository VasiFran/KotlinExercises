package Exercises.KotlinExercises.ex4

fun main(){
    val list = listOf(1, 2 ,3)
    list.map{num -> num.toString()}.forEach{num -> println("Number $num")}
}