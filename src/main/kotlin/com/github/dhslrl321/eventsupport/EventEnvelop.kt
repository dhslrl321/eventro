package com.github.dhslrl321.eventsupport

import java.time.Instant

/**
 * Core object of event system
 *
 * It provides a consistent data standards for events
 *
 * If you want to create this object? then
 * @see EventEnvelopBuilder
 */
class EventEnvelop<T> internal constructor(
    val id: EventId<String> = EventId.uuidId(),
    val payload: T,
) {
    val occurredAt: Instant = Instant.now()

    companion object {
        inline fun <reified T> builder(): EventEnvelopBuilder<T> {
            return EventEnvelopBuilder()
        }
    }
}
