fun main() {
    var abc : Idol = Idol("안유진",23)
    abc.sayHello()
    abc.introduce()

}

interface ImplementIdol{
    fun introduce(): Unit

    fun sayHello(): Unit
}

class Idol(
    var name: String,
    var age: Int
) : ImplementIdol{
    override fun introduce(): Unit {
        println("이름은 ${name}입니다. 나이는 ${age}살 입니다.")
    }

    override fun sayHello(): Unit {
        println("안녕하세요.")
    }
}