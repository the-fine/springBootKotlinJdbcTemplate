# springBootKotlinJdbcTemplate
Spring boot app built with kotlin to reproduce a bug when using jdbcTemplate with BeanPropertyRowMapper to create a data class.
Run with ./gradlew bootRun
After started run curl localhost:8080/users/1
You will get the following exception No default constructor found; nested exception is java.lang.NoSuchMethodException: com.the.fine.jdbcTemplateBeanPropertyRowMapper.User.<init>()
