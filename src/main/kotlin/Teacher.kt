package org.example

// Builder Style Object:
data class Teacher(var id: Int = 0, var name: String = "", var surname: String = "") {
    fun id(anId: Int): Teacher = apply { id = anId }
    fun name(aName: String): Teacher = apply { name = aName }
    fun surname(aSurname: String): Teacher = apply { surname = aSurname }

    fun print() {
        println("Teacher -> $id :: $name :: $surname ")
    }

    fun print2() {
        println("Teacher -> Print 2 ")
    }

    override fun toString(): String {
        return "Teacher(id=$id, name='$name', surname='$surname')"
    }


}
