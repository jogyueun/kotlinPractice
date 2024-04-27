fun main() {
//    var arr = listOf(1,2,3,4,5)
//    println(arr[0])

    var arr1 = mutableListOf(1, 2, 3, 4, 5)
    println(arr1[0])
    arr1[0] = 123
    println(arr1[0])
    arr1.add(3)
    println(arr1)
    arr1.addAll(3, listOf(1,2,3,4,5,6))
    println(arr1)
    arr1.clear()
    println(arr1)

}