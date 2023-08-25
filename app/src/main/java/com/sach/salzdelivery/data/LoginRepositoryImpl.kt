package com.sach.salzdelivery.data

class LoginRepositoryImpl: LoginRepository {
    override fun gmailLogin(): Boolean {
       return true //api call
    }

    override fun facebookLogin(): Boolean {
        return false // api call
    }
}