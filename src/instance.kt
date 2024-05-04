fun main() {
//    var yujin: Idol = Idol("안유진",22,"아이브")
//    println(yujin.name)
//    println(yujin.age)
//    yujin.name = "유진"
//    yujin.age = 23
//    println(yujin.name)
//    println(yujin.age)
//    yujin.introduce()
//    println(yujin.hobby)
//    yujin.hobby = "독서"
//    println(yujin.hobby)
//    println(yujin.toString())
    var yujin : Idol1 = Idol1("안유진",22,"아이브")
    var yujin2 : Idol1 = Idol1("안유진",22,"아이브")

    println(yujin.introduce())

}

open class Human(
    var name: String,
    var age: Int
) {
    open fun introduce() = print("안녕하세요. $name 입니다. 나이는 $age 입니다. ")

}

class Idol1(name: String, age: Int, var group: String) : Human(name,age) {
    override fun introduce() {
        super.introduce()
        println("그룹은 $group 입니다.")
    }
}

//data class hasdf(){}
// data 클래스는 클래스의 변수값이 모두 같을 시 같은 클래스라고 판명함

//class Idol(
//    var name : String,
//    var age : Int,
//    var group : String,
//){
//    var hobby : String = "soccer"
//        get() {
//            println("취미 : $field")
//            return field
//        }
////        private set
//
//    // 객체가 생성될때 실행
//    init {
//        println("Idol 객체가 생성되었습니다.")
//    }
//    fun introduce() : Unit {
//        println("안녕하세요! 저는 ${name}입니다.")
//    }
//}