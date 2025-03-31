// src/com/ec/Test.groovy
package com.ec

class Test {
    static void runTestsOnApp(String clusterName, String appPackage) {
        echo "Ejecutando pruebas de integración en la aplicación ${appPackage} desplegada en el clúster ${clusterName}"
        sh "kubectl --context=${clusterName} run tests --image=tests/${appPackage}"
    }
}
