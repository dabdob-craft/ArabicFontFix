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

if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME=`java-config --jre-home 2>/dev/null`
fi

if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME=`java-config --jdk-home 2>/dev/null`
fi

if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME=`readlink -f /usr/bin/java | sed "s:/bin/java::"`
fi

if [ -z "$JAVA_HOME" ]; then
  echo "Error: JAVA_HOME is not set." >&2
  exit 1
fi

CLASSPATH="$SCRIPT_DIR/gradle/wrapper/gradle-wrapper.jar"

exec "$JAVA_HOME/bin/java" -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
