fun main() {

    println()

    print("Please enter an arithmetic problem: ")

    var userInput = readLine()

    while (userInput != null && userInput.isNotBlank()) {

        var values = userInput.split(' ')

        if (values.size < 3)
            println("Invalid input. Expected value + value. Received: $userInput")

        else {

            val firstNumber = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[0]}")

            val operator = values[1]

            val secondNumber = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[0]}")

            when (operator) {

                "+" -> println("Result: ${firstNumber + secondNumber}")

                "-" -> println("Result: ${firstNumber - secondNumber}")

                "*" -> println("Result: ${firstNumber * secondNumber}")

                "/" -> println("Result: ${firstNumber / secondNumber}")

                else -> throw IllegalArgumentException("Invalid operator: $operator")
            }
        }

        userInput = readLine()
    }

    println("Goodbye!")
}

