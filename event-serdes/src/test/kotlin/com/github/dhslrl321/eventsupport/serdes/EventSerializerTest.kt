package com.github.dhslrl321.eventsupport.serdes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class EventSerializerTest : StringSpec({
    "serialize to json" {
        val actual = EventSerializer.serialize(Foo("jang", 10, mapOf("address" to "seoul")))

        actual shouldBe
                """{"name":"jang","age":10,"props":{"address":"seoul"}}"""
    }

    "just serialize string" {
        val actual = EventSerializer.serialize("jang")

        actual shouldBe "\"jang\""
    }
})
