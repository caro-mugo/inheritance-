fun main(){
    var car=Car("Mercedez","x42","red",10)
    car.carry(30)
    car.identity("purple","Toyota","X22")
    car.calculateParkingFees(10)
    var bus=Bus("Scania","X50","black",30)
    bus.calculateParkingFees(16)

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var y = people - capacity
        if (people == capacity) {
            println("Carrying $people passengers")
        } else {
            println("Carrying $y people")
        }
    }

    fun identity(color: String, make: String, model: String) {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var ParkingFees = 20 * hours
        println(ParkingFees)
        return ParkingFees

    }
}

   class Bus(make: String,model: String, color: String,capacity: Int):Car(make,model,color,capacity){
        fun maxTripFare(fare:Double):Double{
            var maxfare=fare*capacity
            println(maxfare)
            return maxfare
        }

        override fun calculateParkingFees(hours: Int): Int {
           // return super.calculateParkingFees(hours)
            var product=hours*capacity
            println(product)
            return (product)

        }

    }



