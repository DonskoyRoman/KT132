package ru.netology

fun main() {
    val money = 350.0
    val visamirResult = calculateVisaMirAmount(money)
    val mmResult = calculateMastercardMaestroTax(money)
    val vkpayResult = money

    println("$visamirResult \n$mmResult \n$vkpayResult")
}

fun calculateMastercardMaestroTax(money: Double): Double {
    return when {
        money <= 300.0 -> money * 1.006 + 20
        money > 75000.0 -> money * 1.006 + 20
        else -> money
    }
}

fun calculateVisaMirAmount(money: Double): Double {
    val minTax = 35.0
    val trans = money
    val commissionRate = 0.0075
    var commission = trans * commissionRate

    if (commission < minTax) {
        commission = minTax
    }

    val amount = trans - commission
    return amount
}
//https://github.com/netology-code/kt-homeworks/tree/master/03_control

/**
 * package ru.netology
 *
 * fun main() {
 *     val money = 100.0
 *     val visamirResult = calculateVisaMirAmount(money)
 *     val mmResult = calculateMastercardMaestroTax(money)
 *     val vkapyResult = money
 *
 *     println("$visamirResult \n$mmResult \n$vkapyResult")
 * }
 *
 * /**
 *  * Вычисляет сумму транзакции с учетом комиссии для карт Visa/Mir.
 *  * @param money сумма транзакции
 *  * @return сумма транзакции с вычетом комиссии
 *  */
 * fun calculateVisaMirAmount(money: Double): Double {
 *     val minTax = 35.0
 *     val trans = money
 *     val commissionRate = 0.0075
 *     var commission = trans * commissionRate
 *
 *     if (commission < minTax) {
 *         commission = minTax
 *     }
 *
 *     val amount = trans - commission
 *     return amount
 * }
 *
 * /**
 *  * Вычисляет сумму транзакции с учетом комиссии для карт Mastercard/Maestro.
 *  * @param money сумма транзакции
 *  * @return сумма транзакции с вычетом комиссии
 *  */
 * fun calculateMastercardMaestroTax(money: Double): Double {
 *     return when {
 *         money <= 300.0 || money > 75000.0 -> money * 1.006 + 20
 *         else -> money
 *     }
 * }
 *
 */
