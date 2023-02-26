package app.revanced.patches.youtube.misc.litho.filter.annotation

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.google.android.youtube", arrayOf("17.49.37", "18.03.36")
    )]
)
@Target(AnnotationTarget.CLASS)
internal annotation class LithoFilterCompatibility

