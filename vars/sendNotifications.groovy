// Send Slack and Mail build notification
def call(Map config = [:]) {
  slackSend (
    color: "${config.slackSendColor}",
    message: "${config.message}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})"
  )

  // send to email
  emailext (
    subject: "${config.message}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
    body: """<p>${config.message}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
<p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
    recipientProviders: [[$class: 'DevelopersRecipientProvider']]
  )
}