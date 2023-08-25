package com.sach.salzdelivery.domain

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val facebookLoginUseCase: FacebookLoginUseCase) :
    ViewModel() {


        fun clickLogin(){
            facebookLoginUseCase.facebookLogin()
        }

}