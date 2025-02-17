```scala
class MyClass(val value: Int) {
  def this(str: String) = {
    try {
      this(str.toInt)
    } catch {
      case e: NumberFormatException =>
        println(s"Error: Invalid input string: "+ str)
        this(0) // Or handle the error as appropriate
    }
  }
}

object Main extends App {
  val myInstance1 = new MyClass(10) 
  val myInstance2 = new MyClass("20")
  println(myInstance1.value) // 10
  println(myInstance2.value) // 20
  val myInstance3 = new MyClass("abc") //Error: Invalid input string: abc
  println(myInstance3.value) // 0
}
```