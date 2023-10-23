package com.github.dhslrl321.eventsupport.serdes

import com.google.gson.Gson

object EventSerializer {

    private val gson = Gson()

    fun serialize(foo: Any): String {
        return gson.toJson(foo)
    }
}
