import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {

    println()

//    measure {
//        val list = generateSequence(1) { it + 1 }
//            .take(50_000_000)
//            .toList()
//
//        val result = list.filter { it % 3 == 0 }.average()
//
//        println("Done")
//        println(result)
//    }


//    val name = "Ahmed Ali"
//
//    println(name.initials())


    //------------------------------------------------------


    // Lambda Expressions

    val greeter: (String, String) -> Unit = {
        firstName: String, lastName: String ->
        println("Hello $firstName $lastName")
    }

    greeter("Ahmed", "Ali")
}


//fun measure(block: () -> Unit) {
//
//    val nanoTime = measureNanoTime(block)
//    val milliseconds = TimeUnit.NANOSECONDS.toMillis(nanoTime)
//
//    println("$milliseconds ms")
//}

























