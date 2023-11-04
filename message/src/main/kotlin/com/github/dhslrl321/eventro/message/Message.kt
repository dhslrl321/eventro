package com.github.dhslrl321.eventro.message

import java.time.Instant

/**
 * Message is the base object of event infrastructure
 */
interface Message {

    /**
     * Identification data of the message
     * used for idempotent key
     */
    fun getId(): MessageId

    /**
     * Representative type of message
     * @see MessageType
     */
    fun getType(): MessageType

    /**
     * Instant of the message has created
     */
    fun getCreatedAt(): Instant
}
