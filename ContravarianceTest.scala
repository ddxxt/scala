package lab10

object ContravarianceTest extends App {
  val myCat: Cat = Cat("Tom")
  def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)
  }
  def printMyAnimal(printer: Printer[Animal]): Unit = {
    printer.print(myCat)
  }

  val catPrinter: Printer[Cat] = new CatPrinter
  val animalPrinter: Printer[Animal] = new AnimalPrinter

  printMyCat(catPrinter)
  printMyCat(animalPrinter)
}
