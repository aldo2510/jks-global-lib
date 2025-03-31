def call(String sonarEnv = 'sonar-server', String projectKey, String projectName) {
    com.ec.SonarQube.runSonarQubeAnalysis(sonarEnv, projectKey, projectName)
}
