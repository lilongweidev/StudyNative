#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_llw_old_MainActivity_oldString(JNIEnv *env, jobject thiz) {
    std::string result = "This old project used C++";
    return env->NewStringUTF(result.c_str());
}