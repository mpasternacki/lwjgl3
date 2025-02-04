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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing features supported by VK_KHR_shader_atomic_int64.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderAtomicInt64#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code shaderBufferInt64Atomics} &ndash; indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on buffers.</li>
 * <li>{@code shaderSharedInt64Atomics} &ndash; indicates whether shaders <b>can</b> support 64-bit unsigned and signed integer atomic operations on shared memory.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderAtomicInt64FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderBufferInt64Atomics;
 *     VkBool32 shaderSharedInt64Atomics;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderAtomicInt64FeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERBUFFERINT64ATOMICS,
        SHADERSHAREDINT64ATOMICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBUFFERINT64ATOMICS = layout.offsetof(2);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(3);
    }

    VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderBufferInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() { return nshaderBufferInt64Atomics(address()) != 0; }
    /** Returns the value of the {@code shaderSharedInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() { return nshaderSharedInt64Atomics(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderBufferInt64Atomics,
        boolean shaderSharedInt64Atomics
    ) {
        sType(sType);
        pNext(pNext);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create() {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics}. */
    public static int nshaderBufferInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.SHADERBUFFERINT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics}. */
    public static int nshaderSharedInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.SHADERSHAREDINT64ATOMICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics(boolean) shaderBufferInt64Atomics}. */
    public static void nshaderBufferInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.SHADERBUFFERINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics(boolean) shaderSharedInt64Atomics}. */
    public static void nshaderSharedInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.SHADERSHAREDINT64ATOMICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicInt64FeaturesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderAtomicInt64FeaturesKHR newInstance(long address) {
            return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code shaderBufferInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderBufferInt64Atomics(address()) != 0; }
        /** Returns the value of the {@code shaderSharedInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() { return VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderSharedInt64Atomics(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }

    }

}