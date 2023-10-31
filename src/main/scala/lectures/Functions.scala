package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {
  def aRepeatedFunction(s: String, n: Int): String = {

    //В случае использования концевой рекурсии указание типа возвращаемого значения для функции обязательно. 
    if (n == 1) s else s + aRepeatedFunction(s, n - 1)
  }

  def greetingFunction(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old."
  
  def factorialFunction(n: Int): Int = {
    if (n <= 0) n else n * factorialFunction(n - 1)
  }

  def fibonacciFunction(n: Int): Int = {
    if (n <= 2) 1 else fibonacciFunction(n - 1) + fibonacciFunction(n - 2)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
}
