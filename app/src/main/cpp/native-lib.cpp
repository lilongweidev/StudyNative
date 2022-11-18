#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring
Java_com_llw_studynative_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_llw_studynative_MainActivity_testFromJNI(JNIEnv *env, jobject thiz) {
    std::string test = "Hello from C++ Test Function";
    return env->NewStringUTF(test.c_str());
}