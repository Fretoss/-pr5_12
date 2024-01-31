    import kotlin.math.pow
fun main () {
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        when {
                (a>b) -> a=a+1
                (b>a) -> b=b+1
                (a==b) -> a=a.pow(3)
        }
        println("$a,$b")
    }