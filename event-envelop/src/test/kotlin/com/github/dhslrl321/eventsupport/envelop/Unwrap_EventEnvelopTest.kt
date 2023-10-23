package com.github.dhslrl321.eventsupport.envelop

import io.kotest.core.spec.style.StringSpec

class Unwrap_EventEnvelopTest: StringSpec({
    "a" {
        val envelop = EventEnvelop.builder<Foo>()
            .payload(Foo("123", "jang wonik"))
            .eventType("FooEvent")
            .eventVersion("0.1.0")
            .build()

        val wrapped = envelop.wrap()

        println(wrapped)

        val unwrap = EventEnvelop.unwrap<Foo>(wrapped)

        println(unwrap)
    }

})
