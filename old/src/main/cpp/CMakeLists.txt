
cmake_minimum_required(VERSION 3.18.1)

project("old")

add_library( # Specifies the name of the library.
        old

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        old-lib.cpp)

find_library( # Defines the name of the path variable that stores the
        # location of the NDK library.
        log-lib

        # Specifies the name of the NDK library that
        # CMake needs to locate.
        log )

target_link_libraries( # Specifies the target library.
        old

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib})