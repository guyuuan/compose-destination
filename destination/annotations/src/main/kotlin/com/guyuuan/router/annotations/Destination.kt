package com.guyuuan.router.annotations

import kotlin.reflect.KClass

/**
 * @author: Chen
 * @createTime: 6/12/24 17:45
 * @description:
 **/

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class Destination(
    val route: String = DEFAULT_ROUTE_NAME,
    val start: Boolean = false,
    val navArgs:KClass<*> = Nothing::class,
) {
    companion object {
        const val DEFAULT_ROUTE_NAME = "guyuuan.route@"
    }
}
