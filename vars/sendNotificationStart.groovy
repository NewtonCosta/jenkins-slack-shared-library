// Send Slack build started notification
def call() {
  sendNotifications(
    slackSendColor: "#FFFF00",
    message: "STARTED"
  )
}