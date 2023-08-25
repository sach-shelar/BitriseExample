package com.sach.salzdelivery.domain

import com.sach.salzdelivery.data.LoginRepository
import javax.inject.Inject

class GmailLoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {

    fun gmailLogin(): Boolean {
        return loginRepository.gmailLogin()
    }

}