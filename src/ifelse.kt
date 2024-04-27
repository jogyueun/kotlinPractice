fun main() {
    var num : Int = 11
    if (num == 1) {
        println("참")
    } else if(num > 1) {
        println("거짓")
    } else {
        println("몰라")
    }
    println("코드 로직")

    when (num) {
        10 -> {
            println("10")}
        9 -> {
            println("9")}
        8 -> {
            println("8")}
        7 -> {
            println("7")}
        6 -> {
            println("6")}
        5 -> {
            println("5")}
        else -> {
            println("없음")
        }
    }
}