package org.example

class Account {
    var acc_no: Int = 0
    var name: String? = null
    var amount: Float = 0f


    fun print() {
        println("Account -> $acc_no :: $name :: $amount")
    }

    fun print2() {
        println("Test Print 2")
    }

    fun deposit() {
        //deposite code
    }

    fun withdraw() {
        // withdraw code
    }

    fun checkBalance() {
        //balance check code
    }

}