package com.github.dhslrl321.eventsupport.envelop

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Wrap_EventEnvelopTest : StringSpec({
    "possible to wrap" {
        val envelop = EventEnvelop.builder<Foo>()
            .payload(Foo("123", "jang wonik"))
            .eventType("FooEvent")
            .eventVersion("0.1.0")
            .build()

        val actual = envelop.wrap()

        actual shouldBe """
            {"id":{"value":"${envelop.id.value}"},"payload":{"id":"123","name":"jang wonik"},"eventType":"FooEvent","eventVersion":"0.1.0","occurredAt":"${envelop.occurredAt}"}
        """.trimIndent()
    }

})
