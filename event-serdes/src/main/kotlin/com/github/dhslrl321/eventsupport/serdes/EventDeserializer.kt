package com.github.dhslrl321.eventsupport.serdes

import com.google.gson.Gson

object EventDeserializer {
    val gson = Gson()

    inline fun <reified T> deserialize(json: String): T {
        try {
            return gson.fromJson(json, T::class.java)
        } catch (e: Exception) {
            throw SerdesException(e.message)
        }
    }

    class ZolaSerializeException(message: String?) : Exception(message)
}
