def call() {
    sh 'trivy image binank2000/youtube:latest > trivyimage.txt'
}
