package lab10

abstract class Printer[-A] {
  def print(value: A): Unit
}
