package com.github.dhslrl321.eventro.envelop

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.shouldBeInstanceOf

class EventEnvelopTest : StringSpec({

    val actual = EventEnvelop.builder<Foo>()
        .payload(Foo("A", "Hello"))
        .eventVersion("0.1.0")
        .eventType("FooEvent")
        .build()

    "must be same type and data of payload input" {
        actual.payload.shouldBeInstanceOf<Foo>()
        actual.payload shouldBe Foo("A", "Hello")
    }

    "event occur timestamp must be exists" {
        actual.occurredAt shouldNotBe null
    }

    "event unique id must be exists" {
        actual.id shouldNotBe null
    }

    "event has eventType" {
        actual.eventType shouldBe "FooEvent"
    }

    "event has version" {
        actual.eventVersion shouldBe "0.1.0"
    }
})

data class Foo(
    val id: String,
    val name: String,
)
