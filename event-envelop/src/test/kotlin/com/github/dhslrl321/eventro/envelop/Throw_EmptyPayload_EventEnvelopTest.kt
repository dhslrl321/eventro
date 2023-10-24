package com.github.dhslrl321.eventro.envelop

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

class Throw_EmptyPayload_EventEnvelopTest: StringSpec({
    "Event payload must exists" {
        shouldThrow<InsufficientEventEnvelopException> { EventEnvelop.builder<String>().build() }
    }

    "Event version must exists" {
        shouldThrow<InsufficientEventEnvelopException> { EventEnvelop.builder<String>().payload("hello world").build() }
    }

    "Event type must exists" {
        shouldThrow<InsufficientEventEnvelopException> { EventEnvelop.builder<String>().payload("hello world").eventVersion("0.1.0").build() }
    }
})
