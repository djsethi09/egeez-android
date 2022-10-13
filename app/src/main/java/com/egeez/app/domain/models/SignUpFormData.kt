package com.egeez.app.domain.models

data class SignUpFormData(
    val email: String = "",
    val username: String = "",
    val isRegisterEnabled: Boolean = false,
    val isValidEmail: Boolean = false
)
