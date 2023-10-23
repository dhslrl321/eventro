package com.github.dhslrl321.eventsupport.envelop

class InsufficientEventEnvelopException(
    override val message: String,
) : RuntimeException()

object InsufficientEventEnvelopExceptions {
    fun payload(): InsufficientEventEnvelopException =
        InsufficientEventEnvelopException("EventEnvelop must have exists event payload")

    fun type(): InsufficientEventEnvelopException =
        InsufficientEventEnvelopException("EventEnvelop must have exists event version")

    fun version(): InsufficientEventEnvelopException =
        InsufficientEventEnvelopException("EventEnvelop must have exists event version")
}
