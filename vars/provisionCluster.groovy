// vars/provisionCluster.groovy
def call(String clusterName, String region, String instanceType) {
    com.ec.Provision.provisionCluster(clusterName, region, instanceType)
}
