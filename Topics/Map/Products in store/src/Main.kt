fun bill(priceList: Map<String, Int>, shoppingList: Array<String>): Int {
    var totalSum = 0
    for (product in shoppingList) {
        totalSum += priceList[product] ?: 0
    }
    return totalSum
}