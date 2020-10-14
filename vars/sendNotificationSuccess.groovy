// Send Slack build successful notification
def call() {
  sendNotifications(
    slackSendColor: "#00FF00",
    message: "SUCCESSFUL"
  )
}