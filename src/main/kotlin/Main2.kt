package org.example


    fun main() {
        println("main2....")

        val account = Account().also { it.name = "Touraj Account" }.also { a -> a.acc_no = 777 }
        account.print()

        Account().also { it.name = "Oghle" }.also { a -> a.acc_no = 888 }.print()


    }
