/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a single shading rate palette.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code shadingRatePaletteEntryCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceShadingRateImagePropertiesNV}{@code ::shadingRatePaletteSize}, inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code pShadingRatePaletteEntries} <b>must</b> be a valid pointer to an array of {@code shadingRatePaletteEntryCount} valid {@code VkShadingRatePaletteEntryNV} values</li>
 * <li>{@code shadingRatePaletteEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineViewportShadingRateImageStateCreateInfoNV}, {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shadingRatePaletteEntryCount} &ndash; specifies the number of entries in the shading rate image palette.</li>
 * <li>{@code pShadingRatePaletteEntries} &ndash; a pointer to an array of {@code VkShadingRatePaletteEntryNV} enums defining the shading rate for each palette entry.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShadingRatePaletteNV {
 *     uint32_t shadingRatePaletteEntryCount;
 *     VkShadingRatePaletteEntryNV const * pShadingRatePaletteEntries;
 * }</code></pre>
 */
public class VkShadingRatePaletteNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADINGRATEPALETTEENTRYCOUNT,
        PSHADINGRATEPALETTEENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADINGRATEPALETTEENTRYCOUNT = layout.offsetof(0);
        PSHADINGRATEPALETTEENTRIES = layout.offsetof(1);
    }

    VkShadingRatePaletteNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkShadingRatePaletteNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShadingRatePaletteNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code shadingRatePaletteEntryCount} field. */
    @NativeType("uint32_t")
    public int shadingRatePaletteEntryCount() { return nshadingRatePaletteEntryCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pShadingRatePaletteEntries} field. */
    @NativeType("VkShadingRatePaletteEntryNV const *")
    public IntBuffer pShadingRatePaletteEntries() { return npShadingRatePaletteEntries(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@code pShadingRatePaletteEntries} field. */
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) { npShadingRatePaletteEntries(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShadingRatePaletteNV set(VkShadingRatePaletteNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkShadingRatePaletteNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShadingRatePaletteNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkShadingRatePaletteNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShadingRatePaletteNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkShadingRatePaletteNV} instance allocated with {@link BufferUtils}. */
    public static VkShadingRatePaletteNV create() {
        return new VkShadingRatePaletteNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkShadingRatePaletteNV} instance for the specified memory address. */
    public static VkShadingRatePaletteNV create(long address) {
        return new VkShadingRatePaletteNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShadingRatePaletteNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkShadingRatePaletteNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShadingRatePaletteNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkShadingRatePaletteNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkShadingRatePaletteNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkShadingRatePaletteNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkShadingRatePaletteNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShadingRatePaletteNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShadingRatePaletteNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shadingRatePaletteEntryCount}. */
    public static int nshadingRatePaletteEntryCount(long struct) { return memGetInt(struct + VkShadingRatePaletteNV.SHADINGRATEPALETTEENTRYCOUNT); }
    /** Unsafe version of {@link #pShadingRatePaletteEntries() pShadingRatePaletteEntries}. */
    public static IntBuffer npShadingRatePaletteEntries(long struct) { return memIntBuffer(memGetAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES), nshadingRatePaletteEntryCount(struct)); }

    /** Sets the specified value to the {@code shadingRatePaletteEntryCount} field of the specified {@code struct}. */
    public static void nshadingRatePaletteEntryCount(long struct, int value) { memPutInt(struct + VkShadingRatePaletteNV.SHADINGRATEPALETTEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pShadingRatePaletteEntries(IntBuffer) pShadingRatePaletteEntries}. */
    public static void npShadingRatePaletteEntries(long struct, IntBuffer value) { memPutAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES, memAddress(value)); nshadingRatePaletteEntryCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkShadingRatePaletteNV} structs. */
    public static class Buffer extends StructBuffer<VkShadingRatePaletteNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkShadingRatePaletteNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShadingRatePaletteNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkShadingRatePaletteNV newInstance(long address) {
            return new VkShadingRatePaletteNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code shadingRatePaletteEntryCount} field. */
        @NativeType("uint32_t")
        public int shadingRatePaletteEntryCount() { return VkShadingRatePaletteNV.nshadingRatePaletteEntryCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pShadingRatePaletteEntries} field. */
        @NativeType("VkShadingRatePaletteEntryNV const *")
        public IntBuffer pShadingRatePaletteEntries() { return VkShadingRatePaletteNV.npShadingRatePaletteEntries(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@code pShadingRatePaletteEntries} field. */
        public VkShadingRatePaletteNV.Buffer pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) { VkShadingRatePaletteNV.npShadingRatePaletteEntries(address(), value); return this; }

    }

}