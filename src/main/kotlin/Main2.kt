import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {

    println()

    measure {
        val list = generateSequence(1) { it + 1 }
            .take(50_000_000)
            .toList()

        val result = list.filter { it % 3 == 0 }.average()

        println("Done")
        println(result)
    }
}

fun measure(block: () -> Unit) {

    val nanoTime = measureNanoTime(block)
    val milliseconds = TimeUnit.NANOSECONDS.toMillis(nanoTime)

    println("$milliseconds ms")
}

