/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Backbuffer resolution and reset parameters.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; backbuffer format</li>
 * <li>{@code width} &ndash; backbuffer width</li>
 * <li>{@code height} &ndash; backbuffer height</li>
 * <li>{@code reset} &ndash; reset parameters</li>
 * <li>{@code maxFrameLatency} &ndash; maximum frame latency</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_resolution_t {
 *     bgfx_texture_format_t format;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t reset;
 *     uint8_t maxFrameLatency;
 * }</code></pre>
 */
@NativeType("struct bgfx_resolution_t")
public class BGFXResolution extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        WIDTH,
        HEIGHT,
        RESET,
        MAXFRAMELATENCY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        RESET = layout.offsetof(3);
        MAXFRAMELATENCY = layout.offsetof(4);
    }

    BGFXResolution(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXResolution} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXResolution(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code format} field. */
    @NativeType("bgfx_texture_format_t")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code reset} field. */
    @NativeType("uint32_t")
    public int reset() { return nreset(address()); }
    /** Returns the value of the {@code maxFrameLatency} field. */
    @NativeType("uint8_t")
    public byte maxFrameLatency() { return nmaxFrameLatency(address()); }

    /** Sets the specified value to the {@code format} field. */
    public BGFXResolution format(@NativeType("bgfx_texture_format_t") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public BGFXResolution width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public BGFXResolution height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code reset} field. */
    public BGFXResolution reset(@NativeType("uint32_t") int value) { nreset(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrameLatency} field. */
    public BGFXResolution maxFrameLatency(@NativeType("uint8_t") byte value) { nmaxFrameLatency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXResolution set(
        int format,
        int width,
        int height,
        int reset,
        byte maxFrameLatency
    ) {
        format(format);
        width(width);
        height(height);
        reset(reset);
        maxFrameLatency(maxFrameLatency);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXResolution set(BGFXResolution src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXResolution} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXResolution malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXResolution} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXResolution calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXResolution} instance allocated with {@link BufferUtils}. */
    public static BGFXResolution create() {
        return new BGFXResolution(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXResolution} instance for the specified memory address. */
    public static BGFXResolution create(long address) {
        return new BGFXResolution(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXResolution createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXResolution} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXResolution mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXResolution} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXResolution callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXResolution} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXResolution mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXResolution} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXResolution callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + BGFXResolution.FORMAT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + BGFXResolution.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + BGFXResolution.HEIGHT); }
    /** Unsafe version of {@link #reset}. */
    public static int nreset(long struct) { return memGetInt(struct + BGFXResolution.RESET); }
    /** Unsafe version of {@link #maxFrameLatency}. */
    public static byte nmaxFrameLatency(long struct) { return memGetByte(struct + BGFXResolution.MAXFRAMELATENCY); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + BGFXResolution.FORMAT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + BGFXResolution.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + BGFXResolution.HEIGHT, value); }
    /** Unsafe version of {@link #reset(int) reset}. */
    public static void nreset(long struct, int value) { memPutInt(struct + BGFXResolution.RESET, value); }
    /** Unsafe version of {@link #maxFrameLatency(byte) maxFrameLatency}. */
    public static void nmaxFrameLatency(long struct, byte value) { memPutByte(struct + BGFXResolution.MAXFRAMELATENCY, value); }

}