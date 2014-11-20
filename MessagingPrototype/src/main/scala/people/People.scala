package people

/**
  * Created by justusadam on 19/11/14.
  */
object People {
  private val _people:Map[Int, Employee] = Map(
    1 -> new Manager("manager"),
    2 -> new Caterer(2, "Caterer"),
    3 -> new Employee(3, "Some guy")
  )

  def people = _people

  def get(key:Int) = people.get(key)
 }
