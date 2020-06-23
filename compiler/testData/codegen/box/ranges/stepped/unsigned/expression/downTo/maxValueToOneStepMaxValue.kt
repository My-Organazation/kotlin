// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = UInt.MAX_VALUE downTo 1u
    for (i in uintProgression step Int.MAX_VALUE) {
        uintList += i
    }
    assertEquals(listOf(UInt.MAX_VALUE, 2147483648u, 1u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = ULong.MAX_VALUE downTo 1uL
    for (i in ulongProgression step Long.MAX_VALUE) {
        ulongList += i
    }
    assertEquals(listOf(ULong.MAX_VALUE, 9223372036854775808uL, 1uL), ulongList)

    return "OK"
}