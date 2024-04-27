fun main() {
    var myMap = mutableMapOf(
        "name" to "빵빵이",
        "age" to 24,
        "job" to "학생"
    )

    println(myMap)
    println(myMap["name"])
    myMap["name"] = "옥지"
    println(myMap["name"])
    myMap["age"] = 13
    println(myMap["age"])
}