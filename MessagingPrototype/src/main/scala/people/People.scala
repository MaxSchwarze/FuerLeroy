package people

/**
  * Created by justusadam on 19/11/14.
  */
object People {
  private var _people:Map[Int, Employee] = Map(
    1 -> new Manager("Manager"),
    2 -> new Caterer(2, "Caterer"),
    3 -> new Employee(3, "Some guy"),
    4 -> new Office(4, "The Office")
  )

  def people = _people

  def get(key:Int) = people.get(key)

  def add(employee:Employee) = {
    _people = _people + ((employee.id, employee))
  }

  def new_id = {
    _people.keys.max + 1
  }
}
