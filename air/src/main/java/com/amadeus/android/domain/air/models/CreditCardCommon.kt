/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Flight Create Orders
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.air.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * credit card common attribute
 * @property brand
 * @property holder card holder as on the card
 * @property number card number
 * @property expiryDate credit card expiration date following [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) (YYYY-MM format, e.g. 2012-08)
 */
@JsonClass(generateAdapter = true)
data class CreditCardCommon(
    @Json(name = "brand") @field:Json(name = "brand") var brand: CreditCardBrand? = null,
    @Json(name = "holder") @field:Json(name = "holder") var holder: String? = null,
    @Json(name = "number") @field:Json(name = "number") var number: String? = null,
    @Json(name = "expiryDate") @field:Json(name = "expiryDate") var expiryDate: String? = null
)