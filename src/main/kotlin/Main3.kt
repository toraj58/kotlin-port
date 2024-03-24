package org.example

fun main() {
    println("MAIN 3")

    val l1 = mutableListOf(1, 2, 7, 6, 5, 6)
    l1.sort()
    println(l1)

    val v = mutableListOf(1 to "a", 2 to "b", 7 to "c", 6 to "d", 5 to "c", 6 to "e")
    v.sortBy { it.second }
    println(v)

    val pair = v.get(0)
    println("pair: ${pair.first} :: ${pair.second}")

    val l2 = mutableListOf(100, 200, 700, 600, 500, 600)
    l2.sort()
    println(l2)

    l1.addAll(l2)

    println(l1)
    println(l2)

    val l3 = mutableListOf(1 to "a", 2 to "b", 7 to "c", 6 to "d", 5 to "c", 6 to "e")
    l3.sortWith(compareBy({it.second}, {it.first}))
    // And the result of the above code is that they are sorted by letter and then by number:
    println(l3)

    val l4 = mutableListOf(1 to "a", 2 to "b", 7 to "c", 6 to "d", 5 to "c", 6 to "e")
    l4.sortWith(compareBy<Pair<Int, String>>({it.second}, {it.first}).reversed())
    // Reverse Order Sort using reversed method
    println(l4)


}