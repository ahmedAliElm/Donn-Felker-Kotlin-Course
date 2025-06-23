fun main() {

    println()

//    val name = "Ali"
//    println(name.isEmpty())
//
//    println(name)



//    var price: Long = 1_000_000
//    println(price + 1_000_000)



//    var myName = "Ali ELM"
//    myName = myName.lowercase()
//    println(myName)



//    var message1 = "Hello,\nMy name is Ali,\nHow are you?"
//    println(message1)

//    var message2 = """
//        Hello,
//        My name is Ali,
//        How are you?
//    """.trimIndent()
//
//    println(message2)



    // Referential Equality

//    var a = 12
//    var b = 12
//
//    println(a === b)



    // Single Line Expressions

//    var age = 55
//
//    fun sayHi() = if(age < 80) println("Accepted") else println("Rejected")
//
//    sayHi()



    // Named Parameters

//    fun printUserInfo(name: String, age: Int, likesMovies: Boolean) {
//        println("$name is $age years old. Does he/she like movies: $likesMovies")
//    }
//
//    printUserInfo(
//        name = "Ali",
//        age = 22,
//        likesMovies = true
//    )



    // Multiple arguments of the same type

//    fun bookInfo(name: String, year: Int, vararg authors: String) {
//
//        println("Name: $name, Year: $year")
//        print("Authors: ")
//        authors.forEach { print(it + "  ") }
//    }
//
//    bookInfo(
//        "Atomic Habits",
//        2010,
//        "Ali",
//        "Ahmed",
//        "Ayman"
//    )



    // OOP

//    var user1 = User(firstName = "Ahmed", lastName = "Ali")

//    user1.printFullName()

//    println(user1.fullName)
//
//    var user2 = User(firstName = "Ahmed")
//
//    println(user2.fullName)

//    user2.printFullName()



    println(AccountType.valueOf("GOLD"))

    println(AccountType.GOLD.discount)

}

enum class AccountType (var discount: Int, var numberOfSubscriptions: Int) {
    BRONZE(discount = 10, numberOfSubscriptions = 1),
    SILVER(discount = 20, numberOfSubscriptions = 5),
    GOLD(discount = 30, numberOfSubscriptions = 10),
    PLATINUM(discount = 40, numberOfSubscriptions = 20)
}


















