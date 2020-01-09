package com.jason.example

object UnapplyExample {
  def main(args: Array[String]): Unit = {
    2010D match {
      case Money(a) => print(a)
      case _ => println("aa")
    }
  }
}


object Money {
  def apply(count: Double) = if (count == 200D) true else false

  //def unapply(arg: Money): Option[(Double, String)] = Some(2, "")
  def unapply(arg: Double): Some[Double] = Some(arg) //if (apply(arg)) Some(arg) else None
}