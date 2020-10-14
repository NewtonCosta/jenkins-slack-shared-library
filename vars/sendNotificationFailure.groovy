// Send Slack build failed notification
def call() {
  sendNotifications(
    slackSendColor: "#FF0000",
    message: "FAILED"
  )
}