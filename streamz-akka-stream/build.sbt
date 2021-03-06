name := "streamz-akka-stream"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % Version.Akka,
  "com.typesafe.akka" %% "akka-persistence-experimental" % Version.Akka,
  "com.typesafe.akka" %% "akka-stream-experimental" % Version.AkkaStream
)
