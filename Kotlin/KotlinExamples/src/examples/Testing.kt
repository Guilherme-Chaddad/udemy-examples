package examples

fun main(args: Array<String>) {
	val string :String? = null
	
	for(i in 1..10){
		println(i)
	}
	
	println(string)
	
	when(string){
		"bla" -> print("bla")
		null -> print("null")
		else -> print(string)
	}
}