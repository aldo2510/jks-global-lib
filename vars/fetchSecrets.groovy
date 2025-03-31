// vars/fetchSecrets.groovy
def call(String secretName) {
    return com.ec.Secrets.fetchSecret(secretName)
}
