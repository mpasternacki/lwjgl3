/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.freebsd

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.CORE_FREEBSD,
        "Contains bindings to native APIs specific to the FreeBSD operating system."
    )
}

val long = IntegerType("long", PrimitiveMapping.POINTER)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.POINTER, unsigned = true)