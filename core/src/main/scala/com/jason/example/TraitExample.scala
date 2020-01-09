package com.jason.example

object TraitExample {
  def main(args: Array[String]): Unit = {
    val dog = new Dog with Speak
    dog.speak()
    val fun: (Int, Int) => Int = (x: Int, y: Int) => x + 1
    println(fun(3,4))
  }
}

class Dog

trait Speak {
  def speak(): Unit = {
    println("旺旺")
  }
}