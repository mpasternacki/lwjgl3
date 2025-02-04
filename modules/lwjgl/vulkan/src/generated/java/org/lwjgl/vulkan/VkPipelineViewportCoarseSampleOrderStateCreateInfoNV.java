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
 * Structure specifying parameters controlling sample order in coarse fragments.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code sampleOrderType} is considered to be {@link NVShadingRateImage#VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV}.</p>
 * 
 * <p>If {@code sampleOrderType} is {@link NVShadingRateImage#VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV}, the coverage sample order used for any combination of fragment area and coverage sample count not enumerated in {@code pCustomSampleOrders} will be identical to that used for {@link NVShadingRateImage#VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV}.</p>
 * 
 * <p>If the pipeline was created with {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV}, the contents of this structure (if present) are ignored, and the coverage sample order is instead specified by {@link NVShadingRateImage#vkCmdSetCoarseSampleOrderNV CmdSetCoarseSampleOrderNV}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code sampleOrderType} is not {@link NVShadingRateImage#VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV}, {@code customSamplerOrderCount} <b>must</b> be 0</li>
 * <li>The array {@code pCustomSampleOrders} <b>must</b> not contain two structures with matching values for both the {@code shadingRate} and {@code sampleCount} members.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV}</li>
 * <li>{@code sampleOrderType} <b>must</b> be a valid {@code VkCoarseSampleOrderTypeNV} value</li>
 * <li>If {@code customSampleOrderCount} is not 0, {@code pCustomSampleOrders} <b>must</b> be a valid pointer to an array of {@code customSampleOrderCount} valid {@link VkCoarseSampleOrderCustomNV} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCoarseSampleOrderCustomNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code sampleOrderType} &ndash; specifies the mechanism used to order coverage samples in fragments larger than one pixel.</li>
 * <li>{@code customSampleOrderCount} &ndash; specifies the number of custom sample orderings to use when ordering coverage samples.</li>
 * <li>{@code pCustomSampleOrders} &ndash; a pointer to an array of {@link VkCoarseSampleOrderCustomNV} structures, each of which specifies the coverage sample order for a single combination of fragment area and coverage sample count.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCoarseSampleOrderTypeNV sampleOrderType;
 *     uint32_t customSampleOrderCount;
 *     {@link VkCoarseSampleOrderCustomNV VkCoarseSampleOrderCustomNV const} * pCustomSampleOrders;
 * }</code></pre>
 */
public class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLEORDERTYPE,
        CUSTOMSAMPLEORDERCOUNT,
        PCUSTOMSAMPLEORDERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLEORDERTYPE = layout.offsetof(2);
        CUSTOMSAMPLEORDERCOUNT = layout.offsetof(3);
        PCUSTOMSAMPLEORDERS = layout.offsetof(4);
    }

    VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(ByteBuffer container) {
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
    /** Returns the value of the {@code sampleOrderType} field. */
    @NativeType("VkCoarseSampleOrderTypeNV")
    public int sampleOrderType() { return nsampleOrderType(address()); }
    /** Returns the value of the {@code customSampleOrderCount} field. */
    @NativeType("uint32_t")
    public int customSampleOrderCount() { return ncustomSampleOrderCount(address()); }
    /** Returns a {@link VkCoarseSampleOrderCustomNV.Buffer} view of the struct array pointed to by the {@code pCustomSampleOrders} field. */
    @Nullable
    @NativeType("VkCoarseSampleOrderCustomNV const *")
    public VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders() { return npCustomSampleOrders(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code sampleOrderType} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) { nsampleOrderType(address(), value); return this; }
    /** Sets the address of the specified {@link VkCoarseSampleOrderCustomNV.Buffer} to the {@code pCustomSampleOrders} field. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(@Nullable @NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer value) { npCustomSampleOrders(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(
        int sType,
        long pNext,
        int sampleOrderType,
        @Nullable VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders
    ) {
        sType(sType);
        pNext(pNext);
        sampleOrderType(sampleOrderType);
        pCustomSampleOrders(pCustomSampleOrders);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create() {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(long address) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #sampleOrderType}. */
    public static int nsampleOrderType(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.SAMPLEORDERTYPE); }
    /** Unsafe version of {@link #customSampleOrderCount}. */
    public static int ncustomSampleOrderCount(long struct) { return memGetInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.CUSTOMSAMPLEORDERCOUNT); }
    /** Unsafe version of {@link #pCustomSampleOrders}. */
    @Nullable public static VkCoarseSampleOrderCustomNV.Buffer npCustomSampleOrders(long struct) { return VkCoarseSampleOrderCustomNV.createSafe(memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS), ncustomSampleOrderCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #sampleOrderType(int) sampleOrderType}. */
    public static void nsampleOrderType(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.SAMPLEORDERTYPE, value); }
    /** Sets the specified value to the {@code customSampleOrderCount} field of the specified {@code struct}. */
    public static void ncustomSampleOrderCount(long struct, int value) { memPutInt(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.CUSTOMSAMPLEORDERCOUNT, value); }
    /** Unsafe version of {@link #pCustomSampleOrders(VkCoarseSampleOrderCustomNV.Buffer) pCustomSampleOrders}. */
    public static void npCustomSampleOrders(long struct, @Nullable VkCoarseSampleOrderCustomNV.Buffer value) { memPutAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS, memAddressSafe(value)); ncustomSampleOrderCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int customSampleOrderCount = ncustomSampleOrderCount(struct);
        if (customSampleOrderCount != 0) {
            long pCustomSampleOrders = memGetAddress(struct + VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.PCUSTOMSAMPLEORDERS);
            check(pCustomSampleOrders);
            VkCoarseSampleOrderCustomNV.validate(pCustomSampleOrders, customSampleOrderCount);
        }
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

    /** An array of {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportCoarseSampleOrderStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineViewportCoarseSampleOrderStateCreateInfoNV newInstance(long address) {
            return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code sampleOrderType} field. */
        @NativeType("VkCoarseSampleOrderTypeNV")
        public int sampleOrderType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address()); }
        /** Returns the value of the {@code customSampleOrderCount} field. */
        @NativeType("uint32_t")
        public int customSampleOrderCount() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.ncustomSampleOrderCount(address()); }
        /** Returns a {@link VkCoarseSampleOrderCustomNV.Buffer} view of the struct array pointed to by the {@code pCustomSampleOrders} field. */
        @Nullable
        @NativeType("VkCoarseSampleOrderCustomNV const *")
        public VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code sampleOrderType} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address(), value); return this; }
        /** Sets the address of the specified {@link VkCoarseSampleOrderCustomNV.Buffer} to the {@code pCustomSampleOrders} field. */
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.Buffer pCustomSampleOrders(@Nullable @NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address(), value); return this; }

    }

}