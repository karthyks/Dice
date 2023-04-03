package com.karthyks.dice.coroutines.annotation

import javax.inject.Qualifier


@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Main

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Default

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class IO

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Immediate

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Test
