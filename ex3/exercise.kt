package Exercises.KotlinExercises.ex3

sealed class User(open val id: String)

data class EMailUser(override val id: String, val password: String, val eMail: String): User(id)
data class FacebookUser(override val id: String, val password: String, val fullName: String): User(id)
data class GoogleUser(override val id: String, val password: String, val username: String): User(id)


fun userInfo(user: User): String {
    when (user){
        is EMailUser -> return "eMail user: ${user}"
        is FacebookUser -> return "Facebook user: ${user}"
        is GoogleUser -> return "Google user: ${user}"
    }
}

fun main(){
    val johnDoe = EMailUser("1111","trains74", "jdoe@domain.net")
    val marioRossi = FacebookUser("1532", "12121998", "Mario Rossi")
    val hugoGarcia = GoogleUser("1923", "dfjH43jsd2plJmtSgj3o0fjSJjfAwo", "elgordito")

    println(userInfo(johnDoe))
    println(userInfo(marioRossi))
    println(userInfo(hugoGarcia))
}