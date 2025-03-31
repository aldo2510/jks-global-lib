// vars/auditAction.groovy
def call(String action, String user) {
    com.ec.Audit.logAction(action, user)
}
