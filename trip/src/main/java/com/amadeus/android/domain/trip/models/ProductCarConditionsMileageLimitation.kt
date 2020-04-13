/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property distance
 * @property unit
 */
@JsonClass(generateAdapter = true)
data class ProductCarConditionsMileageLimitation(
    @Json(name = "distance") @field:Json(name = "distance") var distance: Int? = null,
    @Json(name = "unit") @field:Json(name = "unit") var unit: ProductCarConditionsMileageLimitation.UnitEnum? = null
) {
    /**
     * Values: KM, ML
     */
    @JsonClass(generateAdapter = false)
    enum class UnitEnum(val value: String) {
        @Json(name = "KM") KM("KM"),
        @Json(name = "ML") ML("ML")
    }
}