fun main() {  
    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()    
    println(beyondTheWall.contentEquals(backFromTheWall))

    println('1' + "2" + 3)
    println("1" + '2' + 3)
    println("1" + 2 + '3')
    println('1' + 2 + "3")
}