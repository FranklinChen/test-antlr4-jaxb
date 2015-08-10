## antlr4-jaxb-demo

[![Build Status](https://travis-ci.org/FranklinChen/antlr4-jaxb-demo.png)](https://travis-ci.org/FranklinChen/antlr4-jaxb-demo)

To demonstrate an SBT plugin bug reported [here](https://github.com/sbt/sbt-xjc/issues/15).

## The workaround

I was told the workaround:

```
sourceManaged in xjc in Compile ~= (_ / "xjc")
```
