// src/com/ec/Monitor.groovy
package com.ec

class Monitor {
    static void monitorClusterMetrics(String clusterName) {
        echo "Monitorizando métricas del clúster ${clusterName} usando Prometheus"
        sh "prometheus query --context=${clusterName} 'cluster_cpu_usage'"
    }
}
