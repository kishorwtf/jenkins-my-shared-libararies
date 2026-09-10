def call(){
  sh "/usr/bin/trivy fs . -o results.json"
}
