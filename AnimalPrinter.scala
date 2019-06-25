package lab10

class AnimalPrinter extends Printer[Animal]{
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)

}
