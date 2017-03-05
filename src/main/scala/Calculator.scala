object Calculator {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def add(a: Int): Int => Int = (b: Int) => a + b

  def multiply(a: Int, b: Int): Int = {
    a * b
  }

  def subtract(a: Int, b: Int): Int = {
    a - b
  }

  def abs(x: Int): Int = {
    if (x < 0) -x
    else x
  }

  def factorial(x: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x == 0) acc
      else loop(x - 1, x * acc)
    }
    loop(x, 1)
  }

//  def curry[A, B, C](f: (A, B) => C): A => (B => C) = (a: A, b: B) => f(a, b)

  def main(args: Array[String]): Unit = {
    println(factorial(3))
    println(factorial(4))
    println(add(4)(5))
  }
}
