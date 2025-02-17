```scala
class MyClass(val value: Int) {
  def this(str: String) = this(str.toInt)
}

object Main extends App {
  val myInstance1 = new MyClass(10) 
  val myInstance2 = new MyClass("20")
  println(myInstance1.value) // 10
  println(myInstance2.value) // 20
  //Try this
  val myInstance3 = new MyClass("abc")
}
```