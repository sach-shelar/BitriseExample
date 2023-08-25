package com.sach.salzdelivery.domain

import com.sach.salzdelivery.data.LoginRepository
import javax.inject.Inject
import kotlin.math.log

class FacebookLoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {

    fun facebookLogin(){
        loginRepository.facebookLogin()
    }
}