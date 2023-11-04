package com.github.dhslrl321.eventro.message.event

import com.github.dhslrl321.eventro.message.Message
import com.github.dhslrl321.eventro.message.MessageId
import com.github.dhslrl321.eventro.message.MessageType
import java.time.Instant

/**
 * Command Message is trigger some behavior to the system
 *
 * @param eventName Representative name of event. Name format should be
 *  - (resource + past principal)Event
 *  - ex UserCreatedEvent, OrderCanceled
 * @param data Data payload of event
 * @param eventVersion version of the event, recommend semantic versioning
 * @param source Creator of event will be applied
 */
class EventMessage<T> internal constructor(
    val eventName: String,
    val data: T,
    val eventVersion: String,
    val source: String
) : Message {
    override val id: MessageId = MessageId.uuid()
    override val type: MessageType = MessageType.EVENT_MESSAGE
    override val createdAt: Instant = Instant.now()
}
