package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  
  // Дальнейшее присвоение, например, `x = 2` приведёт к ошибке компиляции, потому что ключевым словом `val` обозначаются неизменяемые (immutables) объекты.

  // У `val`-объектов допускается не указывать тип явно. Компилятор способен выводить типы объектов исходя из их значений.

  val y = "Text."

  // Допускается использование разделителя `;` для записи нескольких выражений на одной строке.

  val z = 'L'; val o: Double = 2

  // Для явного задания типа числа после него добавляется соответствующая буква. Например, `L` - Long.

  val a: Long = 23423402340234L

  // Переменные. Могут использоваться для реализации побочных эффектов.

  var aVariable = 5

  // Нет ошибки при повторной присвоении.

  aVariable = 10
 
}
