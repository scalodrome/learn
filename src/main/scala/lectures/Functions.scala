package lectures.part1basics

object Functions extends App {
  def aRepeatedFunction(s: String, n: Int): String =
    
    //В случае использования концевой рекурсии указание типа возвращаемого значения для функции обязательно. 
    if (n==1) s else s + aRepeatedFunction(s, n - 1)
}
