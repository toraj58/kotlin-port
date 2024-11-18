package org.example

fun main() {
    println("Main 4 ...")

    val entityList : List<Entity> = listOf(Entity(1, "e1"), Entity(2, "e2"), Entity(3, "e3"))
    val typeList : List<Type> = listOf(Type(1, "e1"), Type(2, "e2"), Type(3, "e3"))

//    val typeArray: Array<Type> = typeList.toTypedArray()
    val typeArray: Array<Type> = arrayOf(Type(1, "e1"), Type(2, "e2"), Type(3, "e3"))

    println(findMatch(entityList, typeList))
    println(findMatch2(entityList, typeList))

    //best version:
    println(findMatch3(entityList, typeList))

    println(findMatch4(entityList, typeArray))
}

private fun findMatch (
    entityList: List<Entity>,
    typeList: List<Type>
) : Boolean {
    for (entity in entityList) {
        val match = typeList.any { t -> t.name.equals(entity.name) }
        if (!match) {
            return false;
        }
    }
    return true
}

private fun findMatch2(
    entityList: List<Entity>,
    typeList: List<Type>
): Boolean {
    return entityList.all { entity ->
        typeList.any { type -> type.name == entity.name }
    }
}

private fun findMatch3(
    entityList: List<Entity>,
    typeList: List<Type>
): Boolean {
    // Check if both lists are the same size
    if (entityList.size != typeList.size) {
        return false
    }

    // Check if all entity names exist in the type list
    return entityList.all { entity ->
        typeList.any { type -> type.name == entity.name }
    }
}

private fun findMatch4(
    entityList: List<Entity>,
    typeList: Array<Type>
): Boolean {
    // Check if both lists are the same size
    if (entityList.size != typeList.size) {
        return false
    }

    // Check if all entity names exist in the type list
    return entityList.all { entity ->
        typeList.any { type -> type.name == entity.name }
    }
}



