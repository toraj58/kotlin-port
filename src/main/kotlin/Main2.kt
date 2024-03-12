package org.example


    fun main() {
        println("main2....")

        // Using also scope function
        val account = Account().also { it.name = "Touraj Account" }.also { a -> a.acc_no = 777 }
        account.print()

        Account().also { it.name = "Oghle" }.also { a -> a.acc_no = 888 }.print()

        // apply is just like also, but with an implicit this:
        Account().apply {
            name = "viny"
            amount = 500f
            acc_no = 123

        }.print()

        val teacher = Teacher()
            .id(1000)
            .name("Martha")
            .surname("Spector").print()


        val stringBuilder = StringBuilder()
        val numberOfCharacters = stringBuilder.let {
            it.append("This is a transformation function.")
            it.append("It takes a StringBuilder instance and returns the number of characters in the generated String")
            it.length
        }

        println("numberOfCharacters = $numberOfCharacters")

        val message: String? = "hello there!"

        val charactersInMessage = message?.let {
            "value was not null: $it"
        } ?: "value was null"

        println(charactersInMessage)

    //TIP Notice that we return a type R like let, making this a transformation function, but we take an implicit this, like apply.
    // The difference, while subtle, becomes apparent with an example.

        val message2 = StringBuilder()
        val numberOfCharacters2 = message2.run {
            append("test")
            append("test2")
            length
        }

        println("numberOfCharacters2 = $numberOfCharacters2")

        val numbers = mutableListOf("one", "two", "three")

        with(numbers) {
            println("'with' is called with argument $this")
            println("It contains $size elements")
        }

        val numbers2 = mutableListOf("one2", "two2", "three2")
        val firstAndLast = with(numbers2) {
            "> The first element is ${first()}," +
                    " > the last element is ${last()}"
        }
        println(firstAndLast)


        val user = User().also{ it.name = "too too"}

        with(user) {
            println(this.name)
            println(this.age)

        }

    }
