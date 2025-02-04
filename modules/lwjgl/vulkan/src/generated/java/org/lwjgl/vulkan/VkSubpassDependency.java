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
 * <p>If {@code srcSubpass} is equal to {@code dstSubpass} then the {@link VkSubpassDependency} describes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-barriers-subpass-self-dependencies">subpass self-dependency</a>, and only constrains the pipeline barriers allowed within a subpass instance. Otherwise, when a render pass instance which includes a subpass dependency is submitted to a queue, it defines a memory dependency between the subpasses identified by {@code srcSubpass} and {@code dstSubpass}.</p>
 * 
 * <p>If {@code srcSubpass} is equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than the {@link VK10#vkCmdBeginRenderPass CmdBeginRenderPass} used to begin the render pass instance. Otherwise, the first set of commands includes all commands submitted as part of the subpass instance identified by {@code srcSubpass} and any load, store or multisample resolve operations on attachments used in {@code srcSubpass}. In either case, the first synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}.</p>
 * 
 * <p>If {@code dstSubpass} is equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes commands that occur later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than the {@link VK10#vkCmdEndRenderPass CmdEndRenderPass} used to end the render pass instance. Otherwise, the second set of commands includes all commands submitted as part of the subpass instance identified by {@code dstSubpass} and any load, store or multisample resolve operations on attachments used in {@code dstSubpass}. In either case, the second synchronization scope is limited to operations on the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}.</p>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">source stage mask</a> specified by {@code srcStageMask}. It is also limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access in the pipeline stages determined by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">destination stage mask</a> specified by {@code dstStageMask}. It is also limited to access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}.</p>
 * 
 * <p>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-dependencies-available-and-visible">availability and visibility operations</a> defined by a subpass dependency affect the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#renderpass-layout-transitions">image layout transitions</a> within the render pass.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For non-attachment resources, the memory dependency expressed by subpass dependency is nearly identical to that of a {@link VkMemoryBarrier} (with matching {@code srcAccessMask}/{@code dstAccessMask} parameters) submitted as a part of a {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier} (with matching {@code srcStageMask}/{@code dstStageMask} parameters). The only difference being that its scopes are limited to the identified subpasses rather than potentially affecting everything before and after.</p>
 * 
 * <p>For attachments however, subpass dependencies work more like a {@link VkImageMemoryBarrier} defined similarly to the {@link VkMemoryBarrier} above, the queue family indices set to {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, and layouts as follows:</p>
 * 
 * <ul>
 * <li>The equivalent to {@code oldLayout} is the attachment&#8217;s layout according to the subpass description for {@code srcSubpass}.</li>
 * <li>The equivalent to {@code newLayout} is the attachment&#8217;s layout according to the subpass description for {@code dstSubpass}.</li>
 * </ul>
 * </div>
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
 * <li>If {@code srcSubpass} equals {@code dstSubpass}, and {@code srcStageMask} and {@code dstStageMask} both include a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-framebuffer-regions">framebuffer-space stage</a>, then {@code dependencyFlags} <b>must</b> include {@link VK10#VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}</li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, then both {@code srcSubpass} and {@code dstSubpass} <b>must</b> not equal {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, then the render pass <b>must</b> have multiview enabled</li>
 * <li>If {@code srcSubpass} equals {@code dstSubpass} and that subpass has more than one bit set in the view mask, then {@code dependencyFlags} <b>must</b> include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
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
 * <p>{@link VkRenderPassCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcSubpass} &ndash; the subpass index of the first subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>{@code dstSubpass} &ndash; the subpass index of the second subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>{@code srcStageMask} &ndash; a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">source stage mask</a>.</li>
 * <li>{@code dstStageMask} &ndash; a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">destination stage mask</a></li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>.</li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>.</li>
 * <li>{@code dependencyFlags} &ndash; a bitmask of {@code VkDependencyFlagBits}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDependency {
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 * }</code></pre>
 */
public class VkSubpassDependency extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCSUBPASS,
        DSTSUBPASS,
        SRCSTAGEMASK,
        DSTSTAGEMASK,
        SRCACCESSMASK,
        DSTACCESSMASK,
        DEPENDENCYFLAGS;

    static {
        Layout layout = __struct(
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

        SRCSUBPASS = layout.offsetof(0);
        DSTSUBPASS = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        DSTSTAGEMASK = layout.offsetof(3);
        SRCACCESSMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        DEPENDENCYFLAGS = layout.offsetof(6);
    }

    VkSubpassDependency(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSubpassDependency} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDependency(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

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

    /** Sets the specified value to the {@code srcSubpass} field. */
    public VkSubpassDependency srcSubpass(@NativeType("uint32_t") int value) { nsrcSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code dstSubpass} field. */
    public VkSubpassDependency dstSubpass(@NativeType("uint32_t") int value) { ndstSubpass(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkSubpassDependency srcStageMask(@NativeType("VkPipelineStageFlags") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkSubpassDependency dstStageMask(@NativeType("VkPipelineStageFlags") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkSubpassDependency srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkSubpassDependency dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    public VkSubpassDependency dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDependency set(
        int srcSubpass,
        int dstSubpass,
        int srcStageMask,
        int dstStageMask,
        int srcAccessMask,
        int dstAccessMask,
        int dependencyFlags
    ) {
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDependency set(VkSubpassDependency src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDependency create() {
        return new VkSubpassDependency(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSubpassDependency} instance for the specified memory address. */
    public static VkSubpassDependency create(long address) {
        return new VkSubpassDependency(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSubpassDependency.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSubpassDependency} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassDependency mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSubpassDependency} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassDependency callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcSubpass}. */
    public static int nsrcSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSUBPASS); }
    /** Unsafe version of {@link #dstSubpass}. */
    public static int ndstSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSUBPASS); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static int nsrcStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSTAGEMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static int ndstStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTACCESSMASK); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return memGetInt(struct + VkSubpassDependency.DEPENDENCYFLAGS); }

    /** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
    public static void nsrcSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSUBPASS, value); }
    /** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
    public static void ndstSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSUBPASS, value); }
    /** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
    public static void nsrcStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
    public static void ndstStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkSubpassDependency.DEPENDENCYFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassDependency} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDependency, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSubpassDependency.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDependency#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDependency newInstance(long address) {
            return new VkSubpassDependency(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code srcSubpass} field. */
        @NativeType("uint32_t")
        public int srcSubpass() { return VkSubpassDependency.nsrcSubpass(address()); }
        /** Returns the value of the {@code dstSubpass} field. */
        @NativeType("uint32_t")
        public int dstSubpass() { return VkSubpassDependency.ndstSubpass(address()); }
        /** Returns the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() { return VkSubpassDependency.nsrcStageMask(address()); }
        /** Returns the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() { return VkSubpassDependency.ndstStageMask(address()); }
        /** Returns the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkSubpassDependency.nsrcAccessMask(address()); }
        /** Returns the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkSubpassDependency.ndstAccessMask(address()); }
        /** Returns the value of the {@code dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkSubpassDependency.ndependencyFlags(address()); }

        /** Sets the specified value to the {@code srcSubpass} field. */
        public VkSubpassDependency.Buffer srcSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency.nsrcSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code dstSubpass} field. */
        public VkSubpassDependency.Buffer dstSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency.ndstSubpass(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkSubpassDependency.Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkSubpassDependency.Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkSubpassDependency.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkSubpassDependency.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        public VkSubpassDependency.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkSubpassDependency.ndependencyFlags(address(), value); return this; }

    }

}