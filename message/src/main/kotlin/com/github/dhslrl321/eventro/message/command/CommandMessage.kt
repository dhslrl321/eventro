package com.github.dhslrl321.eventro.message.command

import com.github.dhslrl321.eventro.message.Message
import com.github.dhslrl321.eventro.message.MessageId
import com.github.dhslrl321.eventro.message.MessageId.Companion.uuid
import com.github.dhslrl321.eventro.message.MessageType
import com.github.dhslrl321.eventro.message.MessageType.COMMAND_MESSAGE
import java.time.Instant

/**
 * Command Message is trigger some behavior to the system
 *
 * @param commandName Representative name of command. Name format should be
 *  - (behavior + resource)Command
 *  - ex CreateUserCommand, CancelOrderCommand
 * @param data Data payload of command
 * @param source Creator of the command
 * @param target Destination of command will be applied
 */
class CommandMessage<T>(
    val commandName: String,
    val data: T,
    val source: String,
    val target: String,
) : Message{
    override val id: MessageId = uuid()
    override val type: MessageType = COMMAND_MESSAGE
    override val createdAt: Instant = Instant.now()
}
