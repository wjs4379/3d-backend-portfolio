package com.portfolio.backend.common

import org.springframework.http.HttpStatus

class ApiException(
    val status: HttpStatus,
    val code: String,
    message: String
) : RuntimeException(message)
