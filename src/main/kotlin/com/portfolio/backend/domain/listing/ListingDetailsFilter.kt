package com.portfolio.backend.domain.listing

import com.portfolio.backend.domain.unit.BuildingType
import com.portfolio.backend.domain.unit.FacingDirection
import java.math.BigDecimal
import java.time.LocalDate

enum class ListingSort { RECENT, PRICE_ASC, PRICE_DESC, AREA_ASC, AREA_DESC }
data class ListingDetailsFilter(
    val buildingType: BuildingType? = null, val direction: FacingDirection? = null,
    val minAreaSqm: BigDecimal? = null, val maxAreaSqm: BigDecimal? = null,
    val minRoomCount: Int? = null, val hasElevator: Boolean? = null, val hasParking: Boolean? = null,
    val petsAllowed: Boolean? = null, val furnished: Boolean? = null, val availableBy: LocalDate? = null
)
