package OtherKotlin_example

// Concise syntax
// Interoperable with Java
// Multiplatform Dev -> KMP
// Null safety
// NullPointerException can be prevented
// Extension functions
// Named parameters and default parameters

fun main() {
    // var -> Mutable (Changeable)
    // val -> Immutable (Non-changeable)
    /*var language: String? = null
    language = "Kotlin"
    println("${language.length} is fun")
    println("${1+4}")*/

    /*var test = 1 // Type Inference
    test = "Kotlin" // Error*/

    /*var arr = arrayOf(1, 2, 3, "Kotlin") // Immutable
    println(arr[1])
    var a = intArrayOf(1, 2, 3, 4)*/

    /*var list = listOf(1, 2, 3, 4) // Immutable

    var mutableList = mutableListOf(1, 2, 3, 4) // Mutable

    mutableList.add(100)

    for (element in mutableList) {
        println(element)
    }

    for ((index, element) in mutableList.withIndex()) {
        println("$element is at $index index")
    }

    mutableList.forEach { number ->
        println(number)
    }

    mutableList.forEachIndexed { index, element ->
        println("$element is at $index index")
    }*/

    /*for (element in 1..20 step 2) {
        println(element)
    }

    for (element in 1 until 20) {
        println(element)
    }*/

    /*val number = Integer.valueOf(readLine().toString()) // toString() will convert from String? to String
    println(number*number)*/

    /*var a = 20

    var text = if (a > 20) {
        "Greater than 20"
    } else {
        "Equal or smaller than 20"
    }

    println(text)
*/

    // when (Switch-case)

    //val value = 20

    /*when (value) {
        10 -> println("Value is 10")
        20 -> println("Value is 20")
        else -> println("Something else")
    }*/

//    var text = when (value) {
//        10 -> "Value is 10"
//        20 -> "Value is 20"
//        else -> "Something else"
//    }
//
//    println("Let's print: $text")

    //println(sum(2, 5))

    /*val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "C++", 4 to "Python")

    for ((key, value) in map) {
        println("$key maps to $value")
    }*/

    // Null safety

    /*var language: String? = "Kotlin" // Can be set as null
    //language = null

    println(language?.length) // Safe call*/

    /*val text = "Kotlin"
    println(text.getFirstCharacter())
    println(text.getLength())*/

    //example("First Name", "Second Name", age = 21)

    /*var list = mutableListOf(1,2,3,4)
    test(list)
    list.forEach {
        println(it)
    }*/

    // Collections -> List, Map, Set

    // `Other+Kotlin_example`.Example of Stack
    /*var st: Stack<Int> = Stack()
    st.push(1)
    st.pop()*/

    /*val exampleSet = mutableSetOf(1, 2, 3, 4)
    exampleSet.add(5)
    exampleSet.add(1)

    for(element in exampleSet) {
        println(element)
    }*/

    /*val scan = Scanner(System.`in`)
    val number = scan.nextInt()
    println(number*number)*/

    /*repeat(10) { i ->
        println("Test $i")
    }*/

   /* var user = User("Test", 12)
    println(user.username)
    user.printName()

    var developer = Developer("Android")
    println(developer.username) // ExampleName12Android
    developer.printName()
    developer.onlyForDevelopers()
    developer.developAnApp()
    developer.test()*/

    //`Other+Kotlin_example`.Example.example()
    //`Other+Kotlin_example`.Example.username

    //val userData = UserData("TestName", 21)
    // Getters and setters

    // Java
    /*public String getName() {
        return name;
    }*/

    /*public String setName(String value) {
        name = value
    }*/

    //Author.name

    // var example = `Other+Kotlin_example`.Example("Test", 21)

    // Lambda function

    var lambdaExample = { name: String ->
        println("Testing")
        "The name is $name"
    }

    example(lambdaExample)

    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    list = list.map {
        it*it
    }

    list = list.filter {
        it % 2 == 0
    }

    list.forEach {
        println(it)
    }
}

// Higher order function
fun example(lambdaExample: (String) -> String) : (String) -> String {
    val text = lambdaExample("Name")
    println(text)

    return lambdaExample // `Other+Kotlin_example`.Example of returning a function
}

// Primary constructor, then init block, then secondary constructor
class Example(var name: String = "Default") {
    constructor(name: String, age: Int) : this(name) {
        println("Secondary constructor")
    }
    init {
        println(name)
    }
}

// API -> Returns data of users which has name and age
data class UserData(var name: String,
                    var age: Int)

// response -> UserData(response.name, response.age)

/*class `Other+Kotlin_example`.Example {
    companion object {
        fun example() {
            println("`Other+Kotlin_example`.Example")
        }

        var username = "test"
    }
}*/

// Access modifiers (Visibility modifiers): public, private, protected, internal

/*open class `Other+Kotlin_example`.Example {
    public var publicUsername = "Public"
    private var privateUsername = "Private"
    protected open var protectedUsername = "Protected"
}

class Example2 : `Other+Kotlin_example`.Example() {
    //override var protectedUsername: String = "Protected2"

    init {
        var example = Example2()
        example.publicUsername
        example.privateUsername // Will not work
        example.protectedUsername
    }
}*/

object Author {
    var name = "Test"
}

// Alt + Enter -> Quick fix menu

open class User(var name: String, var age: Int = 8) {
    open var username: String = name + age

    open fun printName() {
        println(name + "This is from the User class")
    }

    /*constructor(name: String) {
        println(name)
    }*/
    /*constructor(name: String, age: Int) : this(name) {
        println("This is another constructor")
        println("$name and $age")
    }*/
}

interface DeveloperInterface {
    fun developAnApp()
    fun test() {
        println("From first")
    }
}

interface SecondInterface {
    fun test() {
        println("From second")
    }
}

// Interface is implemented (implements)
// Base class is inherited (extends)

class Developer(var skill: String): User("ExampleName", 12), DeveloperInterface, SecondInterface {
    override var username: String = name + age + skill

    override fun developAnApp() {
        println("Develop an app")
    }

    override fun test() {
        super<DeveloperInterface>.test()
        super<SecondInterface>.test()
        println("Developer")
    }

    override fun printName() {
        super.printName()
        println(name + "This is from the Developer class")
    }

    fun onlyForDevelopers() {
        println("This is for developers")
    }
    /*init {
        println(skill)
    }

    fun example() {
        println(skill)
    }*/
}

// fun getName() = println("Test")

/*fun test(a: MutableList<Int>) {
    a.add(1)
}*/

/*fun example(firstName: String, secondName: String, country: String = "India", age: Int) {
    println(firstName)
    println(secondName)
    println(country)
    println(age)
}*/

/*fun String.getFirstCharacter(): Char {
    return this[0]
}

fun String.getLength(): Int {
    return length
}*/

/*
fun sum(a: Int, b: Int): Int {
    return a+b
}*/
