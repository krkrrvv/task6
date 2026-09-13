fun main() {
    print("Введите первую цифру: ")
    val dig1 = readln().toInt()
    print("Введите вторую цифру: ")
    val dig2 = readln().toInt()
    if (dig1 % 2 == 0 && dig2 % 2 == 0)
    {
        println("Создать нечетное число невозможно.")
    }
    else
    {
        if (dig1 % 2 != 0 && dig2 % 2 == 0)
        {
            println("Получившееся число: $dig2$dig1")
        }
        else if (dig2 % 2 != 0 && dig1 % 2 == 0)
        {
            println("Получившееся число: $dig1$dig2")
        }
        else
        {
            println("Получившиеся числа: $dig1$dig2, $dig2$dig1")
        }
    }
}