// vars/deployApp.groovy
def call(String clusterName, String appPackage) {
    com.ec.Deploy.deployToCluster(clusterName, appPackage)
}
