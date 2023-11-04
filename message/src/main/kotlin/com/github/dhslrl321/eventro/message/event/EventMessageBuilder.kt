package com.github.dhslrl321.eventro.message.event

import com.github.dhslrl321.eventro.message.InsufficientMessageException

class EventMessageBuilder<T> {
    private var eventName: String? = null
    private var data: T? = null
    private var eventVersion: String? = null
    private var source: String? = null

    fun data(data: T): EventMessageBuilder<T> {
        this.data = data
        return this
    }

    fun eventName(name: String): EventMessageBuilder<T> {
        this.eventName = name
        return this
    }

    fun eventVersion(version: String): EventMessageBuilder<T> {
        this.eventVersion = version
        return this
    }

    fun source(source: String): EventMessageBuilder<T> {
        this.source = source
        return this
    }

    fun build(): EventMessage<T> {
        require(data != null) { throw InsufficientMessageException("EventMessage must exists event payload") }
        require(eventName != null) { throw InsufficientMessageException("EventMessage must exists event eventType") }
        require(eventVersion != null) { throw InsufficientMessageException("EventMessage must exists event version") }
        require(source != null) { throw InsufficientMessageException("EventMessage must exists source") }

        return EventMessage(eventName!!, data!!, eventVersion!!, source!!)
    }
}
