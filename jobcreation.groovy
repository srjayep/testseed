#!/usr/bin/env groovy
def repoUrl = "https://github.com/srjayep/testseed.git"; //Repository UrL
pipelineJob("TestJenkinsfileJobCreation") { //JobName
  description("test job creation");
  definition {
    cpsScm {
      scriptPath("JenkinsFile"); //Path to Build Script
      scm {
        git {
          remote {
            url(repoUrl); //Git Repository
            branch("master");
          }
        }
      }
    }
  }
}
