package com.github.dhslrl321.eventsupport.envelop

import java.time.Instant

/**
 * Core object of event system
 *
 * It provides a consistent data standards for events
 * @param eventType should be past and use Postfix `xxEvent`
 * @param eventVersion should be semantic version
 *
 * @see EventEnvelopBuilder for create this object? then
 */
class EventEnvelop<T> internal constructor(
    val id: EventId<String> = EventId.uuidId(),
    val payload: T,
    val eventType: String,
    val eventVersion: String, // TODO semver
) {
    val occurredAt: Instant = Instant.now()

    companion object {
        inline fun <reified T> builder(): EventEnvelopBuilder<T> {
            return EventEnvelopBuilder()
        }
    }
}
