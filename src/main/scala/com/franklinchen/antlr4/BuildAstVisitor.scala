package com.franklinchen.antlr4

import com.franklinchen.ast._

/**
  Construct Ast for expr.
  */
class BuildAstVisitor extends ExprBaseVisitor[Expr] {
  import ExprParser._

  override def visitFactor(ctx: FactorContext) = {
    Times(visit(ctx.left), visit(ctx.right))
  }

  override def visitTerm(ctx: TermContext) = {
    Plus(visit(ctx.left), visit(ctx.right))
  }

  override def visitLiteral(ctx: LiteralContext) = {
    // TODO can fail.
    Literal(ctx.INT.getText.toInt)
  }

  override def visitParen(ctx: ParenContext) = {
    visit(ctx.expr)
  }
}
