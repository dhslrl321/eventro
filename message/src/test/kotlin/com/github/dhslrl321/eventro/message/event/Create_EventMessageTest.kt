package com.github.dhslrl321.eventro.message.event

import com.github.dhslrl321.eventro.message.Fixtures
import com.github.dhslrl321.eventro.message.MessageType
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf

class Create_EventMessageTest : StringSpec({

    val sut = EventMessage(
        eventName = "UserCreatedEvent",
        data = Fixtures.UserCreatedEvent("123", "jang"),
        eventVersion = "0.1.0",
        source = "member"
    )

    val sut2 = EventMessageBuilder<Fixtures.UserCreatedEvent>()
        .data(Fixtures.UserCreatedEvent("123", "jang"))
        .eventName("UserCreatedEvent")
        .eventVersion("0.1.0")
        .source("member")
        .build()

    "property test" {
        sut.id shouldNotBe null
        sut.createdAt shouldNotBe null
        sut.type shouldBe MessageType.EVENT_MESSAGE

        sut.eventName shouldBe "UserCreatedEvent"
    }

    "generic type" {
        sut.data.shouldBeInstanceOf<Fixtures.UserCreatedEvent>()
    }
})

