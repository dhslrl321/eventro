package com.github.dhslrl321.eventsupport.serdes

class SerdesException(
    errorMessage: String
): RuntimeException("Exception occurred while serializing / deserializing:: $errorMessage")
