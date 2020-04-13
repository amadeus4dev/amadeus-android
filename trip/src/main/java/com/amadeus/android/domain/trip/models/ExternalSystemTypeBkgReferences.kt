/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Trip Parser
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.amadeus.android.domain.trip.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property owner Owner of the booking
 * @property number Reference number of the booking
 */
@JsonClass(generateAdapter = true)
data class ExternalSystemTypeBkgReferences(
    @Json(name = "owner") @field:Json(name = "owner") var owner: String? = null,
    @Json(name = "number") @field:Json(name = "number") var number: String? = null
)