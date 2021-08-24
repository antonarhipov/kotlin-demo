package demo

class Demo(var state: Int)

fun main() {
    var d = Demo(1)

    d.run {
        state = 2
    }

    println(d.state)
}