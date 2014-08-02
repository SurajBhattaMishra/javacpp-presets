/*
 * Copyright (C) 2014 Samuel Audet
 *
 * This file is part of JavaCPP.
 *
 * JavaCPP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version (subject to the "Classpath" exception
 * as provided in the LICENSE.txt file that accompanied this code).
 *
 * JavaCPP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaCPP.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(target="org.bytedeco.javacpp.LLVM", value={@Platform(not={"android", "windows"}, define={"__STDC_LIMIT_MACROS", "__STDC_CONSTANT_MACROS"},
    include={"<llvm-c/Core.h>", "<llvm-c/Analysis.h>", "<llvm-c/BitReader.h>", "<llvm-c/BitWriter.h>", "<llvm-c/Disassembler.h>",
             "<llvm-c/Initialization.h>", "<llvm-c/IRReader.h>", "<llvm-c/Linker.h>", "<llvm-c/LinkTimeOptimizer.h>", "<llvm-c/lto.h>",
             "<llvm-c/Object.h>", "<llvm-c/Support.h>", "<llvm-c/Target.h>", "<llvm-c/TargetMachine.h>", "<llvm-c/ExecutionEngine.h>",
             "<llvm-c/Transforms/IPO.h>", "<llvm-c/Transforms/PassManagerBuilder.h>", "<llvm-c/Transforms/Scalar.h>", "<llvm-c/Transforms/Vectorize.h>"},
    link={"LLVM-3.4", "LTO"}) })
public class LLVM implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("LLVMOpaqueContext").pointerTypes("LLVMContextRef"))
               .put(new Info("LLVMOpaqueModule").pointerTypes("LLVMModuleRef"))
               .put(new Info("LLVMOpaqueType").pointerTypes("LLVMTypeRef"))
               .put(new Info("LLVMOpaqueValue").pointerTypes("LLVMValueRef"))
               .put(new Info("LLVMOpaqueBasicBlock").pointerTypes("LLVMBasicBlockRef"))
               .put(new Info("LLVMOpaqueBuilder").pointerTypes("LLVMBuilderRef"))
               .put(new Info("LLVMOpaqueModuleProvider").pointerTypes("LLVMModuleProviderRef"))
               .put(new Info("LLVMOpaqueMemoryBuffer").pointerTypes("LLVMMemoryBufferRef"))
               .put(new Info("LLVMOpaquePassManager").pointerTypes("LLVMPassManagerRef"))
               .put(new Info("LLVMOpaquePassRegistry").pointerTypes("LLVMPassRegistryRef"))
               .put(new Info("LLVMOpaqueUse").pointerTypes("LLVMUseRef"))
               .put(new Info("LLVMOpaqueTargetData").pointerTypes("LLVMTargetDataRef"))
               .put(new Info("LLVMOpaqueTargetLibraryInfotData").pointerTypes("LLVMTargetLibraryInfoRef"))
               .put(new Info("LLVMOpaqueTargetMachine").pointerTypes("LLVMTargetMachineRef"))
               .put(new Info("LLVMTarget").pointerTypes("LLVMTargetRef"))
               .put(new Info("LLVMOpaqueGenericValue").pointerTypes("LLVMGenericValueRef"))
               .put(new Info("LLVMOpaqueExecutionEngine").pointerTypes("LLVMExecutionEngineRef"))
               .put(new Info("LLVMOpaqueMCJITMemoryManager").pointerTypes("LLVMMCJITMemoryManagerRef"))
               .put(new Info("LTOModule").pointerTypes("lto_module_t"))
               .put(new Info("LTOCodeGenerator").pointerTypes("lto_code_gen_t"))
               .put(new Info("LLVMOpaqueObjectFile").pointerTypes("LLVMObjectFileRef"))
               .put(new Info("LLVMOpaqueSectionIterator").pointerTypes("LLVMSectionIteratorRef"))
               .put(new Info("LLVMOpaqueSymbolIterator").pointerTypes("LLVMSymbolIteratorRef"))
               .put(new Info("LLVMOpaqueRelocationIterator").pointerTypes("LLVMRelocationIteratorRef"))
               .put(new Info("LLVMOpaquePassManagerBuilder").pointerTypes("LLVMPassManagerBuilderRef"))

               .put(new Info("LLVMContextRef").valueTypes("LLVMContextRef").pointerTypes("@ByPtrPtr LLVMContextRef", "@Cast(\"LLVMContextRef*\") PointerPointer"))
               .put(new Info("LLVMModuleRef").valueTypes("LLVMModuleRef").pointerTypes("@ByPtrPtr LLVMModuleRef", "@Cast(\"LLVMModuleRef*\") PointerPointer"))
               .put(new Info("LLVMTypeRef").valueTypes("LLVMTypeRef").pointerTypes("@ByPtrPtr LLVMTypeRef", "@Cast(\"LLVMTypeRef*\") PointerPointer"))
               .put(new Info("LLVMValueRef").valueTypes("LLVMValueRef").pointerTypes("@ByPtrPtr LLVMValueRef", "@Cast(\"LLVMValueRef*\") PointerPointer"))
               .put(new Info("LLVMBasicBlockRef").valueTypes("LLVMBasicBlockRef").pointerTypes("@ByPtrPtr LLVMBasicBlockRef", "@Cast(\"LLVMBasicBlockRef*\") PointerPointer"))
               .put(new Info("LLVMBuilderRef").valueTypes("LLVMBuilderRef").pointerTypes("@ByPtrPtr LLVMBuilderRef", "@Cast(\"LLVMBuilderRef*\") PointerPointer"))
               .put(new Info("LLVMModuleProviderRef").valueTypes("LLVMModuleProviderRef").pointerTypes("@ByPtrPtr LLVMModuleProviderRef", "@Cast(\"LLVMModuleProviderRef*\") PointerPointer"))
               .put(new Info("LLVMMemoryBufferRef").valueTypes("LLVMMemoryBufferRef").pointerTypes("@ByPtrPtr LLVMMemoryBufferRef", "@Cast(\"LLVMMemoryBufferRef*\") PointerPointer"))
               .put(new Info("LLVMPassManagerRef").valueTypes("LLVMPassManagerRef").pointerTypes("@ByPtrPtr LLVMPassManagerRef", "@Cast(\"LLVMPassManagerRef*\") PointerPointer"))
               .put(new Info("LLVMPassRegistryRef").valueTypes("LLVMPassRegistryRef").pointerTypes("@ByPtrPtr LLVMPassRegistryRef", "@Cast(\"LLVMPassRegistryRef*\") PointerPointer"))
               .put(new Info("LLVMUseRef").valueTypes("LLVMUseRef").pointerTypes("@ByPtrPtr LLVMUseRef", "@Cast(\"LLVMUseRef*\") PointerPointer"))
               .put(new Info("LLVMTargetDataRef").valueTypes("LLVMTargetDataRef").pointerTypes("@ByPtrPtr LLVMTargetDataRef", "@Cast(\"LLVMTargetDataRef*\") PointerPointer"))
               .put(new Info("LLVMTargetLibraryInfoRef").valueTypes("LLVMTargetLibraryInfoRef").pointerTypes("@ByPtrPtr LLVMTargetLibraryInfoRef", "@Cast(\"LLVMTargetLibraryInfoRef*\") PointerPointer"))
               .put(new Info("LLVMTargetMachineRef").valueTypes("LLVMTargetMachineRef").pointerTypes("@ByPtrPtr LLVMTargetMachineRef", "@Cast(\"LLVMTargetMachineRef*\") PointerPointer"))
               .put(new Info("LLVMTargetRef").valueTypes("LLVMTargetRef").pointerTypes("@ByPtrPtr LLVMTargetRef", "@Cast(\"LLVMTargetRef*\") PointerPointer"))
               .put(new Info("LLVMGenericValueRef").valueTypes("LLVMGenericValueRef").pointerTypes("@ByPtrPtr LLVMGenericValueRef", "@Cast(\"LLVMGenericValueRef*\") PointerPointer"))
               .put(new Info("LLVMExecutionEngineRef").valueTypes("LLVMExecutionEngineRef").pointerTypes("@ByPtrPtr LLVMExecutionEngineRef", "@Cast(\"LLVMExecutionEngineRef*\") PointerPointer"))
               .put(new Info("LLVMMCJITMemoryManagerRef").valueTypes("LLVMMCJITMemoryManagerRef").pointerTypes("@ByPtrPtr LLVMMCJITMemoryManagerRef", "@Cast(\"LLVMMCJITMemoryManagerRef*\") PointerPointer"))
               .put(new Info("lto_module_t").valueTypes("lto_module_t").pointerTypes("@ByPtrPtr lto_module_t", "@Cast(\"lto_module_t*\") PointerPointer"))
               .put(new Info("lto_code_gen_t").valueTypes("lto_code_gen_t").pointerTypes("@ByPtrPtr lto_code_gen_t", "@Cast(\"lto_code_gen_t*\") PointerPointer"))
               .put(new Info("LLVMObjectFileRef").valueTypes("LLVMObjectFileRef").pointerTypes("@ByPtrPtr LLVMObjectFileRef", "@Cast(\"LLVMObjectFileRef*\") PointerPointer"))
               .put(new Info("LLVMSectionIteratorRef").valueTypes("LLVMSectionIteratorRef").pointerTypes("@ByPtrPtr LLVMSectionIteratorRef", "@Cast(\"LLVMSectionIteratorRef*\") PointerPointer"))
               .put(new Info("LLVMSymbolIteratorRef").valueTypes("LLVMSymbolIteratorRef").pointerTypes("@ByPtrPtr LLVMSymbolIteratorRef", "@Cast(\"LLVMSymbolIteratorRef*\") PointerPointer"))
               .put(new Info("LLVMRelocationIteratorRef").valueTypes("LLVMRelocationIteratorRef").pointerTypes("@ByPtrPtr LLVMRelocationIteratorRef", "@Cast(\"LLVMRelocationIteratorRef*\") PointerPointer"))
               .put(new Info("LLVMPassManagerBuilderRef").valueTypes("LLVMPassManagerBuilderRef").pointerTypes("@ByPtrPtr LLVMPassManagerBuilderRef", "@Cast(\"LLVMPassManagerBuilderRef*\") PointerPointer"))

               .put(new Info("defined(_MSC_VER) && !defined(inline)").define(false))
               .put(new Info("llvm_optimize_modules", "llvm_destroy_optimizer", "llvm_read_object_file", "llvm_create_optimizer").skip());
    }
}
