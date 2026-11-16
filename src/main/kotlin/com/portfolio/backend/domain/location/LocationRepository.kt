package com.portfolio.backend.domain.location

import org.springframework.data.jpa.repository.JpaRepository
interface LocationRepository : JpaRepository<VerifiedLocation, String>
