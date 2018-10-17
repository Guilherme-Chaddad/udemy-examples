package examples

fun main(args: Array<String>) {
	val timesTwo: (Int) -> Int = {x: Int -> x*2}
	
	val add = {x: Int, y: Int -> x+y}
	
	val list = (1..50).toList()
	
	println(list.filter({element -> element % 2 == 0}))
	
	println(list.filter({it % 2 == 0}))
	
	println( list.filter {it.even()} )
	
	println(list.filter({it.even()}))
	
	println(list.filter(::isEven))
}

fun Int.even() = this % 2 == 0

fun isEven(i: Int) = i % 2 == 0