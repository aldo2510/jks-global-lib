// src/com/ec/Provision.groovy
package com.ec

class Provision {
    static void provisionCluster(String clusterName, String region, String instanceType) {
        echo "Provisionando el clúster ${clusterName} en la región ${region} con tipo de instancia ${instanceType}"
        sh "aws eks create-cluster --name ${clusterName} --region ${region} --nodegroup-name ${clusterName}-nodes --node-type ${instanceType}"
    }
}
