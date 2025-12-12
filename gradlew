#!/usr/bin/env sh
##############################################################################
##
##  Gradle start up script for POSIX systems
##
##############################################################################

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS.
# DEFAULT_JVM_OPTS=""

APP_NAME="Gradle"
APP_BASE_NAME="gradle"

# Resolve links - $0 may be a softlink
PRG="$0"

# Need this for relative symlinks.
while [ -h "$PRG" ] ; do
    ls=`ls -ld "$PRG"`
    link=`expr "$ls" : ".*-> \(.*\)$"`
    if expr "$link" : "/.*" > /dev/null; then
        PRG="$link"
    else
        PRG="`dirname "$PRG"`/$link"
    fi
done
SCRIPT_DIR=`dirname "$PRG"`
SCRIPT_NAME=`basename "$PRG"`

# Check for required files
GRADLE_JAR="$SCRIPT_DIR/gradle/wrapper/gradle-wrapper.jar"
if [ ! -f "$GRADLE_JAR" ]; then
    echo "The required file $GRADLE_JAR is missing."
    echo "Attempting to download it automatically..."
    # Fallback to simple download using wget if the wrapper code is missing
    mkdir -p "$SCRIPT_DIR/gradle/wrapper"
    WGET_CMD="wget -q --no-check-certificate https://repo1.maven.org/maven2/org/gradle/gradle-wrapper/8.8/gradle-wrapper-8.8.jar -O $GRADLE_JAR"
    
    if command -v curl >/dev/null 2>&1; then
        CURL_CMD="curl -s -L --fail https://repo1.maven.org/maven2/org/gradle/gradle-wrapper/8.8/gradle-wrapper-8.8.jar -o $GRADLE_JAR"
        eval "$CURL_CMD"
    elif command -v wget >/dev/null 2>&1; then
        eval "$WGET_CMD"
    else
        echo "Error: Neither curl nor wget found. Cannot download $GRADLE_JAR." >&2
        exit 1
    fi

    if [ $? -ne 0 ] || [ ! -f "$GRADLE_JAR" ]; then
        echo "Error: Failed to download $GRADLE_JAR." >&2
        exit 1
    fi
    echo "Successfully downloaded $GRADLE_JAR."
fi

# Determine Java Home (simplified for GitHub Actions environment)
if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME="/opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/17.0.17-10/x64"
fi

if [ -z "$JAVA_HOME" ]; then
  echo "Error: JAVA_HOME is not set." >&2
  exit 1
fi

CLASSPATH="$GRADLE_JAR"

exec "$JAVA_HOME/bin/java" -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
