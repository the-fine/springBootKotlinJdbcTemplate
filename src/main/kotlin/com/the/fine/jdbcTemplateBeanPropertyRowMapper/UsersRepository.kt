package com.the.fine.jdbcTemplateBeanPropertyRowMapper

import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository



/**
 * Created by the.fine on 06/07/2017.
 */
@Repository
class UsersRepository(var jdbcTemplate: JdbcTemplate) {

    fun getById(id:Long) = jdbcTemplate.queryForObject("select * from \"users\" where \"id\" = ?", arrayOf(id), BeanPropertyRowMapper.newInstance(User::class.java))

}