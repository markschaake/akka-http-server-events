package example.akkwebsockets.webclient

import scalacss.Defaults._

object Styles extends BaseStyle {
  import dsl._

  val app = style(
    addClassName("app"),
    display.flex,
    flexDirection.column,
    height(100.%%),
    fontFamily := "monospace"
  )

  val header = style(
    backgroundColor.black,
    color.white,
    textAlign.center,
    unsafeChild("h1")(
      marginTop(6.px),
      marginBottom(6.px)
    )
  )

  val main = style(
    flexGrow(1),
    display.flex,
    height(100.%%)
  )

  val footer = style(
    height(60.px),
    backgroundColor.gray
  )

  val selectedNav = mixin(
    borderLeft(2.px, solid, black),
    borderRight(4.px, solid, black),
    backgroundColor(colors.lightGray)
  )

  val nav = style(
    width(150.px),
    backgroundColor(colors.lightGray),
    unsafeChild("ul")(
      padding.`0`,
      margin.`0`,
      unsafeChild("li")(
        listStyleType := "none",
        borderLeft(2.px, solid, colors.lightGray),
        borderRight(4.px, solid, colors.lightGray),
        &.hover(
          borderLeft(2.px, solid, black),
          borderRight(4.px, solid, black),
          backgroundColor(colors.lightGray)
        ),
        unsafeChild("a")(
          padding(4.px, 6.px),
          display.block,
          textDecoration := "none",
          color(colors.darkGray),
          &.hover(
            backgroundColor(colors.darkGray),
            color.white
          )
        )
      ),
      unsafeChild("li.active")(selectedNav)
    )
  )

  val content = style(
    flexGrow(1),
    padding(10.px)
  )
}
