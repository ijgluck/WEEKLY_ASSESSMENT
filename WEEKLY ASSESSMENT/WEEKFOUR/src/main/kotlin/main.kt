fun main() {
    println(evenlySpaced(2,4,6))
}

fun evenlySpaced(a:Int, b: Int, c: Int): Boolean{
    var num1:Int =a-b
    var num2: Int = b-c
    return num1 == num2
}