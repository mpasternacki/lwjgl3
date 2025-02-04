/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing shading rate image limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceShadingRateImagePropertiesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shadingRateTexelSize} &ndash; indicates the width and height of the portion of the framebuffer corresponding to each texel in the shading rate image.</li>
 * <li>{@code shadingRatePaletteSize} &ndash; indicates the maximum number of palette entries supported for the shading rate image.</li>
 * <li>{@code shadingRateMaxCoarseSamples} &ndash; specifies the maximum number of coverage samples supported in a single fragment. If the product of the fragment size derived from the base shading rate and the number of coverage samples per pixel exceeds this limit, the final shading rate will be adjusted so that its product does not exceed the limit.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShadingRateImagePropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} shadingRateTexelSize;
 *     uint32_t shadingRatePaletteSize;
 *     uint32_t shadingRateMaxCoarseSamples;
 * }</code></pre>
 */
public class VkPhysicalDeviceShadingRateImagePropertiesNV extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATETEXELSIZE,
        SHADINGRATEPALETTESIZE,
        SHADINGRATEMAXCOARSESAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATETEXELSIZE = layout.offsetof(2);
        SHADINGRATEPALETTESIZE = layout.offsetof(3);
        SHADINGRATEMAXCOARSESAMPLES = layout.offsetof(4);
    }

    VkPhysicalDeviceShadingRateImagePropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceShadingRateImagePropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShadingRateImagePropertiesNV(ByteBuffer container) {
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
    /** Returns a {@link VkExtent2D} view of the {@code shadingRateTexelSize} field. */
    public VkExtent2D shadingRateTexelSize() { return nshadingRateTexelSize(address()); }
    /** Passes the {@code shadingRateTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateTexelSize()); return this; }
    /** Returns the value of the {@code shadingRatePaletteSize} field. */
    @NativeType("uint32_t")
    public int shadingRatePaletteSize() { return nshadingRatePaletteSize(address()); }
    /** Returns the value of the {@code shadingRateMaxCoarseSamples} field. */
    @NativeType("uint32_t")
    public int shadingRateMaxCoarseSamples() { return nshadingRateMaxCoarseSamples(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(VkPhysicalDeviceShadingRateImagePropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV create(long address) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImagePropertiesNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateTexelSize}. */
    public static VkExtent2D nshadingRateTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATETEXELSIZE); }
    /** Unsafe version of {@link #shadingRatePaletteSize}. */
    public static int nshadingRatePaletteSize(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATEPALETTESIZE); }
    /** Unsafe version of {@link #shadingRateMaxCoarseSamples}. */
    public static int nshadingRateMaxCoarseSamples(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATEMAXCOARSESAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShadingRateImagePropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImagePropertiesNV, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShadingRateImagePropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShadingRateImagePropertiesNV newInstance(long address) {
            return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code shadingRateTexelSize} field. */
        public VkExtent2D shadingRateTexelSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateTexelSize(address()); }
        /** Passes the {@code shadingRateTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer shadingRateTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateTexelSize()); return this; }
        /** Returns the value of the {@code shadingRatePaletteSize} field. */
        @NativeType("uint32_t")
        public int shadingRatePaletteSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRatePaletteSize(address()); }
        /** Returns the value of the {@code shadingRateMaxCoarseSamples} field. */
        @NativeType("uint32_t")
        public int shadingRateMaxCoarseSamples() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateMaxCoarseSamples(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address(), value); return this; }

    }

}