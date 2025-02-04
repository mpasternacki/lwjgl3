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
 * Structure specifying a subpass dependency.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkSubpassDependency} have the identical effect to those parameters.</p>
 * 
 * <p>{@code viewOffset} has the same effect for the described subpass dependency as {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewOffsets} has on each corresponding subpass dependency.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, {@code srcStageMask} <b>must</b> not include {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</li>
 * <li>If {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, {@code dstStageMask} <b>must</b> not include {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>{@code srcSubpass} <b>must</b> be less than or equal to {@code dstSubpass}, unless one of them is {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, to avoid cyclic dependencies and ensure a valid execution order</li>
 * <li>{@code srcSubpass} and {@code dstSubpass} <b>must</b> not both be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} <b>must</b> not set any bits that are neither {@link VK10#VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}, nor one of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-types">graphics pipeline stages</a></li>
 * <li>If {@code srcSubpass} is equal to {@code dstSubpass} and not all of the stages in {@code srcStageMask} and {@code dstStageMask} are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-framebuffer-regions">framebuffer-space stages</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earliest</a> pipeline stage in {@code dstStageMask}</li>
 * <li>Any access flag included in {@code srcAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-types-supported">table of supported access types</a></li>
 * <li>Any access flag included in {@code dstAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-types-supported">table of supported access types</a></li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code srcSubpass} <b>must</b> not be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code dstSubpass} <b>must</b> not be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code srcSubpass} equals {@code dstSubpass}, and {@code srcStageMask} and {@code dstStageMask} both include a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-framebuffer-regions">framebuffer-space stage</a>, then {@code dependencyFlags} <b>must</b> include {@link VK10#VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}</li>
 * <li>If {@code dependencyFlags} does not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code viewOffset} <b>must</b> be 0</li>
 * <li>If {@code viewOffset} is not 0, {@code srcSubpass} <b>must</b> not be equal to {@code dstSubpass}.</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCreateRenderpass2#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2_KHR}</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code srcStageMask} <b>must</b> not be 0</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code dstStageMask} <b>must</b> not be 0</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcSubpass} &ndash; the subpass index of the first subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>{@code dstSubpass} &ndash; the subpass index of the second subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>{@code srcStageMask} &ndash; a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">source stage mask</a>.</li>
 * <li>{@code dstStageMask} &ndash; a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">destination stage mask</a></li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>.</li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>.</li>
 * <li>{@code dependencyFlags} &ndash; a bitmask of {@code VkDependencyFlagBits}.</li>
 * <li>{@code viewOffset} &ndash; controls which views in the source subpass the views in the destination subpass depend on.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDependency2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 *     int32_t viewOffset;
 * }</code></pre>
 */
public class VkSubpassDependency2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBPASS,
        DSTSUBPASS,
        SRCSTAGEMASK,
        DSTSTAGEMASK,
        SRCACCESSMASK,
        DSTACCESSMASK,
        DEPENDENCYFLAGS,
        VIEWOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBPASS = layout.offsetof(2);
        DSTSUBPASS = layout.offsetof(3);
        SRCSTAGEMASK = layout.offsetof(4);
        DSTSTAGEMASK = layout.offsetof(5);
        SRCACCESSMASK = layout.offsetof(6);
        DSTACCESSMASK = layout.offsetof(7);
        DEPENDENCYFLAGS = layout.offsetof(8);
        VIEWOFFSET = layout.offsetof(9);
    }

    VkSubpassDependency2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSubpassDependency2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDependency2KHR(ByteBuffer container) {
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
    /** Returns the value of the {@code srcSubpass} field. */
    @NativeType("uint32_t")
    public int srcSubpass() { return nsrcSubpass(address()); }
    /** Returns the value of the {@code dstSubpass} field. */
    @NativeType("uint32_t")
    public int dstSubpass() { return ndstSubpass(address()); }
    /** Returns the value of the {@code srcStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int srcStageMask() { return nsrcStageMask(address()); }
    /** Returns the value of the {@code dstStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int dstStageMask() { return ndstStageMask(address()); }
    /** Returns the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** Returns the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** Returns the value of the {@code dependencyFlags} field. */
    @NativeType("VkDependencyFlags")
    public int dependencyFlags() { return ndependencyFlags(address()); }
    /** Returns the value of the {@code viewOffset} field. */
    @NativeType("int32_t")
    public int viewOffset() { return nviewOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDependency2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDependency2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcSubpass} field. */
    public VkSubpassDependency2KHR srcSubpass(@NativeType("uint32_t") int value) { nsrcSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code dstSubpass} field. */
    public VkSubpassDependency2KHR dstSubpass(@NativeType("uint32_t") int value) { ndstSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkSubpassDependency2KHR srcStageMask(@NativeType("VkPipelineStageFlags") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkSubpassDependency2KHR dstStageMask(@NativeType("VkPipelineStageFlags") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkSubpassDependency2KHR srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkSubpassDependency2KHR dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    public VkSubpassDependency2KHR dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the specified value to the {@code viewOffset} field. */
    public VkSubpassDependency2KHR viewOffset(@NativeType("int32_t") int value) { nviewOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDependency2KHR set(
        int sType,
        long pNext,
        int srcSubpass,
        int dstSubpass,
        int srcStageMask,
        int dstStageMask,
        int srcAccessMask,
        int dstAccessMask,
        int dependencyFlags,
        int viewOffset
    ) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDependency2KHR set(VkSubpassDependency2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDependency2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2KHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2KHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDependency2KHR create() {
        return new VkSubpassDependency2KHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency2KHR} instance for the specified memory address. */
    public static VkSubpassDependency2KHR create(long address) {
        return new VkSubpassDependency2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2KHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSubpassDependency2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDependency2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassDependency2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSubpassDependency2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassDependency2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2KHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2KHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDependency2KHR.PNEXT); }
    /** Unsafe version of {@link #srcSubpass}. */
    public static int nsrcSubpass(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.SRCSUBPASS); }
    /** Unsafe version of {@link #dstSubpass}. */
    public static int ndstSubpass(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.DSTSUBPASS); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static int nsrcStageMask(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.SRCSTAGEMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static int ndstStageMask(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.DSTSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.DSTACCESSMASK); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #viewOffset}. */
    public static int nviewOffset(long struct) { return memGetInt(struct + VkSubpassDependency2KHR.VIEWOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDependency2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
    public static void nsrcSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.SRCSUBPASS, value); }
    /** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
    public static void ndstSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.DSTSUBPASS, value); }
    /** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
    public static void nsrcStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
    public static void ndstStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.DEPENDENCYFLAGS, value); }
    /** Unsafe version of {@link #viewOffset(int) viewOffset}. */
    public static void nviewOffset(long struct, int value) { memPutInt(struct + VkSubpassDependency2KHR.VIEWOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassDependency2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDependency2KHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSubpassDependency2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDependency2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDependency2KHR newInstance(long address) {
            return new VkSubpassDependency2KHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDependency2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDependency2KHR.npNext(address()); }
        /** Returns the value of the {@code srcSubpass} field. */
        @NativeType("uint32_t")
        public int srcSubpass() { return VkSubpassDependency2KHR.nsrcSubpass(address()); }
        /** Returns the value of the {@code dstSubpass} field. */
        @NativeType("uint32_t")
        public int dstSubpass() { return VkSubpassDependency2KHR.ndstSubpass(address()); }
        /** Returns the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() { return VkSubpassDependency2KHR.nsrcStageMask(address()); }
        /** Returns the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() { return VkSubpassDependency2KHR.ndstStageMask(address()); }
        /** Returns the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkSubpassDependency2KHR.nsrcAccessMask(address()); }
        /** Returns the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkSubpassDependency2KHR.ndstAccessMask(address()); }
        /** Returns the value of the {@code dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkSubpassDependency2KHR.ndependencyFlags(address()); }
        /** Returns the value of the {@code viewOffset} field. */
        @NativeType("int32_t")
        public int viewOffset() { return VkSubpassDependency2KHR.nviewOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDependency2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDependency2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDependency2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDependency2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcSubpass} field. */
        public VkSubpassDependency2KHR.Buffer srcSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2KHR.nsrcSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code dstSubpass} field. */
        public VkSubpassDependency2KHR.Buffer dstSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2KHR.ndstSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkSubpassDependency2KHR.Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2KHR.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkSubpassDependency2KHR.Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2KHR.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkSubpassDependency2KHR.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2KHR.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkSubpassDependency2KHR.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2KHR.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        public VkSubpassDependency2KHR.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkSubpassDependency2KHR.ndependencyFlags(address(), value); return this; }
        /** Sets the specified value to the {@code viewOffset} field. */
        public VkSubpassDependency2KHR.Buffer viewOffset(@NativeType("int32_t") int value) { VkSubpassDependency2KHR.nviewOffset(address(), value); return this; }

    }

}