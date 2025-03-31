// src/com/ec/Deploy.groovy
package com.ec

class Deploy {
    static void deployToCluster(String clusterName, String appPackage) {
        echo "Desplegando la aplicación ${appPackage} en el clúster ${clusterName}"
        sh "kubectl --context=${clusterName} apply -f ${appPackage}"
    }
}
