package com.github.dhslrl321.eventsupport

/**
 * Creator of EventEnvelop
 */
class EventEnvelopBuilder<T> {
    private var id: EventId<String> = EventId.uuidId()
    private var payload: T? = null

    fun id(id: EventId<String>): EventEnvelopBuilder<T> {
        this.id = id
        return this
    }

    fun payload(payload: T): EventEnvelopBuilder<T> {
        this.payload = payload
        return this
    }

    fun build(): EventEnvelop<T> {
        require(payload != null) { throw EventPayloadNotExistException() }
        return EventEnvelop(id, payload!!)
    }
}
