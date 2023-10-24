package com.github.dhslrl321.eventro.serdes

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.io.IOException
import java.time.Instant

object EventSerializer {

    fun serialize(foo: Any): String {
        return GsonHolder.gson.toJson(foo)
    }
}

