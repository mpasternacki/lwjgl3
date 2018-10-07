/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

#include <sys/stddef.h>
#include <sys/stdint.h>
#include <sys/types.h>

#define DISABLE_WARNINGS() \
    _Pragma("GCC diagnostic push")
    _Pragma("GCC diagnostic ignored \"-Wunused-parameter\"")
    _Pragma("GCC diagnostic ignored \"-Wsign-compare\"")

#define ENABLE_WARNINGS() \
    _Pragma("GCC diagnostic pop")
