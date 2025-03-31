// src/com/ec/Audit.groovy
package com.ec

class Audit {
    static void logAction(String action, String user) {
        echo "Auditoría: ${user} ha realizado la acción '${action}'"
        sh "echo '${user} realizó la acción ${action}' >> audit.log"
    }
}
