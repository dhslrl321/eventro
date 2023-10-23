package com.github.dhslrl321.eventsupport.envelop

import java.util.*

/**
 * This is globally unique id for event streams
 *
 * used for identifying, idempotent key
 */
data class EventId<T>(
    val value: T
) {
    companion object {
        fun uuidId(): EventId<String> {
            return EventId(UUID.randomUUID().toString())
        }
    }
}
