package com.kotlinexpertise.hibernatedemo

import com.kotlinexpertise.hibernatedemo.model.Address
import com.kotlinexpertise.hibernatedemo.model.Person
import com.kotlinexpertise.hibernatedemo.repository.PersonRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class HibernateDemoApplicationTests(@Autowired val repo: PersonRepository) {

    @Test
    fun `basic entity checks`() {
        val p = Person("Paul", Address("HelloStreet", "A-55", "Paris"))
        val hashCodeBefore = p.hashCode()
        val personSet = hashSetOf(p)
        repo.save(p)
        val hashCodeAfter = p.hashCode()
        assertThat(repo.findAll()).hasSize(1)
        assertThat(personSet).contains(p)
        assertThat(hashCodeAfter).isEqualTo(hashCodeBefore)
    }
}
