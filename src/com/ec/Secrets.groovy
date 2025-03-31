// src/com/ec/Secrets.groovy
package com.ec

class Secrets {
    static String fetchSecret(String secretName) {
        echo "Obteniendo secreto ${secretName}"
        return sh(script: "aws secretsmanager get-secret-value --secret-id ${secretName} --query SecretString --output text", returnStdout: true).trim()
    }
}
