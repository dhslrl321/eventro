package com.github.dhslrl321.eventro.message

import java.util.*

/**
 * This is globally unique id for message streams
 * This used for identifying message of purpose of idempotent key
 *
 * Now, we only support string id
 */
class MessageId(
    val value: String
) {
    companion object {
        fun uuid(): MessageId {
            return MessageId(UUID.randomUUID().toString())
        }
    }
}
