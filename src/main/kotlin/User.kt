class User (var firstName: String, var lastName: String) {

    var fullName: String = "$firstName $lastName"
        get() = "Full name: $field"

    lateinit var favoriteCity: String  // Has to be initialized before use

    constructor(firstName: String): this(firstName = firstName, lastName = "") {
        println("2nd")
    }

    fun printFullName() {
        println("$firstName  $lastName")
    }
}

