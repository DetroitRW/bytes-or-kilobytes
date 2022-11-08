import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var n = reader.nextDouble()

    print("Перевести в байты(b) или килобайты(k): ")
    val c = reader.next()

    when (c) {
        "b" -> n *= 1024
        "k" -> n /= 1024
    }

    print(n)
}