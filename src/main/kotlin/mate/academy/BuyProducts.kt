package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val result = "$client has to pay $$price per $quantity products"
    return result
}
