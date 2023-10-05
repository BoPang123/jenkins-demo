pipelineJob('oasis-job') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }

        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/BoPang123/NUS_DMSS_PracticeModule_Team3.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}