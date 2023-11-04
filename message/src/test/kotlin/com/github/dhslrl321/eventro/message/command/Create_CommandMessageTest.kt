package com.github.dhslrl321.eventro.message.command

import com.github.dhslrl321.eventro.message.Fixtures
import com.github.dhslrl321.eventro.message.MessageType.COMMAND_MESSAGE
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf

class Create_CommandMessageTest:StringSpec({
    val sut = CommandMessage(
        commandName = "CreateUser",
        data = Fixtures.CreateUserDto("123", "wonik"),
        source = "member",
        target = "wallet"
    )

    "property test" {
        sut.id shouldNotBe null
        sut.createdAt shouldNotBe null
        sut.type shouldBe COMMAND_MESSAGE
    }

    "generic type" {
        sut.data.shouldBeInstanceOf<Fixtures.CreateUserDto>()
    }
})
