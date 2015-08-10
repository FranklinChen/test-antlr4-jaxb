name := "antlr4-jaxb-demo"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/antlr4-jaxb-demo"))

startYear := Some(2015)

description := "Demo of using ANTLR 4 with JAXB"

version := "1.0.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.4" % Test
)

antlr4Settings

antlr4PackageName in Antlr4 := Some("com.franklinchen.antlr4")

antlr4GenVisitor in Antlr4 := true

javaSource in Antlr4 := (javaSource in Antlr4).value / "antlr4"

sourceManaged in xjc in Compile ~= (_ / "xjc")
