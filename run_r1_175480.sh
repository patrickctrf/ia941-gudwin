#!/usr/bin/env bash

# Lembrete: Configure o JDK 8 antes de rodar o script
# alias javac="/usr/lib/jvm/java-8-openjdk-amd64/bin/javac"
# alias java="/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java"
# JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64/"

# start WS3D env
./ws3d/build/distributions/ws3d-0.0.1/bin/ws3d &

# Wait until WS3D starts, then start R1 taks
sleep 10 && ./r1_175480/r1_175480/app/build/distributions/app/bin/app

echo "Tarefa R1 - Patrick de Carvalho Tavares Rezende Ferreira - RA: 175480"

