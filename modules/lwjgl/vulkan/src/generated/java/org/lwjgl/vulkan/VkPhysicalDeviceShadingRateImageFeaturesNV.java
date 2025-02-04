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
 * Structure describing shading rate image features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#primsrast-shading-rate-image">Shading Rate Image</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceShadingRateImageFeaturesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceShadingRateImageFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shadingRateImage} &ndash; indicates that the implementation supports the use of a shading rate image to derive an effective shading rate for fragment processing. It also indicates that the implementation supports the {@code ShadingRateNV} SPIR-V execution mode.</li>
 * <li>{@code shadingRateCoarseSampleOrder} &ndash; indicates that the implementation supports a user-configurable ordering of coverage samples in fragments larger than one pixel.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShadingRateImageFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shadingRateImage;
 *     VkBool32 shadingRateCoarseSampleOrder;
 * }</code></pre>
 */
public class VkPhysicalDeviceShadingRateImageFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATEIMAGE,
        SHADINGRATECOARSESAMPLEORDER;

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
        SHADINGRATEIMAGE = layout.offsetof(2);
        SHADINGRATECOARSESAMPLEORDER = layout.offsetof(3);
    }

    VkPhysicalDeviceShadingRateImageFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShadingRateImageFeaturesNV(ByteBuffer container) {
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
    /** Returns the value of the {@code shadingRateImage} field. */
    @NativeType("VkBool32")
    public boolean shadingRateImage() { return nshadingRateImage(address()) != 0; }
    /** Returns the value of the {@code shadingRateCoarseSampleOrder} field. */
    @NativeType("VkBool32")
    public boolean shadingRateCoarseSampleOrder() { return nshadingRateCoarseSampleOrder(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shadingRateImage} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(@NativeType("VkBool32") boolean value) { nshadingRateImage(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shadingRateCoarseSampleOrder} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) { nshadingRateCoarseSampleOrder(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(
        int sType,
        long pNext,
        boolean shadingRateImage,
        boolean shadingRateCoarseSampleOrder
    ) {
        sType(sType);
        pNext(pNext);
        shadingRateImage(shadingRateImage);
        shadingRateCoarseSampleOrder(shadingRateCoarseSampleOrder);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(VkPhysicalDeviceShadingRateImageFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV create() {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV create(long address) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImageFeaturesNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateImage}. */
    public static int nshadingRateImage(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATEIMAGE); }
    /** Unsafe version of {@link #shadingRateCoarseSampleOrder}. */
    public static int nshadingRateCoarseSampleOrder(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATECOARSESAMPLEORDER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #shadingRateImage(boolean) shadingRateImage}. */
    public static void nshadingRateImage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATEIMAGE, value); }
    /** Unsafe version of {@link #shadingRateCoarseSampleOrder(boolean) shadingRateCoarseSampleOrder}. */
    public static void nshadingRateCoarseSampleOrder(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATECOARSESAMPLEORDER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShadingRateImageFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImageFeaturesNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShadingRateImageFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShadingRateImageFeaturesNV newInstance(long address) {
            return new VkPhysicalDeviceShadingRateImageFeaturesNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address()); }
        /** Returns the value of the {@code shadingRateImage} field. */
        @NativeType("VkBool32")
        public boolean shadingRateImage() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address()) != 0; }
        /** Returns the value of the {@code shadingRateCoarseSampleOrder} field. */
        @NativeType("VkBool32")
        public boolean shadingRateCoarseSampleOrder() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shadingRateImage} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer shadingRateImage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shadingRateCoarseSampleOrder} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address(), value ? 1 : 0); return this; }

    }

}