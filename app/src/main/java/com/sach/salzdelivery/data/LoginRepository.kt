package com.sach.salzdelivery.data

interface LoginRepository {
    fun gmailLogin():Boolean
    fun facebookLogin():Boolean
}