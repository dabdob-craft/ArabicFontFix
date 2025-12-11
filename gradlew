#!/usr/bin/env sh
PRG="$0"
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
exec "$SCRIPT_DIR/gradle/wrapper/gradle-wrapper.jar" "$@"
