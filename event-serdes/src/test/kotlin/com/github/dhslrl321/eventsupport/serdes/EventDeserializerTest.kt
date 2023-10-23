package com.github.dhslrl321.eventsupport.serdes

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class EventDeserializerTest : StringSpec({
    "serialize to json" {
        val actual = EventDeserializer.deserialize<Foo>("{\"name\":\"jang\",\"age\":10,\"props\":{\"address\":\"seoul\"}}")

        actual shouldBe Foo("jang", 10, mapOf("address" to "seoul"))
    }
})

data class Foo(
    val name: String,
    private val age: Int,
    private val props: Map<String, String>
)
