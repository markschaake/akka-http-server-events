enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.github.japgolly.scalajs-react" %%% "core" % "0.10.0",
  "com.github.japgolly.scalacss" %%% "core" % "0.3.1",
  "com.github.japgolly.scalacss" %%% "ext-react" % "0.3.1",
  "com.lihaoyi" %%% "upickle" % "0.3.6"
)

jsDependencies ++= Seq(
  "org.webjars.bower" % "react" % "0.14.3"
    /        "react-with-addons.js"
    minified "react-with-addons.min.js"
    commonJSName "React",

  "org.webjars.bower" % "react" % "0.14.3"
    /         "react-dom.js"
    minified  "react-dom.min.js"
    dependsOn "react-with-addons.js"
    commonJSName "ReactDOM"
)
