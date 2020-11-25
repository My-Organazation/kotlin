/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.noarg

import org.jetbrains.kotlin.codegen.AbstractBlackBoxCodegenTest
import org.jetbrains.kotlin.noarg.AbstractBytecodeListingTestForNoArg.Companion.NOARG_ANNOTATIONS

abstract class AbstractBlackBoxCodegenTestForNoArg : AbstractBlackBoxCodegenTest() {
    override fun loadMultiFiles(files: MutableList<TestFile>) {
        NoArgComponentRegistrar.registerNoargComponents(
            myEnvironment.project,
            NOARG_ANNOTATIONS,
            files.any { it.directives.contains("INVOKE_INITIALIZERS") },
        )

        super.loadMultiFiles(files)
    }
}
