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

import static org.lwjgl.vulkan.KHRDriverProperties.*;

/**
 * Structure containing driver identification information.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code driverID} <b>must</b> be immutable for a given driver across instances, processes, driver versions, and system reboots.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDriverProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkConformanceVersionKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension specific structure.</li>
 * <li>{@code driverID} &ndash; a unique identifier for the driver of the physical device.</li>
 * <li>{@code driverName} &ndash; a null-terminated UTF-8 string containing the name of the driver.</li>
 * <li>{@code driverInfo} &ndash; a null-terminated UTF-8 string containing additional information about the driver.</li>
 * <li>{@code conformanceVersion} &ndash; the version of the Vulkan conformance test this driver is conformant against (see {@link VkConformanceVersionKHR}).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDriverPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t driverID;
 *     char driverName[VK_MAX_DRIVER_NAME_SIZE_KHR];
 *     char driverInfo[VK_MAX_DRIVER_INFO_SIZE_KHR];
 *     {@link VkConformanceVersionKHR VkConformanceVersionKHR} conformanceVersion;
 * }</code></pre>
 */
public class VkPhysicalDeviceDriverPropertiesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRIVERID,
        DRIVERNAME,
        DRIVERINFO,
        CONFORMANCEVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DRIVER_NAME_SIZE_KHR),
            __array(1, VK_MAX_DRIVER_INFO_SIZE_KHR),
            __member(VkConformanceVersionKHR.SIZEOF, VkConformanceVersionKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRIVERID = layout.offsetof(2);
        DRIVERNAME = layout.offsetof(3);
        DRIVERINFO = layout.offsetof(4);
        CONFORMANCEVERSION = layout.offsetof(5);
    }

    VkPhysicalDeviceDriverPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceDriverPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDriverPropertiesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code driverID} field. */
    @NativeType("uint32_t")
    public int driverID() { return ndriverID(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code driverName} field. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE_KHR]")
    public ByteBuffer driverName() { return ndriverName(address()); }
    /** Decodes the null-terminated string stored in the {@code driverName} field. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE_KHR]")
    public String driverNameString() { return ndriverNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code driverInfo} field. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE_KHR]")
    public ByteBuffer driverInfo() { return ndriverInfo(address()); }
    /** Decodes the null-terminated string stored in the {@code driverInfo} field. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE_KHR]")
    public String driverInfoString() { return ndriverInfoString(address()); }
    /** Returns a {@link VkConformanceVersionKHR} view of the {@code conformanceVersion} field. */
    public VkConformanceVersionKHR conformanceVersion() { return nconformanceVersion(address()); }
    /** Passes the {@code conformanceVersion} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPhysicalDeviceDriverPropertiesKHR conformanceVersion(java.util.function.Consumer<VkConformanceVersionKHR> consumer) { consumer.accept(conformanceVersion()); return this; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDriverPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDriverPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDriverPropertiesKHR set(
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
    public VkPhysicalDeviceDriverPropertiesKHR set(VkPhysicalDeviceDriverPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceDriverPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDriverPropertiesKHR create(long address) {
        return new VkPhysicalDeviceDriverPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDriverPropertiesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceDriverPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDriverPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDriverPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDriverPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #driverID}. */
    public static int ndriverID(long struct) { return memGetInt(struct + VkPhysicalDeviceDriverPropertiesKHR.DRIVERID); }
    /** Unsafe version of {@link #driverName}. */
    public static ByteBuffer ndriverName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceDriverPropertiesKHR.DRIVERNAME, VK_MAX_DRIVER_NAME_SIZE_KHR); }
    /** Unsafe version of {@link #driverNameString}. */
    public static String ndriverNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceDriverPropertiesKHR.DRIVERNAME); }
    /** Unsafe version of {@link #driverInfo}. */
    public static ByteBuffer ndriverInfo(long struct) { return memByteBuffer(struct + VkPhysicalDeviceDriverPropertiesKHR.DRIVERINFO, VK_MAX_DRIVER_INFO_SIZE_KHR); }
    /** Unsafe version of {@link #driverInfoString}. */
    public static String ndriverInfoString(long struct) { return memUTF8(struct + VkPhysicalDeviceDriverPropertiesKHR.DRIVERINFO); }
    /** Unsafe version of {@link #conformanceVersion}. */
    public static VkConformanceVersionKHR nconformanceVersion(long struct) { return VkConformanceVersionKHR.create(struct + VkPhysicalDeviceDriverPropertiesKHR.CONFORMANCEVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDriverPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDriverPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDriverPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDriverPropertiesKHR, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceDriverPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDriverPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDriverPropertiesKHR newInstance(long address) {
            return new VkPhysicalDeviceDriverPropertiesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDriverPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDriverPropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code driverID} field. */
        @NativeType("uint32_t")
        public int driverID() { return VkPhysicalDeviceDriverPropertiesKHR.ndriverID(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE_KHR]")
        public ByteBuffer driverName() { return VkPhysicalDeviceDriverPropertiesKHR.ndriverName(address()); }
        /** Decodes the null-terminated string stored in the {@code driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE_KHR]")
        public String driverNameString() { return VkPhysicalDeviceDriverPropertiesKHR.ndriverNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE_KHR]")
        public ByteBuffer driverInfo() { return VkPhysicalDeviceDriverPropertiesKHR.ndriverInfo(address()); }
        /** Decodes the null-terminated string stored in the {@code driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE_KHR]")
        public String driverInfoString() { return VkPhysicalDeviceDriverPropertiesKHR.ndriverInfoString(address()); }
        /** Returns a {@link VkConformanceVersionKHR} view of the {@code conformanceVersion} field. */
        public VkConformanceVersionKHR conformanceVersion() { return VkPhysicalDeviceDriverPropertiesKHR.nconformanceVersion(address()); }
        /** Passes the {@code conformanceVersion} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceDriverPropertiesKHR.Buffer conformanceVersion(java.util.function.Consumer<VkConformanceVersionKHR> consumer) { consumer.accept(conformanceVersion()); return this; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDriverPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDriverPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDriverPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDriverPropertiesKHR.npNext(address(), value); return this; }

    }

}