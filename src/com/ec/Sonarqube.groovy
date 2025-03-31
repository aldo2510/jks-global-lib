package com.ec

class SonarQube {
    static void runSonarQubeAnalysis(String sonarEnv, String projectKey, String projectName) {
        withSonarQubeEnv(sonarEnv) {
            sh """
                mvn clean package org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
                    -Dsonar.projectKey=${projectKey} \
                    -Dsonar.projectName=${projectName} \
                    -Dsonar.sources=src/main \
                    -Dsonar.sourceEncoding=UTF-8 \
                    -Dsonar.language=java \
                    -Dsonar.tests=src/test \
                    -Dsonar.junit.reportsPath=target/surefire-reports \
                    -Dsonar.surefire.reportsPath=target/surefire-reports \
                    -Dsonar.jacoco.reportPath=target/jacoco.exec \
                    -Dsonar.java.binaries=target/classes \
                    -Dsonar.java.coveragePlugin=jacoco \
                    -Dsonar.coverage.jacoco.xmlReportPaths=target/jacoco.xml \
                    -Dsonar.exclusions=**/*IT.java,**/*TEST.java,**/*Test.java,**/src/it**,**/src/test**,**/gradle/wrapper** \
                    -Dsonar.java.libraries=target/*.jar
            """
        }
    }
}
