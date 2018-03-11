package com.sxtanna.korm.data.custom

import com.sxtanna.korm.base.KormCodec
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class KormCustomCodec(val codec: KClass<out KormCodec<out Any>>)