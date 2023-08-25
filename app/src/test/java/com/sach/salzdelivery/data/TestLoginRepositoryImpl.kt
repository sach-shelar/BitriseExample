package com.sach.salzdelivery.data

class TestLoginRepositoryImpl: LoginRepository {
    override fun gmailLogin(): Boolean {
         return true // json data.
    }

    override fun facebookLogin(): Boolean {
        return true // json data.
    }
}