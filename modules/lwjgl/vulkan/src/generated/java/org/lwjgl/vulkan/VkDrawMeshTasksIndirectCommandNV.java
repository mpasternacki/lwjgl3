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
 * Structure specifying a mesh tasks draw indirect command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDrawMeshTasksIndirectCommandNV} have the same meaning as the similarly named parameters of {@link NVMeshShader#vkCmdDrawMeshTasksNV CmdDrawMeshTasksNV}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code taskCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesNV}{@code ::maxDrawMeshTasksCount}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVMeshShader#vkCmdDrawMeshTasksIndirectNV CmdDrawMeshTasksIndirectNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code taskCount} &ndash; the number of local workgroups to dispatch in the X dimension. Y and Z dimension are implicitly set to one.</li>
 * <li>{@code firstTask} &ndash; the X component of the first workgroup ID.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrawMeshTasksIndirectCommandNV {
 *     uint32_t taskCount;
 *     uint32_t firstTask;
 * }</code></pre>
 */
public class VkDrawMeshTasksIndirectCommandNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TASKCOUNT,
        FIRSTTASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TASKCOUNT = layout.offsetof(0);
        FIRSTTASK = layout.offsetof(1);
    }

    VkDrawMeshTasksIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDrawMeshTasksIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawMeshTasksIndirectCommandNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code taskCount} field. */
    @NativeType("uint32_t")
    public int taskCount() { return ntaskCount(address()); }
    /** Returns the value of the {@code firstTask} field. */
    @NativeType("uint32_t")
    public int firstTask() { return nfirstTask(address()); }

    /** Sets the specified value to the {@code taskCount} field. */
    public VkDrawMeshTasksIndirectCommandNV taskCount(@NativeType("uint32_t") int value) { ntaskCount(address(), value); return this; }
    /** Sets the specified value to the {@code firstTask} field. */
    public VkDrawMeshTasksIndirectCommandNV firstTask(@NativeType("uint32_t") int value) { nfirstTask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawMeshTasksIndirectCommandNV set(
        int taskCount,
        int firstTask
    ) {
        taskCount(taskCount);
        firstTask(firstTask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawMeshTasksIndirectCommandNV set(VkDrawMeshTasksIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkDrawMeshTasksIndirectCommandNV create() {
        return new VkDrawMeshTasksIndirectCommandNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance for the specified memory address. */
    public static VkDrawMeshTasksIndirectCommandNV create(long address) {
        return new VkDrawMeshTasksIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawMeshTasksIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawMeshTasksIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDrawMeshTasksIndirectCommandNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDrawMeshTasksIndirectCommandNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #taskCount}. */
    public static int ntaskCount(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandNV.TASKCOUNT); }
    /** Unsafe version of {@link #firstTask}. */
    public static int nfirstTask(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandNV.FIRSTTASK); }

    /** Unsafe version of {@link #taskCount(int) taskCount}. */
    public static void ntaskCount(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandNV.TASKCOUNT, value); }
    /** Unsafe version of {@link #firstTask(int) firstTask}. */
    public static void nfirstTask(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandNV.FIRSTTASK, value); }

    // -----------------------------------

    /** An array of {@link VkDrawMeshTasksIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawMeshTasksIndirectCommandNV#SIZEOF}, and its mark will be undefined.
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
        protected VkDrawMeshTasksIndirectCommandNV newInstance(long address) {
            return new VkDrawMeshTasksIndirectCommandNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code taskCount} field. */
        @NativeType("uint32_t")
        public int taskCount() { return VkDrawMeshTasksIndirectCommandNV.ntaskCount(address()); }
        /** Returns the value of the {@code firstTask} field. */
        @NativeType("uint32_t")
        public int firstTask() { return VkDrawMeshTasksIndirectCommandNV.nfirstTask(address()); }

        /** Sets the specified value to the {@code taskCount} field. */
        public VkDrawMeshTasksIndirectCommandNV.Buffer taskCount(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.ntaskCount(address(), value); return this; }
        /** Sets the specified value to the {@code firstTask} field. */
        public VkDrawMeshTasksIndirectCommandNV.Buffer firstTask(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.nfirstTask(address(), value); return this; }

    }

}