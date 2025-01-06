package com.rk.extension

import android.content.Context
import java.io.File

val Context.pluginDir:File get() {return File(filesDir.parentFile!!,"local/plugins").also { if (it.exists().not()){it.mkdirs()} }}
val Context.pluginCodeDir:File get() {return File(pluginDir,"code").also { if (it.exists().not()){it.mkdirs()} }}

