package com.guyuuan.router.processor

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

/**
 * @author: Chen
 * @createTime: 6/12/24 18:18
 * @description:
 **/
interface ProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return DestinationAnnotationProcessor(
            environment.codeGenerator,
            environment.logger,
            environment.options
        )
    }
}