package com.rebwon.user.domain

interface UserRepository {
    fun save(user: User)
    fun delete(user: User)
}
