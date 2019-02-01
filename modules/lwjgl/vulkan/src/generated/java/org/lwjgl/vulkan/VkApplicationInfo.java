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
 * Structure specifying application info.
 * 
 * <h5>Description</h5>
 * 
 * <p>Vulkan 1.0 implementations were required to return {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER} if {@code apiVersion} was larger than 1.0. Implementations that support Vulkan 1.1 or later <b>must</b> not return {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER} for any value of {@code apiVersion}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Because Vulkan 1.0 implementations <b>may</b> fail with {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER}, applications <b>should</b> determine the version of Vulkan available before calling {@link VK10#vkCreateInstance CreateInstance}. If the {@link VK10#vkGetInstanceProcAddr GetInstanceProcAddr} returns {@code NULL} for {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion}, it is a Vulkan 1.0 implementation. Otherwise, the application <b>can</b> call {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion} to determine the version of Vulkan.</p>
 * </div>
 * 
 * <p>Implicit layers <b>must</b> be disabled if they do not support a version at least as high as {@code apiVersion}. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#LoaderAndLayerInterface">Vulkan Loader Specification and Architecture Overview</a> document for additional information.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Providing a {@code NULL} {@link VkInstanceCreateInfo}{@code ::pApplicationInfo} or providing an {@code apiVersion} of 0 is equivalent to providing an {@code apiVersion} of {@code VK_MAKE_VERSION(1,0,0)}.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pApplicationName} is not {@code NULL}, {@code pApplicationName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>If {@code pEngineName} is not {@code NULL}, {@code pEngineName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkInstanceCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pApplicationName} &ndash; {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the application.</li>
 * <li>{@code applicationVersion} &ndash; an unsigned integer variable containing the developer-supplied version number of the application.</li>
 * <li>{@code pEngineName} &ndash; {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the engine (if any) used to create the application.</li>
 * <li>{@code engineVersion} &ndash; an unsigned integer variable containing the developer-supplied version number of the engine used to create the application.</li>
 * <li>{@code apiVersion} &ndash; <b>must</b> be the highest version of Vulkan that the application is designed to use, encoded as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#fundamentals-versionnum">API Version Numbers and Semantics</a> section. The patch version number specified in {@code apiVersion} is ignored when creating an instance object. Only the major and minor versions of the instance <b>must</b> match those requested in {@code apiVersion}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkApplicationInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pApplicationName;
 *     uint32_t applicationVersion;
 *     char const * pEngineName;
 *     uint32_t engineVersion;
 *     uint32_t apiVersion;
 * }</code></pre>
 */
public class VkApplicationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PAPPLICATIONNAME,
        APPLICATIONVERSION,
        PENGINENAME,
        ENGINEVERSION,
        APIVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PAPPLICATIONNAME = layout.offsetof(2);
        APPLICATIONVERSION = layout.offsetof(3);
        PENGINENAME = layout.offsetof(4);
        ENGINEVERSION = layout.offsetof(5);
        APIVERSION = layout.offsetof(6);
    }

    /**
     * Creates a {@link VkApplicationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkApplicationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pApplicationName() { return npApplicationName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pApplicationName} field. */
    @Nullable
    @NativeType("char const *")
    public String pApplicationNameString() { return npApplicationNameString(address()); }
    /** Returns the value of the {@code applicationVersion} field. */
    @NativeType("uint32_t")
    public int applicationVersion() { return napplicationVersion(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pEngineName() { return npEngineName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pEngineName} field. */
    @Nullable
    @NativeType("char const *")
    public String pEngineNameString() { return npEngineNameString(address()); }
    /** Returns the value of the {@code engineVersion} field. */
    @NativeType("uint32_t")
    public int engineVersion() { return nengineVersion(address()); }
    /** Returns the value of the {@code apiVersion} field. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkApplicationInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkApplicationInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
    public VkApplicationInfo pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { npApplicationName(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVersion} field. */
    public VkApplicationInfo applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pEngineName} field. */
    public VkApplicationInfo pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { npEngineName(address(), value); return this; }
    /** Sets the specified value to the {@code engineVersion} field. */
    public VkApplicationInfo engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@code apiVersion} field. */
    public VkApplicationInfo apiVersion(@NativeType("uint32_t") int value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkApplicationInfo set(
        int sType,
        long pNext,
        @Nullable ByteBuffer pApplicationName,
        int applicationVersion,
        @Nullable ByteBuffer pEngineName,
        int engineVersion,
        int apiVersion
    ) {
        sType(sType);
        pNext(pNext);
        pApplicationName(pApplicationName);
        applicationVersion(applicationVersion);
        pEngineName(pEngineName);
        engineVersion(engineVersion);
        apiVersion(apiVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkApplicationInfo set(VkApplicationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkApplicationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo malloc() {
        return wrap(VkApplicationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkApplicationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo calloc() {
        return wrap(VkApplicationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkApplicationInfo} instance allocated with {@link BufferUtils}. */
    public static VkApplicationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkApplicationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@link VkApplicationInfo} instance for the specified memory address. */
    public static VkApplicationInfo create(long address) {
        return wrap(VkApplicationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkApplicationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkApplicationInfo.class, address);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkApplicationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkApplicationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkApplicationInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkApplicationInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkApplicationInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkApplicationInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkApplicationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo mallocStack(MemoryStack stack) {
        return wrap(VkApplicationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkApplicationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo callocStack(MemoryStack stack) {
        return wrap(VkApplicationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkApplicationInfo.PNEXT); }
    /** Unsafe version of {@link #pApplicationName}. */
    @Nullable public static ByteBuffer npApplicationName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #pApplicationNameString}. */
    @Nullable public static String npApplicationNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #applicationVersion}. */
    public static int napplicationVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.APPLICATIONVERSION); }
    /** Unsafe version of {@link #pEngineName}. */
    @Nullable public static ByteBuffer npEngineName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #pEngineNameString}. */
    @Nullable public static String npEngineNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #engineVersion}. */
    public static int nengineVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.ENGINEVERSION); }
    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.APIVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkApplicationInfo.PNEXT, value); }
    /** Unsafe version of {@link #pApplicationName(ByteBuffer) pApplicationName}. */
    public static void npApplicationName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PAPPLICATIONNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
    public static void napplicationVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.APPLICATIONVERSION, value); }
    /** Unsafe version of {@link #pEngineName(ByteBuffer) pEngineName}. */
    public static void npEngineName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PENGINENAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #engineVersion(int) engineVersion}. */
    public static void nengineVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.ENGINEVERSION, value); }
    /** Unsafe version of {@link #apiVersion(int) apiVersion}. */
    public static void napiVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.APIVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkApplicationInfo} structs. */
    public static class Buffer extends StructBuffer<VkApplicationInfo, Buffer> implements NativeResource {

        private static final VkApplicationInfo ELEMENT_FACTORY = VkApplicationInfo.create(-1L);

        /**
         * Creates a new {@link VkApplicationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkApplicationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkApplicationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkApplicationInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkApplicationInfo.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pApplicationName() { return VkApplicationInfo.npApplicationName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pApplicationName} field. */
        @Nullable
        @NativeType("char const *")
        public String pApplicationNameString() { return VkApplicationInfo.npApplicationNameString(address()); }
        /** Returns the value of the {@code applicationVersion} field. */
        @NativeType("uint32_t")
        public int applicationVersion() { return VkApplicationInfo.napplicationVersion(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pEngineName() { return VkApplicationInfo.npEngineName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pEngineName} field. */
        @Nullable
        @NativeType("char const *")
        public String pEngineNameString() { return VkApplicationInfo.npEngineNameString(address()); }
        /** Returns the value of the {@code engineVersion} field. */
        @NativeType("uint32_t")
        public int engineVersion() { return VkApplicationInfo.nengineVersion(address()); }
        /** Returns the value of the {@code apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkApplicationInfo.napiVersion(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkApplicationInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkApplicationInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkApplicationInfo.Buffer pNext(@NativeType("void const *") long value) { VkApplicationInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
        public VkApplicationInfo.Buffer pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npApplicationName(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVersion} field. */
        public VkApplicationInfo.Buffer applicationVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napplicationVersion(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pEngineName} field. */
        public VkApplicationInfo.Buffer pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npEngineName(address(), value); return this; }
        /** Sets the specified value to the {@code engineVersion} field. */
        public VkApplicationInfo.Buffer engineVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@code apiVersion} field. */
        public VkApplicationInfo.Buffer apiVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napiVersion(address(), value); return this; }

    }

}