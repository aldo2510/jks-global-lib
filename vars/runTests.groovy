// vars/runTests.groovy
def call(String clusterName, String appPackage) {
    com.ec.Test.runTestsOnApp(clusterName, appPackage)
}
