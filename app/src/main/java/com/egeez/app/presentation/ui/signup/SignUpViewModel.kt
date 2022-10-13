package com.egeez.app.presentation.ui.signup

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egeez.app.domain.models.SignUpFormData
class SignUpFormViewModel : ViewModel() {

    private val _formData = MutableLiveData(SignUpFormData())
    val formData: LiveData<SignUpFormData>
        get() = _formData

    fun onClearClicked() {
        _formData.value = SignUpFormData()
    }



    fun onEmailChanged(email: String) {
        val isFormValid = _formData.value?.run {
            isFormValid(email, isValidEmail, username)
        } ?: false
        _formData.value = _formData.value?.copy(
            email = email,
            isValidEmail = validateEmail(email),
            isRegisterEnabled = isFormValid
        )
    }


    fun onUsernameChanged(username: String) {
        val isFormValid = _formData.value?.run {
            isFormValid(email, isValidEmail, username)
        } ?: false
        _formData.value = _formData.value?.copy(username = username, isRegisterEnabled = isFormValid)
    }

    private fun validateEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isFormValid(
        email: String,
        isValidEmail: Boolean,
        username: String
    ) =
        email.isNotEmpty() && isValidEmail && username.isNotEmpty()
}
