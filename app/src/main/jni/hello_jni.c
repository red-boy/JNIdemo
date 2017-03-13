//
// Created by CXY on 2017/3/13.
//
#include <com_example_cxy_jnidemo_HelloWorld.h>
JNIEXPORT jstring JNICALL Java_com_example_cxy_jnidemo_HelloWorld_helloWorld
(JNIEnv *env, jclass jobj) {
    return (*env)->NewStringUTF(env,"HelloWorld 我是用jni调用出来的字符串");
}

