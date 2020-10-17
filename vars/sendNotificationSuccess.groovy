// Send Slack build successful notification
def call() {
  sendNotifications(
    slackSendColor: "good", //"#00FF00",
    message: "Hey good job. Code deployed SUCCESSFUL"
  )
}