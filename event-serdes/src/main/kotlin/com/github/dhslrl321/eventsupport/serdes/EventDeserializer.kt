package com.github.dhslrl321.eventsupport.serdes

import com.google.gson.Gson

object EventDeserializer {
    inline fun <reified T> deserialize(json: String): T {
        try {
            return GsonHolder.gson.fromJson(json, T::class.java)
        } catch (e: Exception) {
            throw SerdesException(e.message!!)
        }
    }
}
