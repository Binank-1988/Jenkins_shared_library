def call() {
    withKubeConfig(credentialsId: 'k8s') {
        sh "kubectl apply -f deployment.yml"
    }
}
