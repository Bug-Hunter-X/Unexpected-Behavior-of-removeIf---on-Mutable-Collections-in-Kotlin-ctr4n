# Unexpected Behavior of removeIf() on Mutable Collections in Kotlin

This repository demonstrates an uncommon, subtle bug related to the use of the `removeIf()` function on mutable collections in Kotlin.  While `removeIf()` generally works as expected, there are scenarios, particularly involving maps, where its behavior might be surprising if not handled carefully.

The `bug.kt` file showcases this behavior. The `removeIf` function, when used with maps, iterates through the map's entrySet.  Modifying the map during iteration leads to unexpected results or exceptions. 

The `bugSolution.kt` file offers solutions to mitigate this issue, highlighting the importance of creating a copy of the map before using `removeIf()` if modifications are expected during iteration or use of an iterator.
