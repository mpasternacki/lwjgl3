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
 * Structure specifying representative fragment test.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code representativeFragmentTestEnable} is considered to be {@link VK10#VK_FALSE FALSE}, and the representative fragment test is disabled.</p>
 * 
 * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fragops-early-mode">early fragment tests</a> are not enabled in the active fragment shader, the representative fragment shader test has no effect, even if enabled.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRepresentativeFragmentTest#VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code representativeFragmentTestEnable} &ndash; controls whether the representative fragment test is enabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRepresentativeFragmentTestStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 representativeFragmentTestEnable;
 * }</code></pre>
 */
public class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REPRESENTATIVEFRAGMENTTESTENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REPRESENTATIVEFRAGMENTTESTENABLE = layout.offsetof(2);
    }

    VkPipelineRepresentativeFragmentTestStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code representativeFragmentTestEnable} field. */
    @NativeType("VkBool32")
    public boolean representativeFragmentTestEnable() { return nrepresentativeFragmentTestEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code representativeFragmentTestEnable} field. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { nrepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(
        int sType,
        long pNext,
        boolean representativeFragmentTestEnable
    ) {
        sType(sType);
        pNext(pNext);
        representativeFragmentTestEnable(representativeFragmentTestEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(VkPipelineRepresentativeFragmentTestStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create() {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create(long address) {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #representativeFragmentTestEnable}. */
    public static int nrepresentativeFragmentTestEnable(long struct) { return memGetInt(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.REPRESENTATIVEFRAGMENTTESTENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #representativeFragmentTestEnable(boolean) representativeFragmentTestEnable}. */
    public static void nrepresentativeFragmentTestEnable(long struct, int value) { memPutInt(struct + VkPipelineRepresentativeFragmentTestStateCreateInfoNV.REPRESENTATIVEFRAGMENTTESTENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRepresentativeFragmentTestStateCreateInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRepresentativeFragmentTestStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRepresentativeFragmentTestStateCreateInfoNV newInstance(long address) {
            return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code representativeFragmentTestEnable} field. */
        @NativeType("VkBool32")
        public boolean representativeFragmentTestEnable() { return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code representativeFragmentTestEnable} field. */
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV.Buffer representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }

    }

}