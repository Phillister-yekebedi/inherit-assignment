fun main() {
        var Benz= Car("mercedesBenz", "E-Class","grey",5)
        Benz.carry(8)
    Benz.carry(3)
    Benz.identity()
    println(Benz.calculateParkingFees(4))

    println(Benz.calculateParkingFees(6))
    println()





}


open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var z = people - capacity
        if (people <= capacity)
            println("carrying $z passengers")
        else {
            println("over capacity by $z passengers")
        }
    }
    fun identity(){
        println(" I am a $color $make $model")

    }
    open fun calculateParkingFees(hours: Int) :Int{
        var fees=hours*20
        return fees

    }

}
open class Bus(make: String, model: String,color: String,capacity: Int): Car(make,model,color,capacity) {
    fun maxTripFares(fare: Double): Double {
        var maxtripfare = fare * capacity
        return maxtripfare
    }

    fun calculateParking(hours: Int, capacity: Int): Int {
        var parkingfee = hours * capacity
        return parkingfee

    }
}