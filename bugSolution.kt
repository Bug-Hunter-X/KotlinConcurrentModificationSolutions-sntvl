fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // Solution 1: Using an iterator
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]

    // Solution 2: Using list.removeAll
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1, 2]
    
    //Solution 3: Using a copy and creating a new list
    val list3 = mutableListOf(1,2,3,4,5)
    val newList = list3.filter { it <=2 }.toMutableList()
    println(newList) //Output: [1,2]
}