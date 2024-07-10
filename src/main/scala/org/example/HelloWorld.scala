package org.example

class HelloWorld {
  def greet(name: String): String = {
    s"Hello, $name!"
  }
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val greeter = new HelloWorld
    println(greeter.greet("World"))
  }
}