# TeacherTracking

## .editorconfig

add these lines in `.editorconfig`:

```editorconfig
root = true

[*.{kt,kts}]
charset = utf-8
indent_size = 4
indent_style = space
insert_final_newline = true
trim_trailing_whitespace = true
ij_kotlin_continuation_indent_size = 2
ij_kotlin_allow_trailing_comma = true
ij_kotlin_allow_trailing_comma_on_call_site = true
```

## code formatting (spotless)

add this line in `build.gradle.kts` in app:

```groovy
id("com.diffplug.spotless") version "7.0.0.BETA4"
```

then add these line in that file:

```groovy
spotless {
    kotlin {
        target("**/*.kt", "**/*.kts")
        targetExclude("$buildDir/**/*.kt", "bin/**/*.kt", "buildSrc/**/*.kt")
        ktlint()
    }
}
```

to apply code formating:

```shell
./gradlew spotlessApply
```

to check code formating:

```shell
./gradlew spotlessCheck
```

## Application Architecture

app
core
    util
data
    db
    api
    storage 
domain
features

