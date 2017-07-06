package com.the.fine.jdbcTemplateBeanPropertyRowMapper

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by the.fine on 06/07/2017.
 */
@RestController
@RequestMapping(path= arrayOf("/users"))
class UsersController(val usersRepository: UsersRepository) {

    @GetMapping(path = arrayOf("/{id}"))
    fun getUserById(@PathVariable id:Long): User = usersRepository.getById(id)
}