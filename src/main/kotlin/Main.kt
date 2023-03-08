import kotlin.time.Duration.Companion.hours

fun main() {

    var car = Car("Subaru", "Impreza", "Blue",5)
    car.carry(7)
    car.carry(2)
    car.identity()
    println(car.calculateParkingFees(3))

    var bus = Bus("Benz", "Sprinter", "silver",45)
    bus.carry(30)
    bus.identity()
    println(bus.maxTripFare(1000.0))
    println(bus.calculateParkingFees(2))
}
open class Vehicles(var make: String, var model: String, var color: String, var capacity: Int) {

    fun carry(people: Int) {
        var x = people - capacity

        if (people <= (capacity)) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }

    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return (parkingFees)
    }


}
class Car( make: String,  model: String,  color: String,  capacity: Int): Vehicles(make, model, color, capacity){
}


class Bus( make: String,  model: String,  color: String,  capacity: Int, ): Vehicles(make, model, color, capacity){
    fun maxTripFare(fare: Double): Double {
        return fare*capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours.times(capacity)
    }
}







