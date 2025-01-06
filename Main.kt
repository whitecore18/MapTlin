// Data
data class Person(val name: String, val age: Int, val position: String)

// funArrCount
fun <K> countOccurrences(array: Array<K>): Map<K, Int> {
    return array.groupingBy { it }.eachCount()
}

// funDel
fun removeByValue(map: MutableMap<Int, String>, value: String) {
    map.entries.removeIf { it.value == value }
}

fun main() {
    // task1
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    val occurrences = countOccurrences(array)
    println("Количество вхождений: $occurrences")

    // task2
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
    println("Исходная коллекция: $people")
    removeByValue(people, "Петр")
    println("После удаления 'Петр': $people")

    // task3
    val personHashMap = hashMapOf<Int, Person>(
        1 to Person("Иван", 30, "Менеджер"),
        2 to Person("Петр", 25, "Разработчик"),
        3 to Person("Лида", 28, "Дизайнер")
    )
    
    println("Коллекция Person: $personHashMap")
}