package com.github.dhslrl321.eventro.envelop

import com.github.dhslrl321.eventro.serdes.MessageDeserializer
import com.github.dhslrl321.eventro.serdes.MessageSerializer
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
data class EventEnvelop<T> internal constructor(
    val id: EventId<String> = EventId.uuidId(),
    val payload: T,
    val eventType: String,
    val eventVersion: String, // TODO semver
) {
    val occurredAt: Instant = Instant.now()

    fun wrap(): String {
        return MessageSerializer.serialize(this)
    }

    companion object {
        inline fun <reified T> builder(): EventEnvelopBuilder<T> {
            return EventEnvelopBuilder()
        }

        inline fun <reified T> unwrap(wrapped: String): EventEnvelop<T> {
            return MessageDeserializer.deserialize<EventEnvelop<T>>(wrapped)
        }
    }
}
