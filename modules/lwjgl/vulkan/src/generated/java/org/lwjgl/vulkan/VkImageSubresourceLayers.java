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
 * Structure specifying an image subresource layers.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code aspectMask} contains {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, it <b>must</b> not contain either of {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>{@code aspectMask} <b>must</b> not contain {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}</li>
 * <li>{@code layerCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferImageCopy}, {@link VkImageBlit}, {@link VkImageCopy}, {@link VkImageResolve}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a combination of {@code VkImageAspectFlagBits}, selecting the color, depth and/or stencil aspects to be copied.</li>
 * <li>{@code mipLevel} &ndash; the mipmap level to copy from.</li>
 * <li>{@code baseArrayLayer} &ndash; {@code baseArrayLayer} and {@code layerCount} are the starting layer and number of layers to copy.</li>
 * <li>{@code layerCount} &ndash; see {@code baseArrayLayer}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageSubresourceLayers {
 *     VkImageAspectFlags aspectMask;
 *     uint32_t mipLevel;
 *     uint32_t baseArrayLayer;
 *     uint32_t layerCount;
 * }</code></pre>
 */
public class VkImageSubresourceLayers extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        MIPLEVEL,
        BASEARRAYLAYER,
        LAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        MIPLEVEL = layout.offsetof(1);
        BASEARRAYLAYER = layout.offsetof(2);
        LAYERCOUNT = layout.offsetof(3);
    }

    VkImageSubresourceLayers(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageSubresourceLayers} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresourceLayers(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** Returns the value of the {@code mipLevel} field. */
    @NativeType("uint32_t")
    public int mipLevel() { return nmipLevel(address()); }
    /** Returns the value of the {@code baseArrayLayer} field. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** Returns the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }

    /** Sets the specified value to the {@code aspectMask} field. */
    public VkImageSubresourceLayers aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@code mipLevel} field. */
    public VkImageSubresourceLayers mipLevel(@NativeType("uint32_t") int value) { nmipLevel(address(), value); return this; }
    /** Sets the specified value to the {@code baseArrayLayer} field. */
    public VkImageSubresourceLayers baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkImageSubresourceLayers layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresourceLayers set(
        int aspectMask,
        int mipLevel,
        int baseArrayLayer,
        int layerCount
    ) {
        aspectMask(aspectMask);
        mipLevel(mipLevel);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresourceLayers set(VkImageSubresourceLayers src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceLayers malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceLayers calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkImageSubresourceLayers} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresourceLayers create() {
        return new VkImageSubresourceLayers(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageSubresourceLayers} instance for the specified memory address. */
    public static VkImageSubresourceLayers create(long address) {
        return new VkImageSubresourceLayers(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresourceLayers createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImageSubresourceLayers.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresourceLayers.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageSubresourceLayers} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageSubresourceLayers mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageSubresourceLayers} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageSubresourceLayers callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceLayers mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceLayers callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceLayers.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceLayers.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkImageSubresourceLayers.ASPECTMASK); }
    /** Unsafe version of {@link #mipLevel}. */
    public static int nmipLevel(long struct) { return memGetInt(struct + VkImageSubresourceLayers.MIPLEVEL); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return memGetInt(struct + VkImageSubresourceLayers.BASEARRAYLAYER); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + VkImageSubresourceLayers.LAYERCOUNT); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.ASPECTMASK, value); }
    /** Unsafe version of {@link #mipLevel(int) mipLevel}. */
    public static void nmipLevel(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.MIPLEVEL, value); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { memPutInt(struct + VkImageSubresourceLayers.LAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkImageSubresourceLayers} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresourceLayers, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageSubresourceLayers.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresourceLayers#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSubresourceLayers newInstance(long address) {
            return new VkImageSubresourceLayers(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkImageSubresourceLayers.naspectMask(address()); }
        /** Returns the value of the {@code mipLevel} field. */
        @NativeType("uint32_t")
        public int mipLevel() { return VkImageSubresourceLayers.nmipLevel(address()); }
        /** Returns the value of the {@code baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkImageSubresourceLayers.nbaseArrayLayer(address()); }
        /** Returns the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkImageSubresourceLayers.nlayerCount(address()); }

        /** Sets the specified value to the {@code aspectMask} field. */
        public VkImageSubresourceLayers.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkImageSubresourceLayers.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@code mipLevel} field. */
        public VkImageSubresourceLayers.Buffer mipLevel(@NativeType("uint32_t") int value) { VkImageSubresourceLayers.nmipLevel(address(), value); return this; }
        /** Sets the specified value to the {@code baseArrayLayer} field. */
        public VkImageSubresourceLayers.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkImageSubresourceLayers.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkImageSubresourceLayers.Buffer layerCount(@NativeType("uint32_t") int value) { VkImageSubresourceLayers.nlayerCount(address(), value); return this; }

    }

}