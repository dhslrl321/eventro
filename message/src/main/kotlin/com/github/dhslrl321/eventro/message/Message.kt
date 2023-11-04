package com.github.dhslrl321.eventro.message

import java.time.Instant

/**
 * Message is the base object of event infrastructure
 */
interface Message {
    val id: MessageId
    val type: MessageType
    val createdAt: Instant
}
