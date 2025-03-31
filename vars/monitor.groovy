// vars/monitor.groovy
def call(String clusterName) {
    com.ec.Monitor.monitorClusterMetrics(clusterName)
}
