package org.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloWorldTest extends AnyFlatSpec with Matchers {

  "HelloWorld" should "greet properly" in {
    val greeter = new HelloWorld
    val greeting = greeter.greet("Scala")
    greeting should be ("Hello, Scala!")
  }
}
