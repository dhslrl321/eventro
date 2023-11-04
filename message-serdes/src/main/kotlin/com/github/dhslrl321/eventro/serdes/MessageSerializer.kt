package com.github.dhslrl321.eventro.serdes

object MessageSerializer {

    fun serialize(foo: Any): String {
        return GsonHolder.gson.toJson(foo)
    }
}

