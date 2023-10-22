package com.github.dhslrl321.eventsupport

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

class Throw_EmptyPayload_EventEnvelopTest: StringSpec({
    "Event payload must be exists when using builder" {
        shouldThrow<EventPayloadNotExistException> { EventEnvelop.builder<String>().build() }
    }
})
