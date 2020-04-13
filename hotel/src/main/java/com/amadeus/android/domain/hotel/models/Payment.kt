/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Hotel Booking
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.hotel.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * form of payment (mandatory in case of `acceptedPayments`/`methods`)
 * @property id
 * @property method The Payment Methods:  * creditCard (CC) - Payment Cards in &#x60;creditCards&#x60; are accepted           
 * @property card
 */
@JsonClass(generateAdapter = true)
data class Payment(
    @Json(name = "method") @field:Json(name = "method") var method: Payment.MethodEnum,
    @Json(name = "id") @field:Json(name = "id") var id: Int? = null,
    @Json(name = "card") @field:Json(name = "card") var card: PaymentCard? = null
) {
    /**
     * The Payment Methods:  * creditCard (CC) - Payment Cards in `creditCards` are accepted           
     * Values: CREDITCARD
     */
    @JsonClass(generateAdapter = false)
    enum class MethodEnum(val value: String) {
        @Json(name = "creditCard") CREDITCARD("creditCard")
    }
}