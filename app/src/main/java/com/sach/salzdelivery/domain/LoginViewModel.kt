package com.sach.salzdelivery.domain

import androidx.lifecycle.ViewModel
import com.sach.salzdelivery.data.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val gmailLoginUseCase: GmailLoginUseCase,
    private val facebookLoginUseCase: FacebookLoginUseCase
) : ViewModel() {

    fun clickGmailLogin() {
        gmailLoginUseCase.gmailLogin()
    }

    fun clickFacebookLogin() {
        facebookLoginUseCase.facebookLogin()
    }


}