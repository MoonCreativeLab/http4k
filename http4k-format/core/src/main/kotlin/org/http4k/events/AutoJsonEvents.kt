package org.http4k.events

import org.http4k.format.AutoMarshalling

@Deprecated("Replace with AutoMarshallingEvents", ReplaceWith("AutoMarshallingEvents"))
typealias AutoJsonEvents = AutoMarshallingEvents

object AutoMarshallingEvents {
    operator fun invoke(json: AutoMarshalling, print: (String) -> Unit = ::println) = object : Events {
        override fun invoke(p1: Event) = print(json.asFormatString(p1))
    }
}
