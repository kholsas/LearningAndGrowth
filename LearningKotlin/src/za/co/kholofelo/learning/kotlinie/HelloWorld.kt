/**
 * @author Kholofelo Maloma
 * @since 2017/06/21.
 */
package za.co.kholofelo.learning.kotlinie

fun main(args: Array<String>) {

    val greetings = multiLanguageGreetings("EN", "Kholofelo Maloma");
    println(greetings)
    println("Mr. Maloma".extendedGreetings())
}

fun hello(name: String): String {
    return "Hello, " + name;
}

fun multiLanguageGreetings(language: String, name: String): String {
    return when (language) {
        "EN" -> "Hello, " + name
        "SEPEDI" -> "Thobela, mna " + name
        else -> "Ao, kgane bothata ke eng o sa bolele polelo ya bohle?"
    }
}

fun String.extendedGreetings(): String{
    return "Hello, $this"
}