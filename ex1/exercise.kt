package Exercises.KotlinExercises.ex1

fun main() {
    for(i in 1..100 step 2){
        if(i < 50){
            firstHalf(i)
        } else {
            secondHalf(i)
        }
    }
}

fun firstHalf(number: Int){
    println("The first steps: $number")
}

fun secondHalf(number: Int){
    println("Halfway there: $number")
}