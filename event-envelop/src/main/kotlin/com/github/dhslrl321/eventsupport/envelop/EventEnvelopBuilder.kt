package com.github.dhslrl321.eventsupport.envelop

/**
 * Builder of EventEnvelop
 * This creates instance and build envelop state.
 *
 * @property id is not provided, use uuid by default
 */
class EventEnvelopBuilder<T> {
    private var id: EventId<String> = EventId.uuidId()
    private var payload: T? = null
    private var eventType: String? = null
    private var version: String? = null

    fun id(id: EventId<String>): EventEnvelopBuilder<T> {
        this.id = id
        return this
    }

    fun payload(payload: T): EventEnvelopBuilder<T> {
        this.payload = payload
        return this
    }

    fun eventType(eventType: String): EventEnvelopBuilder<T> {
        this.eventType = eventType
        return this
    }

    fun eventVersion(version: String): EventEnvelopBuilder<T> {
        this.version = version
        return this
    }

    fun build(): EventEnvelop<T> {
        require(payload != null) { throw InsufficientEventEnvelopException("EventEnvelop must have exists event payload") }
        require(eventType != null) { throw InsufficientEventEnvelopException("EventEnvelop must have exists event eventType") }
        require(version != null) { throw InsufficientEventEnvelopException("EventEnvelop must have exists event version") }

        return EventEnvelop(id, payload!!, eventType!!, version!!)
    }
}
