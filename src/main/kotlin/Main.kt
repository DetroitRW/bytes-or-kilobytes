import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    val n = reader.nextDouble()

    print("Перевести в байты(b) или килобайты(k): ")
    val c = reader.next()
}