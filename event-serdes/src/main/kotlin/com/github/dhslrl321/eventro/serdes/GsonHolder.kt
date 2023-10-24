package com.github.dhslrl321.eventro.serdes

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.io.IOException
import java.time.Instant

object GsonHolder {

    val gson: Gson = GsonBuilder()
        .registerTypeAdapter(Instant::class.java, InstantTypeAdapter())
        .create()

}

private class InstantTypeAdapter : TypeAdapter<Instant>() {
    @Throws(IOException::class)
    override fun write(out: JsonWriter, value: Instant?) {
        if (value != null) {
            out.value(value.toString())
        } else {
            out.nullValue()
        }
    }

    @Throws(IOException::class)
    override fun read(`in`: JsonReader): Instant? {
        return Instant.parse(`in`.nextString())
    }
}

