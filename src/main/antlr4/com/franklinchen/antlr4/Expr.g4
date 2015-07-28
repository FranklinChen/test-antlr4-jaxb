grammar Expr;

@header {

}

@members {

}

program
    :
        (expr ';')* EOF
    ;

expr
    :
        left=expr '*' right=expr # factor
    |
        left=expr '+' right=expr # term
    |
        INT                      # literal
    |
        '(' expr ')'             # paren
    ;

INT
    :
        [0-9]+
    ;

WS
    :
        [ \t\r\n]+
        -> skip
    ;
