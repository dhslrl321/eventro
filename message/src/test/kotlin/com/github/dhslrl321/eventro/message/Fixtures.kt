package com.github.dhslrl321.eventro.message

import java.time.Instant

class Fixtures {
    class CreateUserDto(
        val id: String,
        val username: String
    )

    class UserCreatedEvent(
        val id: String,
        val username: String,
    )
}
