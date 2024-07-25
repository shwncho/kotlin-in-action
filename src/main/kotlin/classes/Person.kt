package classes

class Person {
  var name: String = "Simple"
  var age: Int = 28
  var country: String = "South Korea"
  var height: Int = 150
  var weight: Int = 30

  fun sayHello() {
    println("Hi!")
  }

  fun introduce() {
    println("I'm $name and my age is $age.")
  }
}
