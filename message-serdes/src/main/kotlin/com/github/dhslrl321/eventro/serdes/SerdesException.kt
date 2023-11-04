package com.github.dhslrl321.eventro.serdes

class SerdesException(
    errorMessage: String
): RuntimeException("Exception occurred while serializing / deserializing:: $errorMessage")
