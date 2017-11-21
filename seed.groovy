node {
  stage ('Checkout') {
    git url: 'https://github.com/srjayep/testseed.git'
  }
  stage ('Generate Jobs') {
    jobDsl sandbox: false, targets: '*.groovy'
  }
}
