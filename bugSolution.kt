```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf<String, Int>( "a" to 1, "b" to 2, "c" to 3 )
    // Safe way to remove elements from map without concurrent modification issues
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map) {
        if (value % 2 == 0) {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1, c=3}

    //Alternative using toMutableList()
    val map2 = mutableMapOf<String, Int>( "a" to 1, "b" to 2, "c" to 3 )
    map2.entries.toMutableList().removeIf { it.value % 2 == 0 }
    println(map2)// Output: {a=1, c=3}

    val set = mutableSetOf<Int>(1,2,3,4,5)
    set.removeIf {it %2 == 0}
    println(set) //Output: [1,3,5]

}
```